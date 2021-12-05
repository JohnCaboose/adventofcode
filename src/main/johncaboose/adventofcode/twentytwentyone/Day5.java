package johncaboose.adventofcode.twentytwentyone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Day5 implements ISolvableDay {

    private record LineSegment(VentCoordinate start, VentCoordinate end) {

        @Override
        public String toString() {
            return start + " -> " + end;
        }

        public boolean isStraight() {
            return isHorizontal() || isVertical();
        }

        public boolean isHorizontal() {
            return start.x == end.x;
        }

        public boolean isVertical() {
            return start.y == end.y;
        }

        /**
         * @param includeDiagonal true to include coordinates in diagonal lines, false to exclude them
         * @return list of all coordinates in the line
         */
        public List<VentCoordinate> allCoordinates(boolean includeDiagonal) {
            List<VentCoordinate> coordinates = new ArrayList<>();

            if (includeDiagonal || isStraight()) {
                List<Integer> xCoordinates = rangeClosed(start.x, end.x);
                List<Integer> yCoordinates = rangeClosed(start.y, end.y);

                int maxSize = max(xCoordinates.size(), yCoordinates.size());

                if (xCoordinates.size() == 1) {
                    xCoordinates = Collections.nCopies(maxSize, start.x);
                }

                if (yCoordinates.size() == 1) {
                    yCoordinates = Collections.nCopies(maxSize, start.y);
                }

                //Now x and y are the same size, combine them to coordinates and return
                for (int i = 0; i < maxSize; i++) {
                    coordinates.add(new VentCoordinate(xCoordinates.get(i), yCoordinates.get(i)));
                }

            }

            return coordinates;
        }

        private static List<Integer> rangeClosed(int start, int end) {
            List<Integer> values = IntStream.rangeClosed(min(start, end), max(start, end))
                    .boxed()
                    .collect(Collectors.toList());
            if (start > end) {
                Collections.reverse(values);
            }
            return values;
        }
    }


    private record VentCoordinate(int x, int y) {
        @Override
        public String toString() {
            return x + "," + y;
        }
    }


    private List<LineSegment> readAllLineSegments(String input) {
        List<LineSegment> segments = new ArrayList<>();
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //Assume line well-formed
                String[] coordinateStrings = line.split("->");

                VentCoordinate start = readCoordinate(coordinateStrings[0]);
                VentCoordinate end = readCoordinate(coordinateStrings[1]);

                segments.add(new LineSegment(start, end));
            }
        }
        return segments;
    }

    private VentCoordinate readCoordinate(String coordinateString) {
        String[] numbers = coordinateString.split(",");
        int x = Integer.parseInt(numbers[0].trim());
        int y = Integer.parseInt(numbers[1].trim());
        return new VentCoordinate(x, y);
    }


    private static class Counter {
        private int count = 0;

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    @Override
    public long partOneSolver(String input) {
        return solve(input, false);
    }

    @Override
    public long partTwoSolver(String input) {
        return solve(input, true);
    }

    private long solve(String input, boolean includeDiagonal) {
        List<LineSegment> lineSegments = readAllLineSegments(input);

        Utils.ExtendedMap<VentCoordinate, Counter> allVentCoordinates = new Utils.ExtendedHashMap<>();

        lineSegments.stream()
                .flatMap(lineSegment -> lineSegment.allCoordinates(includeDiagonal).stream())
                .forEach(ventCoordinate -> allVentCoordinates.getOrStoreDefault(ventCoordinate, new Counter()).increment());

        long overlappingPoints = allVentCoordinates.entrySet()
                .stream()
                .filter(entry -> entry.getValue().getCount() > 1)
                .map(entry -> entry.getKey())
                .count();

        return overlappingPoints;
    }
}

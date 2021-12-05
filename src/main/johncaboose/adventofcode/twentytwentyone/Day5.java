package johncaboose.adventofcode.twentytwentyone;

import java.util.ArrayList;
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
         * @return modifiable list of all coordinates between start and end (inclusive),
         * or an unmodifiable empty list if line is not straight.
         */
        public List<VentCoordinate> allCoordinates() {
            List<VentCoordinate> coordinates = new ArrayList<>();


            if (isHorizontal()) {

                List<Integer> yValues = IntStream.rangeClosed(min(start.y, end.y), max(start.y, end.y))
                        .boxed()
                        .collect(Collectors.toList());
                for (int y : yValues) {
                    coordinates.add(new VentCoordinate(start.x(), y));
                }
            } else if (isVertical()) {
                List<Integer> xValues = IntStream.rangeClosed(min(start.x, end.x), max(start.x, end.x))
                        .boxed()
                        .collect(Collectors.toList());
                for (int x : xValues) {
                    coordinates.add(new VentCoordinate(x, start.y));
                }
            }
            return coordinates;
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
        List<LineSegment> lineSegments = readAllLineSegments(input);

        Utils.ExtendedMap<VentCoordinate, Counter> allVentCoordinates = new Utils.ExtendedHashMap<>();

        lineSegments.stream()
                .flatMap(lineSegment -> lineSegment.allCoordinates().stream())
                .forEach(ventCoordinate -> allVentCoordinates.getOrStoreDefault(ventCoordinate, new Counter()).increment());

        long overlappingPoints = allVentCoordinates.entrySet()
                .stream()
                .filter(entry -> entry.getValue().getCount() > 1)
                .map(entry -> entry.getKey())
                .count();

        return overlappingPoints;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }
}

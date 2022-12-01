package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;

class Day13 implements ISolvableDay {


    @Override
    public long partOneSolver(String input) {
        Set<Coordinate> coordinates = new HashSet<>();
        List<FoldingInstruction> foldingInstructions = new ArrayList<>();
        populateListsFromInput(input, coordinates, foldingInstructions);

        HashSet<Coordinate> result = new HashSet<>(coordinates);
        fold(result, foldingInstructions.get(0));

        String originalPaper = paperString(coordinates);
        String paper = paperString(result);

        return result.size();
    }

    @Override
    public long partTwoSolver(String input) {
        Set<Coordinate> coordinates = new HashSet<>();
        List<FoldingInstruction> foldingInstructions = new ArrayList<>();
        populateListsFromInput(input, coordinates, foldingInstructions);

        for (FoldingInstruction instruction : foldingInstructions) {
            fold(coordinates, instruction);
        }

        String paper = paperString(coordinates);

        return coordinates.size();
    }

    private String paperString(Set<Coordinate> coordinates) {
        StringBuilder sb = new StringBuilder();
        int maxX = coordinates.stream()
                .mapToInt(Coordinate::x)
                .max()
                .orElseThrow();
        int maxY = coordinates.stream()
                .mapToInt(Coordinate::y)
                .max()
                .orElseThrow();

        for (int y = 0; y <= maxY; y++) {
            for (int x = 0; x <= maxX; x++) {
                if (coordinates.contains(new Coordinate(x, y))) {
                    sb.append("#");
                } else {
                    sb.append(".");
                }
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    private static void fold(Set<Coordinate> coordinates, FoldingInstruction foldingInstruction) {
        boolean xAxisUsed = foldingInstruction.axis.equals(Axis.X);

        int foldAlong = foldingInstruction.foldAlong();
        List<Coordinate> coordinatesToMove = coordinates.stream()
                .filter(xAxisUsed ?
                        (coordinate) -> coordinate.x() > foldAlong :
                        (coordinate) -> coordinate.y() > foldAlong)
                .toList();

        List<Coordinate> unalteredCoordinates = coordinates.stream()
                .filter(coordinate -> !coordinatesToMove.contains(coordinate))
                .toList();

        Set<Coordinate> result = new HashSet<>(unalteredCoordinates);
        for (Coordinate coordinate : coordinatesToMove) {
            if (xAxisUsed) {
                int newX = foldAlong - (coordinate.x() - foldAlong);
                result.add(new Coordinate(newX, coordinate.y()));
            } else {
                int newY = foldAlong - (coordinate.y() - foldAlong);
                result.add(new Coordinate(coordinate.x(), newY));
            }
        }

        coordinates.clear();
        coordinates.addAll(result);

    }


    private static void populateListsFromInput(String input, Set<Coordinate> coordinates, List<FoldingInstruction> foldingInstructions) {
        try (Scanner scanner = new Scanner(input)) {
            boolean lineContainsFoldingInstruction = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length() == 0) {
                    lineContainsFoldingInstruction = true;
                    continue;
                }

                if (lineContainsFoldingInstruction) {
                    Axis axis = line.contains("x") ? Axis.X : Axis.Y;
                    int foldAlong = Integer.parseInt(line.split("=")[1]);
                    FoldingInstruction instruction = new FoldingInstruction(axis, foldAlong);
                    foldingInstructions.add(instruction);
                } else {
                    Coordinate coordinate = new Coordinate(line);
                    coordinates.add(coordinate);
                }

            }
        }
    }

    private enum Axis {
        X,
        Y
    }

    private record FoldingInstruction(Axis axis, int foldAlong) {

    }


}

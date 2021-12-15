package com.johncaboose.adventofcode.twentytwentyone.twentytwentyone;

import java.util.*;

public class Day11 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        OctopusGrid octopusGrid = new OctopusGrid(input);
        long amountOfFlashes = step(octopusGrid, 100);
        return amountOfFlashes;
    }

    @Override
    public long partTwoSolver(String input) {
        OctopusGrid octopusGrid = new OctopusGrid(input);
        int stepCount = 0;
        while (true) {
            stepCount++;
            long amountOfFlashes = step(octopusGrid, 1);
            if (amountOfFlashes == octopusGrid.grid.size()) {
                break;
            }
        }
        return stepCount;
    }

    private record Coordinate(int x, int y) {
        public Coordinate(Coordinate other) {
            this(other.x, other.y);
        }
    }

    private static class OctopusGrid {
        private final HashMap<Coordinate, Integer> grid = new HashMap<>();
        private int lastX = 0;
        private int lastY = 0;

        public OctopusGrid(OctopusGrid other) {
            other.grid.entrySet().stream().forEach(entry -> {
                grid.put(new Coordinate(entry.getKey()), entry.getValue());
            });
            lastX = other.lastX;
            lastY = other.lastY;
        }

        public OctopusGrid(String input) {
            try (Scanner scanner = new Scanner(input)) {
                int x = 0;

                while (scanner.hasNextLine()) {
                    lastX = x;
                    String line = scanner.nextLine();
                    for (int y = 0; y < line.length(); y++) {
                        lastY = y;
                        int value = Character.getNumericValue(line.charAt(y));
                        grid.put(new Coordinate(x, y), value);
                    }

                    x++;
                }

            }
        }

        public void increment() {
            for (Map.Entry<Coordinate, Integer> entry : grid.entrySet()) {
                grid.put(entry.getKey(), entry.getValue() + 1);
            }
        }

        private void increment(Collection<Coordinate> coordinates) {
            for (Coordinate coordinate : coordinates) {
                int current = grid.get(coordinate);
                grid.put(coordinate, current + 1);
            }
        }

        private List<Coordinate> nonZeroNeighbours(Coordinate coordinate) {
            List<Coordinate> neighbourCoordinates = new ArrayList<>();
            for (int x = -1; x <= 1; x++) {
                for (int y = -1; y <= 1; y++) {
                    if (x == 0 && y == 0) {
                        // Ignore the same coordinate
                    } else {
                        neighbourCoordinates.add(new Coordinate(coordinate.x + x, coordinate.y + y));

                    }
                }
            }

            List<Coordinate> nonZeroNeighbours = neighbourCoordinates.stream()
                    .filter(c -> {
                        Integer currentValue = grid.get(c);
                        return currentValue != null && currentValue > 0;
                    })
                    .toList();

            return nonZeroNeighbours;
        }


        public boolean canFlash() {
            return grid.values()
                    .stream()
                    .anyMatch(energyLevel -> energyLevel > 9);
        }

        public long flash() {
            List<Coordinate> flashReadyCoordinates = grid.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() > 9)
                    .map(entry -> entry.getKey())
                    .toList();

            for (Coordinate coordinate : flashReadyCoordinates) {
                grid.put(coordinate, 0);
            }

            List<Coordinate> neighboursToIncrement = new ArrayList<>();
            for (Coordinate coordinate : flashReadyCoordinates) {
                List<Coordinate> nonZeroNeighbours = nonZeroNeighbours(coordinate);
                neighboursToIncrement.addAll(nonZeroNeighbours);
            }

            increment(neighboursToIncrement);

            int amountOfFlashes = flashReadyCoordinates.size();
            return amountOfFlashes;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x <= lastX; x++) {
                for (int y = 0; y <= lastY; y++) {
                    sb.append(Integer.toHexString(grid.get(new Coordinate(x, y))));
                }
                sb.append("\n");
            }
            return sb.toString();
        }

    }


    private long step(OctopusGrid octopusGrid, int amountOfSteps) {
        long amountOfFlashes = 0;
        for (int i = 0; i < amountOfSteps; i++) {
            octopusGrid.increment();
            while (octopusGrid.canFlash()) {
                amountOfFlashes += octopusGrid.flash();
            }
        }
        return amountOfFlashes;
    }


}

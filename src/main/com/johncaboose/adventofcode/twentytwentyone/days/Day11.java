package com.johncaboose.adventofcode.twentytwentyone.days;

import com.johncaboose.adventofcode.shared.AbstractGrid;
import com.johncaboose.adventofcode.shared.Coordinate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Day11 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        OctopusGrid octopusGrid = new OctopusGrid(input);
        long amountOfFlashes = octopusGrid.step(100);
        return amountOfFlashes;
    }

    @Override
    public long partTwoSolver(String input) {
        OctopusGrid octopusGrid = new OctopusGrid(input);
        int stepCount = 0;
        while (true) {
            stepCount++;
            long amountOfFlashes = octopusGrid.step(1);
            if (amountOfFlashes == octopusGrid.size()) {
                break;
            }
        }
        return stepCount;
    }


    private static class OctopusGrid extends AbstractGrid<Integer> {

        public OctopusGrid(AbstractGrid<? extends Integer> other) {
            super(other);
        }

        public OctopusGrid(String input) {
            super(input);
        }

        @Override
        public Integer valueOf(char character) {
            return Character.getNumericValue(character);
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
                        neighbourCoordinates.add(new Coordinate(coordinate.x() + x, coordinate.y() + y));
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


        private long step(int amountOfSteps) {
            long amountOfFlashes = 0;
            for (int i = 0; i < amountOfSteps; i++) {
                increment();
                while (canFlash()) {
                    amountOfFlashes += flash();
                }
            }
            return amountOfFlashes;
        }
    }


}

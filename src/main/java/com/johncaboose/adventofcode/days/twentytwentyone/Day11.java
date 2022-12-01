package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.IntegerGrid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class Day11 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        OctopusGrid octopusGrid = new OctopusGrid(input);
        return octopusGrid.step(100); // amount of flashes
    }

    @Override
    public long partTwoSolver(String input) {
        OctopusGrid octopusGrid = new OctopusGrid(input);
        while (true) {
            long amountOfFlashes = octopusGrid.step(1);
            if (amountOfFlashes == octopusGrid.size()) {
                break;
            }
        }
        return octopusGrid.getStepsTaken();
    }

    private static class OctopusGrid extends IntegerGrid {

        private long stepsTaken = 0;

        public OctopusGrid(String input) {
            super(input);
        }

        public long getStepsTaken() {
            return stepsTaken;
        }

        public void increment() {
            grid.replaceAll((k, v) -> v + 1);
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
                    // Ignore the same coordinate!
                    if (!(x == 0 && y == 0)) {
                        neighbourCoordinates.add(new Coordinate(coordinate.x() + x, coordinate.y() + y));
                    }
                }
            }

            return neighbourCoordinates.stream()
                    .filter(c -> {
                        Integer currentValue = grid.get(c);
                        return currentValue != null && currentValue > 0;
                    })
                    .toList();
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
                    .map(Map.Entry::getKey)
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

            return flashReadyCoordinates.size();
        }


        private long step(int amountOfSteps) {
            long amountOfFlashes = 0;
            for (int i = 0; i < amountOfSteps; i++) {
                increment();
                while (canFlash()) {
                    amountOfFlashes += flash();
                }
            }
            stepsTaken++;
            return amountOfFlashes;
        }
    }


}

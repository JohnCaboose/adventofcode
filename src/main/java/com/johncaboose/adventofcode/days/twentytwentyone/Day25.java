package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.AbstractGrid;
import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

class Day25 implements ISolvableDay<Long> {
    @Override
    public Long partOneSolver(String input) {
        CucumberGrid cucumberGrid = new CucumberGrid(input);

        boolean movementPerformed;
        do {
            movementPerformed = cucumberGrid.step();
        } while (movementPerformed);

        return cucumberGrid.getStepsTaken();
    }

    @Override
    public Long partTwoSolver(String input) {
        return 0L;
    }

    private static class CucumberGrid extends AbstractGrid<RegionContent> {

        private long stepsTaken = 0;

        public CucumberGrid(String input) {
            super(input);
        }

        @Override
        public RegionContent valueOf(char character) {
            return RegionContent.fromChar(character);
        }

        public long getStepsTaken() {
            return stepsTaken;
        }

        public boolean step() {
            Map<Coordinate, RegionContent> nextState = new HashMap<>();
            AtomicBoolean anythingMoved = new AtomicBoolean(false);

            Set<Coordinate> untouchedCoordinates = new HashSet<>(grid.keySet());

            // First move all eastbound
            grid.forEach((coordinate, content) -> {
                if (content.equals(RegionContent.EAST_CUCUMBER)) {
                    Coordinate nextCoordinate = new Coordinate((coordinate.x() + 1) % getXBoundExclusive(), coordinate.y());
                    moveCucumber(grid, nextCoordinate, coordinate, anythingMoved, nextState, content, untouchedCoordinates);
                }
            });

            // Construct mid-move result, where all eastbound have moved but no southbound
            Map<Coordinate, RegionContent> midMoveResult = new HashMap<>(nextState);
            grid.forEach((coordinate, content) -> {
                if (content.equals(RegionContent.SOUTH_CUCUMBER)) {
                    midMoveResult.put(coordinate, content);
                }
            });
            untouchedCoordinates.forEach(coordinate -> midMoveResult.putIfAbsent(coordinate, RegionContent.EMPTY));


            // Second move all south-bound
            grid.forEach((coordinate, content) -> {
                if (content.equals(RegionContent.SOUTH_CUCUMBER)) {
                    Coordinate nextCoordinate = new Coordinate(coordinate.x(), (coordinate.y() + 1) % getYBoundExclusive());
                    moveCucumber(midMoveResult, nextCoordinate, coordinate, anythingMoved, nextState, content, untouchedCoordinates);
                }
            });

            // Finally set all the other spaces to empty
            untouchedCoordinates.forEach(coordinate -> nextState.put(coordinate, RegionContent.EMPTY));

            // Update state to the new... state
            grid.clear();
            grid.putAll(nextState);

            stepsTaken++;
            return anythingMoved.get();
        }

        private static void moveCucumber(Map<Coordinate, RegionContent> state, Coordinate nextCoordinate, Coordinate coordinate, AtomicBoolean anythingMoved, Map<Coordinate, RegionContent> nextState, RegionContent content, Set<Coordinate> shouldBeEmpty) {
            boolean move = !nextState.containsKey(nextCoordinate) && RegionContent.EMPTY.equals(state.get(nextCoordinate));
            Coordinate coordinateToUse = move ? nextCoordinate : coordinate;

            anythingMoved.compareAndSet(false, move);

            nextState.put(coordinateToUse, content);
            shouldBeEmpty.remove(coordinateToUse);
        }
    }


    private enum RegionContent {
        EAST_CUCUMBER,
        SOUTH_CUCUMBER,
        EMPTY;

        public static RegionContent fromChar(char regionContent) {
            return switch (regionContent) {
                case '>' -> EAST_CUCUMBER;
                case 'v' -> SOUTH_CUCUMBER;
                case '.' -> EMPTY;
                default -> throw new IllegalArgumentException("Cannot recognize RegionContent from provided char");
            };
        }

        @Override
        public String toString() {
            return switch (this) {
                case EAST_CUCUMBER -> ">";
                case SOUTH_CUCUMBER -> "v";
                case EMPTY -> ".";
            };
        }


    }

}

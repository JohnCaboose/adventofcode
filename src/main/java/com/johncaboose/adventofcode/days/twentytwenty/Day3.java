package com.johncaboose.adventofcode.days.twentytwenty;

import com.johncaboose.adventofcode.shared.AbstractGrid;
import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.Couple;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.List;

class Day3 implements ISolvableDay<Long> {

    @Override
    public Long partOneSolver(String input) {
        TreeGrid grid = new TreeGrid(input);
        int velocityDown = 1;
        int velocityRight = 3;

        return treesHit(grid, velocityDown, velocityRight);
    }

    private long treesHit(TreeGrid grid, int velocityDown, int velocityRight) {
        boolean endHit = false;
        while (!endHit) {
            endHit = grid.step(velocityRight, velocityDown);
        }

        return grid.treesHit;
    }

    @Override
    public Long partTwoSolver(String input) {
        TreeGrid grid = new TreeGrid(input);
        long result = 1;
        List<Couple<Integer, Integer>> velocities = List.of(
                new Couple<>(1, 1),
                new Couple<>(3, 1),
                new Couple<>(5, 1),
                new Couple<>(7, 1),
                new Couple<>(1, 2)
        );

        for (Couple<Integer, Integer> velocity : velocities) {
            long treesHit = treesHit(grid, velocity.second(), velocity.first());
            result *= treesHit;
            grid = new TreeGrid(grid);
        }

        return result;
    }

    private enum MapContent {
        EMPTY,
        TREE;

        public static MapContent valueOf(char content) {
            return switch (content) {
                case '.' -> EMPTY;
                case '#' -> TREE;
                default -> throw new IllegalArgumentException("Unrecognizable MapContent");
            };
        }

        @Override
        public String toString() {
            return switch (this) {
                case EMPTY -> ".";
                case TREE -> "#";
            };
        }
    }

    private static class TreeGrid extends AbstractGrid<MapContent> {
        private Coordinate currentPosition = new Coordinate(0, 0);
        private int treesHit = 0;

        public TreeGrid(AbstractGrid<? extends MapContent> other) {
            super(other);
        }

        public TreeGrid(String input) {
            super(input);
        }

        @Override
        public MapContent valueOf(char character) {
            return MapContent.valueOf(character);
        }

        public boolean step(int xVelocity, int yVelocity) {
            int newX = currentPosition.x() + xVelocity;
            int newY = currentPosition.y() + yVelocity;

            if (newY > lastY) {
                return true;
            }

            currentPosition = new Coordinate(newX % getXBoundExclusive(), newY);

            if (grid.get(currentPosition).equals(MapContent.TREE)) {
                treesHit++;
            }

            return false;
        }

    }
}

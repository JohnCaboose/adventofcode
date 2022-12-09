package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.IntegerGrid;
import com.johncaboose.adventofcode.shared.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Day8 implements ISolvableDay<Long> {

    @Override
    public Long partOneSolver(String input) {
        Forest forest = new Forest(input);

        return forest.visibleFromOutside();
    }

    @Override
    public Long partTwoSolver(String input) {
        Forest forest = new Forest(input);

        return forest.maxViewingScore();
    }

    private static class Forest extends IntegerGrid {

        public Forest(String input) {
            super(input);
        }

        public long visibleFromOutside() {
            return allVectorsToCheck().stream()
                    .map(ForestVector::visible)
                    .flatMap(List::stream)
                    .distinct()
                    .count();
        }

        private List<ForestVector> allVectorsToCheck() {
            List<ForestVector> rows = getRows();
            List<ForestVector> columns = getColumns();
            List<ForestVector> vectors = Utils.concatLists(rows, columns);

            List<ForestVector> reversed = vectors.stream()
                    .map(forestVector -> new ForestVector(Utils.reversedShallowCopy(forestVector.trees)))
                    .toList();

            return Utils.concatLists(vectors, reversed);
        }

        private List<ForestVector> getRows() {
            List<ForestVector> vectors = new ArrayList<>();
            for (int x = 0; x < getXBoundExclusive(); x++) {
                List<Tree> trees = new ArrayList<>();
                for (int y = 0; y < getYBoundExclusive(); y++) {
                    Coordinate coordinate = new Coordinate(x, y);
                    trees.add(new Tree(coordinate, grid.get(coordinate)));
                }
                vectors.add(new ForestVector(trees));
            }
            return vectors;
        }

        private List<ForestVector> getColumns() {
            List<ForestVector> vectors = new ArrayList<>();
            for (int y = 0; y < getYBoundExclusive(); y++) {
                List<Tree> trees = new ArrayList<>();
                for (int x = 0; x < getXBoundExclusive(); x++) {
                    Coordinate coordinate = new Coordinate(x, y);
                    trees.add(new Tree(coordinate, grid.get(coordinate)));
                }
                vectors.add(new ForestVector(trees));
            }
            return vectors;
        }

        public long maxViewingScore() {
            return grid.keySet()
                    .stream()
                    .mapToLong(this::viewingScore)
                    .max()
                    .orElse(-1);
        }

        private long viewingScore(Coordinate c) {
            int cx = c.x();
            int cy = c.y();
            if (cx == 0 || cy == 0 || cx == lastX || cy == lastY) {
                // At the edge the score is always 0
                return 0;
            }

            int treeHeight = grid.get(c);
            long up = viewDistanceUp(c, treeHeight);
            long down = viewDistanceDown(c, treeHeight);
            long left = viewDistanceLeft(c, treeHeight);
            long right = viewDistanceRight(c, treeHeight);

            return up * down * left * right;
        }

        private long viewDistanceUp(Coordinate c, int treeHeight) {
            long count = 0;
            for (int y = c.y() - 1; y >= 0; y--) {
                count++;
                Coordinate coordinate = new Coordinate(c.x(), y);
                if (grid.get(coordinate) >= treeHeight) {
                    //this is last visible
                    break;
                }
            }
            return count;
        }

        private long viewDistanceDown(Coordinate start, int treeHeight) {
            long count = 0;
            for (int y = start.y() + 1; y <= lastY; y++) {
                count++;
                Coordinate coordinate = new Coordinate(start.x(), y);
                if (grid.get(coordinate) >= treeHeight) {
                    //this is last visible
                    break;
                }
            }
            return count;
        }

        private long viewDistanceLeft(Coordinate start, int treeHeight) {
            long count = 0;
            for (int x = start.x() - 1; x >= 0; x--) {
                count++;
                Coordinate coordinate = new Coordinate(x, start.y());
                if (grid.get(coordinate) >= treeHeight) {
                    //this is last visible
                    break;
                }
            }
            return count;
        }

        private long viewDistanceRight(Coordinate start, int treeHeight) {
            long count = 0;
            for (int x = start.x() + 1; x <= lastX; x++) {
                count++;
                Coordinate coordinate = new Coordinate(x, start.y());
                if (grid.get(coordinate) >= treeHeight) {
                    //this is last visible
                    break;
                }
            }
            return count;
        }

    }

    private record Tree(Coordinate coordinate, Integer height) {

    }

    private record ForestVector(List<Tree> trees) {

        public List<Coordinate> visible() {
            List<Coordinate> visible = new ArrayList<>();
            long highestEncounteredHeight = -1;
            for (Tree tree : trees) {
                if (tree.height() > highestEncounteredHeight) {
                    visible.add(tree.coordinate());
                    highestEncounteredHeight = tree.height();
                }
            }
            return visible;
        }

        @Override
        public String toString() {
            return trees.stream()
                    .map(Tree::height)
                    .map(String::valueOf)
                    .collect(Collectors.joining(""));
        }
    }
}

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

        return forest.allVectorsToCheck()
                .stream()
                .map(ForestVector::visible)
                .flatMap(List::stream)
                .distinct()
                .count();
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

        public List<ForestVector> allVectorsToCheck() {

            List<ForestVector> all = new ArrayList<>(getRows());
            all.addAll(getColumns());

            List<ForestVector> reversed = all.stream()
                    .map(ForestVector::reverse)
                    .toList();

            all.addAll(reversed);

            return all;
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

        public long viewingScore(Coordinate c) {
            int cx = c.x();
            int cy = c.y();
            if (cx == 0 || cy == 0 || cx == lastX || cy == lastY) {
                // At the edge the score is always 0
                return 0;
            }

            int treeHeight = grid.get(c);
            long top = partScoreY(cy, 0, cx, treeHeight);
            long bottom = partScoreY(cy, lastY, cx, treeHeight);
            long left = partScoreX(cx, 0, cy, treeHeight);
            long right = partScoreX(cx, lastX, cy, treeHeight);

            return top * bottom * left * right;
        }

        private long partScoreX(int startX, int endX, int y, int treeHeight) {
            boolean increases = startX < endX;
            int modifier = increases ? 1 : -1;

            long count = 0;
            for (int x = startX; increases ? x <= endX : x >= endX; x += modifier) {
                if (x == startX) {
                    continue;
                }
                count++;
                Coordinate c = new Coordinate(x, y);
                if (grid.get(c) >= treeHeight) {
                    //this is last visible
                    break;
                }
            }

            return count;
        }

        private long partScoreY(int startY, int endY, int x, int treeHeight) {
            boolean increases = startY < endY;
            int modifier = increases ? 1 : -1;

            long count = 0;
            for (int y = startY; increases ? y <= endY : y >= endY; y += modifier) {
                if (y == startY) {
                    continue;
                }
                count++;
                Coordinate c = new Coordinate(x, y);
                if (grid.get(c) >= treeHeight) {
                    //this is last visible
                    break;
                }
            }

            return count;
        }

        public long maxViewingScore() {
            Forest forest = this;
            return grid.keySet()
                    .stream()
                    .mapToLong(forest::viewingScore)
                    .max()
                    .orElse(-1);
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

        public ForestVector reverse() {
            return new ForestVector(Utils.reversedShallowCopy(trees));
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

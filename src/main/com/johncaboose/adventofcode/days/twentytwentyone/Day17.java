package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Day17 implements ISolvableDay {

    private static final Coordinate START_COORDINATE = new Coordinate(0, 0);

    @Override
    public long partOneSolver(String input) {
        Set<Velocity> validVelocities = new HashSet<>();
        int highestY = highestY(input, validVelocities);

        return highestY;
    }

    @Override
    public long partTwoSolver(String input) {
        Set<Velocity> validVelocities = new HashSet<>();
        int highestY = highestY(input, validVelocities);

        return validVelocities.size();
    }

    private static int highestY(String input, Set<Velocity> validVelocities) {
        Set<Coordinate> targetArea = readTargetArea(input);
        Coordinate topLeft = getTopLeftCoordinate(targetArea);
        Coordinate bottomRight = getBottomRightCoordinate(targetArea);

        int highestY = highestY(START_COORDINATE, targetArea, topLeft, bottomRight, validVelocities);
        return highestY;
    }

    private static Coordinate getTopLeftCoordinate(Set<Coordinate> targetArea) {
        int x = targetArea.stream()
                .mapToInt(Coordinate::x)
                .min()
                .getAsInt();
        int y = targetArea.stream()
                .mapToInt(Coordinate::y)
                .max()
                .getAsInt();
        Coordinate topLeft = new Coordinate(x, y);
        return topLeft;
    }

    private static Coordinate getBottomRightCoordinate(Set<Coordinate> targetArea) {
        int x = targetArea.stream()
                .mapToInt(Coordinate::x)
                .max()
                .getAsInt();
        int y = targetArea.stream()
                .mapToInt(Coordinate::y)
                .min()
                .getAsInt();
        Coordinate bottomRight = new Coordinate(x, y);
        return bottomRight;
    }

    private static int highestY(Coordinate startCoordinate, Set<Coordinate> targetArea,
                                Coordinate topLeft, Coordinate bottomRight, Set<Velocity> validVelocities) {

        int minimumXRequiredToReachTarget = getMinimumXRequiredToReachTarget(startCoordinate, topLeft);

        int highestYFound = Integer.MIN_VALUE;


        for (int y = bottomRight.y(); y <= Math.abs(bottomRight.y()); y++) {

            for (int x = minimumXRequiredToReachTarget; x <= bottomRight.x(); x++) {
                Velocity velocity = new Velocity(x, y);
                Coordinate currentCoordinate = startCoordinate;
                int highestYForThisStartVelocity = Integer.MIN_VALUE;
                boolean wasInsideTargetArea = false;
                while (!passedTargetArea(currentCoordinate, bottomRight)) {
                    if (currentCoordinate.y() > highestYForThisStartVelocity) {
                        highestYForThisStartVelocity = currentCoordinate.y();
                    }
                    if (insideTargetArea(targetArea, currentCoordinate)) {
                        wasInsideTargetArea = true;
                        break;
                    }
                    currentCoordinate = velocity.step(currentCoordinate);
                }

                if (wasInsideTargetArea) {
                    if (highestYForThisStartVelocity > highestYFound) {
                        highestYFound = highestYForThisStartVelocity;
                    }
                    validVelocities.add(new Velocity(x, y));
                }
            }

        }


        return highestYFound;
    }

    private static int getMinimumXRequiredToReachTarget(Coordinate startCoordinate, Coordinate topLeft) {
        int minimumXRequiredToReachTarget = Integer.MIN_VALUE;
        for (int x = 0; minimumXRequiredToReachTarget == Integer.MIN_VALUE; x++) {
            Coordinate currentCoordinate = startCoordinate;
            Velocity velocity = new Velocity(x, 0);
            do {
                currentCoordinate = velocity.step(currentCoordinate);
                if (reachedTargetAreaX(currentCoordinate, topLeft)) {
                    minimumXRequiredToReachTarget = x;
                    break;
                }
            } while (velocity.getX() > 0);
        }
        return minimumXRequiredToReachTarget;
    }

    private static boolean insideTargetArea(Set<Coordinate> targetArea, Coordinate currentCoordinate) {
        boolean inside = targetArea.contains(currentCoordinate);
        return inside;
    }

    private static boolean passedTargetArea(Coordinate currentCoordinate, Coordinate bottomRight) {
        boolean hasGonePastInY = currentCoordinate.y() < bottomRight.y();
        return hasGonePastInY || passedTargetAreaX(currentCoordinate, bottomRight);
    }

    private static boolean passedTargetAreaX(Coordinate currentCoordinate, Coordinate bottomRight) {
        boolean hasGonePastInX = currentCoordinate.x() > bottomRight.x();
        return hasGonePastInX;
    }

    private static boolean reachedTargetAreaX(Coordinate currentCoordinate, Coordinate topLeft) {
        boolean hasReachedTargetAreaX = currentCoordinate.x() >= topLeft.x();
        return hasReachedTargetAreaX;
    }


    private static Set<Coordinate> readTargetArea(String input) {
        Pattern pattern = Pattern.compile(".*x=(.*)\\.\\.(.*), y=(.*)\\.\\.(.*)");
        Matcher matcher = pattern.matcher(input);
        matcher.matches();

        int startX = Integer.parseInt(matcher.group(1));
        int endX = Integer.parseInt(matcher.group(2));
        int startY = Integer.parseInt(matcher.group(3));
        int endY = Integer.parseInt(matcher.group(4));

        Set<Coordinate> set = new HashSet<>();
        for (int x = startX; x <= endX; x++) {
            for (int y = startY; y <= endY; y++) {
                set.add(new Coordinate(x, y));
            }
        }

        return set;
    }

    private static class Velocity {
        private int x;
        private int y;

        public Velocity(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Coordinate step(Coordinate startCoordinate) {
            Coordinate destinationCoordinate = new Coordinate(startCoordinate.x() + x, startCoordinate.y() + y);
            adjustVelocityFromStep();
            return destinationCoordinate;
        }

        private void adjustVelocityFromStep() {
            if (x > 0) {
                x--;
            } else if (x < 0) {
                x++;
            }

            y--;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

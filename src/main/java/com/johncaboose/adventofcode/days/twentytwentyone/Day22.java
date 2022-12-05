package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.Couple;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Interval;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Day22 implements ISolvableDay<Long> {

    private static final Pattern COORDINATE_INTERVAL_PATTERN = Pattern.compile("[xyz]=(-?[0-9]+)\\.\\.(-?[0-9]+)");

    @Override
    public Long partOneSolver(String input) {
        Interval initializationProcedureArea = new Interval(-50, 50);
        return solve(input, Optional.of(initializationProcedureArea));
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input);
    }

    private static long solve(String input) {
        return solve(input, Optional.empty());
    }

    private static long solve(String input, Optional<Interval> initializationProcedureArea) {
        List<RebootStep> remainingSteps = readInstructions(input);

        long turnedOnCubes = 0;
        while (remainingSteps.size() > 0) {
            RebootStep currentStep = remainingSteps.remove(0);
            turnedOnCubes += currentStep.execute(remainingSteps, initializationProcedureArea);
        }

        return turnedOnCubes;
    }


    private static List<RebootStep> readInstructions(String input) {
        List<RebootStep> rebootSteps = new ArrayList<>();

        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                RebootStep step = createRebootStep(line);
                rebootSteps.add(step);
            }
        }

        return rebootSteps;
    }

    private static RebootStep createRebootStep(String rebootStep) {
        //instruction
        RebootStepInstruction instruction = RebootStepInstruction.valueOf(rebootStep.split(" ")[0].toUpperCase());

        //intervals
        Matcher matcher = COORDINATE_INTERVAL_PATTERN.matcher(rebootStep);

        Interval xInterval = getNextInterval(matcher);
        Interval yInterval = getNextInterval(matcher);
        Interval zInterval = getNextInterval(matcher);

        // create and add RebootStep
        return new RebootStep(instruction, new Cuboid(xInterval, yInterval, zInterval));
    }

    private enum RebootStepInstruction {
        ON,
        OFF
    }

    private static Interval getNextInterval(Matcher matcher) {
        if (!matcher.find()) {
            throw new IllegalArgumentException("Interval not found");
        }
        return new Interval(matcher.group(1), matcher.group(2));
    }

    private record Cuboid(Interval xInterval, Interval yInterval, Interval zInterval) {

        public boolean overlaps(Cuboid otherCuboid) {
            return xInterval.overlaps(otherCuboid.xInterval) &&
                   yInterval.overlaps(otherCuboid.yInterval) &&
                   zInterval.overlaps(otherCuboid.zInterval);
        }

        public Optional<Cuboid> constrainedTo(Interval cuboidIntervalForAllAxes) {
            Cuboid constrainingCuboid = new Cuboid(cuboidIntervalForAllAxes, cuboidIntervalForAllAxes, cuboidIntervalForAllAxes);
            if (this.overlaps(constrainingCuboid)) {
                Interval newX = this.xInterval.clamped(cuboidIntervalForAllAxes);
                Interval newY = this.yInterval.clamped(cuboidIntervalForAllAxes);
                Interval newZ = this.zInterval.clamped(cuboidIntervalForAllAxes);
                return Optional.of(new Cuboid(newX, newY, newZ));
            } else {
                return Optional.empty();
            }

        }

        public long size() {
            return xInterval.size() * yInterval.size() * zInterval.size();
        }

        private boolean completelyInside(Cuboid otherCuboid) {
            return xInterval.completelyInside(otherCuboid.xInterval) &&
                   yInterval.completelyInside(otherCuboid.yInterval) &&
                   zInterval.completelyInside(otherCuboid.zInterval);
        }

        /**
         * @param otherCuboids the other cuboid to compare this to.
         * @return Sub-cuboids that contains all the cubes in this cuboid, except for those that are shared with
         * otherCuboids. In the case where no overlap exists, the collection returned is equivalent to a collection
         * containing this as its only element.
         */
        public Collection<Cuboid> subCuboidsWithoutOverlap(Collection<Cuboid> otherCuboids) {
            Queue<Cuboid> cuboidsToDivide = new ArrayDeque<>();
            cuboidsToDivide.add(this);
            for (Cuboid otherCuboid : otherCuboids) {
                Queue<Cuboid> iterationResult = new ArrayDeque<>();
                while (cuboidsToDivide.size() > 0) {
                    Cuboid current = cuboidsToDivide.remove();
                    iterationResult.addAll(current.subCuboidsWithoutOverlap(otherCuboid));
                }
                cuboidsToDivide = iterationResult;
            }

            return cuboidsToDivide.stream().toList();
        }

        /**
         * @param otherCuboid the other cuboid to compare this to.
         * @return collection of sub-cuboids contains all the cubes in this cuboid, except for those that are shared
         * with otherCuboid. In the case where no overlap exists, the collection returned a collection that contains
         * this as its only element.
         */
        public Collection<Cuboid> subCuboidsWithoutOverlap(Cuboid otherCuboid) {
            if (this.completelyInside(otherCuboid)) {
                // This sub-cuboid is completely inside otherCuboid and shall be removed
                return List.of();

            } else if (shouldSplitAlongAxis(xInterval, otherCuboid.xInterval)) {
                //There is overlap in the X axis and we need to split this sub-cuboid further
                Couple<Interval, Interval> subIntervals = this.xInterval.split(otherCuboid.xInterval());

                Cuboid firstSubCuboid = new Cuboid(subIntervals.first(), this.yInterval, this.zInterval);
                Cuboid secondSubCuboid = new Cuboid(subIntervals.second(), this.yInterval, this.zInterval);

                return subCuboidsWithoutOverlap(firstSubCuboid, secondSubCuboid, otherCuboid);

            } else if (shouldSplitAlongAxis(yInterval, otherCuboid.yInterval)) {
                //There is overlap in the Y axis and we need to split this sub-cuboid further
                Couple<Interval, Interval> subIntervals = this.yInterval.split(otherCuboid.yInterval());

                Cuboid firstSubCuboid = new Cuboid(this.xInterval, subIntervals.first(), this.zInterval);
                Cuboid secondSubCuboid = new Cuboid(this.xInterval, subIntervals.second(), this.zInterval);

                return subCuboidsWithoutOverlap(firstSubCuboid, secondSubCuboid, otherCuboid);

            } else if (shouldSplitAlongAxis(zInterval, otherCuboid.zInterval)) {
                //There is overlap in the Z axis and we need to split this sub-cuboid further
                Couple<Interval, Interval> subIntervals = this.zInterval.split(otherCuboid.zInterval());

                Cuboid firstSubCuboid = new Cuboid(this.xInterval, this.yInterval, subIntervals.first());
                Cuboid secondSubCuboid = new Cuboid(this.xInterval, this.yInterval, subIntervals.second());

                return subCuboidsWithoutOverlap(firstSubCuboid, secondSubCuboid, otherCuboid);

            } else {
                // This sub-cuboid is completely outside otherCuboid and shall be kept
                return List.of(this);

            }
        }

        private static boolean shouldSplitAlongAxis(Interval axisInterval, Interval otherInterval) {
            return axisInterval.overlaps(otherInterval) && !axisInterval.completelyInside(otherInterval);
        }

        private static Collection<Cuboid> subCuboidsWithoutOverlap(Cuboid firstSubCuboid, Cuboid secondSubCuboid, Cuboid otherCuboid) {
            Collection<Cuboid> result = firstSubCuboid.subCuboidsWithoutOverlap(otherCuboid);
            Collection<Cuboid> secondResult = secondSubCuboid.subCuboidsWithoutOverlap(otherCuboid);

            return Stream.concat(result.stream(), secondResult.stream()).collect(Collectors.toList());
        }

        @Override
        public String toString() {
            return "x=" + xInterval + ",y=" + yInterval + ",z=" + zInterval;
        }
    }

    private record RebootStep(RebootStepInstruction instruction, Cuboid instructionCuboid) {

        public long execute(List<RebootStep> remainingSteps, Optional<Interval> limit) {
            return limit.map(interval -> execute(remainingSteps, interval))
                    .orElseGet(() -> execute(remainingSteps, this.instructionCuboid));
        }

        public long execute(List<RebootStep> remainingSteps, Interval limit) {
            Optional<Cuboid> constrainedInstructionCuboid = instructionCuboid.constrainedTo(limit);

            return constrainedInstructionCuboid.map(cuboid -> execute(remainingSteps, cuboid))
                    .orElse(0L); // instruction is a NOP as we don't care about the areas it affects
        }

        private long execute(List<RebootStep> remainingSteps, Cuboid intervalToUse) {
            Set<Cuboid> stepReactorCore = new HashSet<>();

            switch (instruction) {
                case ON -> turnOn(stepReactorCore, remainingSteps, intervalToUse);
                case OFF -> {
                    //NOP as we never turn on anything we're supposed to later turn off
                }
                default -> throw new UnsupportedOperationException("Unknown instruction");
            }

            return stepReactorCore.stream()
                    .mapToLong(Cuboid::size)
                    .sum();
        }

        private static void turnOn(Collection<Cuboid> reactorCore, List<RebootStep> remainingSteps, Cuboid cuboidToTurnOn) {
            // This way only the final state of each cube will ever be added to the reactorCore
            Collection<Cuboid> remainingCuboids = remainingSteps.stream()
                    .map(RebootStep::instructionCuboid)
                    .toList();
            Collection<Cuboid> subCuboidsToTurnOn = cuboidToTurnOn.subCuboidsWithoutOverlap(remainingCuboids);
            reactorCore.addAll(subCuboidsToTurnOn);
        }

        @Override
        public String toString() {
            return "RebootStep{" + "instruction=" + instruction + ", " + instructionCuboid + '}';
        }
    }
}

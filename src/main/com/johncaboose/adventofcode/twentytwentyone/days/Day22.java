package com.johncaboose.adventofcode.twentytwentyone.days;

import com.johncaboose.adventofcode.shared.Couple;
import com.johncaboose.adventofcode.shared.Interval;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day22 implements ISolvableDay {

    private static final Pattern COORDINATE_INTERVAL_PATTERN = Pattern.compile("[xyz]=(-?[0-9]+)\\.\\.(-?[0-9]+)");

    @Override
    public long partOneSolver(String input) {
        Interval initializationProcedureArea = new Interval(-50, 50);
        return solve(input, Optional.of(initializationProcedureArea));
    }

    @Override
    public long partTwoSolver(String input) {
        return solve(input);
    }

    private static long solve(String input) {
        return solve(input, Optional.empty());
    }

    private static long solve(String input, Optional<Interval> initializationProcedureArea) {
        List<RebootStep> rebootSteps = readInstructions(input);
        Set<Cuboid> reactorCore = new HashSet<>();


        for (int i = 0; i < rebootSteps.size(); i++) {
            RebootStep step = rebootSteps.get(i);
            Set<Cuboid> newReactorCore;
            if (initializationProcedureArea.isPresent()) {
                newReactorCore = step.execute(reactorCore, initializationProcedureArea.get());
            } else {
                newReactorCore = step.execute(reactorCore);
            }
            reactorCore = newReactorCore;
            System.out.println("Handled operation i=%2d/%d. ReactorCore size=%d.".formatted(i, rebootSteps.size(), reactorCore.size()));
        }

        long turnedOnCubes = reactorCore.stream()
                .mapToLong(Cuboid::size)
                .sum();

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
        RebootStep step = new RebootStep(instruction, new Cuboid(xInterval, yInterval, zInterval));
        return step;
    }

    private enum RebootStepInstruction {
        ON,
        OFF
    }

    private static Interval getNextInterval(Matcher matcher) {
        if (!matcher.find()) {
            throw new IllegalArgumentException("Interval not found");
        }
        Interval interval = new Interval(matcher.group(1), matcher.group(2));
        return interval;
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
         * @param otherCuboids
         * @return set of sub-cuboids that contains all the cubes in this cuboid, except for those that are shared with otherCuboids.
         * In the case where no overlap exists, the set returned is equivalent to Set.of(this).
         */
        public Set<Cuboid> subCuboidsWithoutOverlap(Set<Cuboid> otherCuboids) {
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

            return new HashSet<>(cuboidsToDivide.stream().toList());
        }

        /**
         * @param otherCuboid
         * @return list of sub-cuboids contains all the cubes in this cuboid, except for those that are shared with otherCuboid.
         * In the case where no overlap exists, the list returned is equivalent to List.of(this).
         */
        public Set<Cuboid> subCuboidsWithoutOverlap(Cuboid otherCuboid) {
            if (this.completelyInside(otherCuboid)) {

                // This sub-cuboid is completely inside otherCuboid and shall be removed
                return Set.of();

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

            } else if (this.zInterval.overlaps(otherCuboid.zInterval) && !this.zInterval.completelyInside(otherCuboid.zInterval)) {

                //There is overlap in the Z axis and we need to split this sub-cuboid further
                Couple<Interval, Interval> subIntervals = this.zInterval.split(otherCuboid.zInterval());

                Cuboid firstSubCuboid = new Cuboid(this.xInterval, this.yInterval, subIntervals.first());
                Cuboid secondSubCuboid = new Cuboid(this.xInterval, this.yInterval, subIntervals.second());

                return subCuboidsWithoutOverlap(firstSubCuboid, secondSubCuboid, otherCuboid);
            } else {

                // This sub-cuboid is completely outside otherCuboid and shall be kept
                return Set.of(this);
            }
        }

        private static boolean shouldSplitAlongAxis(Interval axisInterval, Interval otherInterval) {
            return axisInterval.overlaps(otherInterval) && !axisInterval.completelyInside(otherInterval);
        }

        private static Set<Cuboid> subCuboidsWithoutOverlap(Cuboid firstSubCuboid, Cuboid secondSubCuboid, Cuboid otherCuboid) {
            Set<Cuboid> result = firstSubCuboid.subCuboidsWithoutOverlap(otherCuboid);
            Set<Cuboid> secondResult = secondSubCuboid.subCuboidsWithoutOverlap(otherCuboid);

            return Stream.concat(result.stream(), secondResult.stream()).collect(Collectors.toSet());
        }

        @Override
        public String toString() {
            return "x=" + xInterval +
                    ",y=" + yInterval +
                    ",z=" + zInterval;
        }
    }

    private record RebootStep(RebootStepInstruction instruction, Cuboid instructionCuboid) {

        public Set<Cuboid> execute(Set<Cuboid> reactorCore) {
            return execute(reactorCore, instructionCuboid);
        }

        public Set<Cuboid> execute(Set<Cuboid> reactorCore, Interval limit) {
            Optional<Cuboid> constrainedInstructionCuboid = instructionCuboid.constrainedTo(limit);
            if (constrainedInstructionCuboid.isPresent()) {
                return execute(reactorCore, constrainedInstructionCuboid.get());
            } else {
                // instruction is a NOP as we don't care about the areas it affects
                return reactorCore;
            }
        }

        public Set<Cuboid> execute(Set<Cuboid> reactorCore, Cuboid intervalToUse) {
            Set<Cuboid> postExecutionReactorCore = new HashSet<>(reactorCore);

            switch (instruction) {
                case ON -> turnOn(postExecutionReactorCore, intervalToUse);
                case OFF -> turnOff(postExecutionReactorCore, intervalToUse);
                default -> throw new UnsupportedOperationException("Unknown instruction");
            }

            return postExecutionReactorCore;

        }

        private static void turnOn(Set<Cuboid> reactorCore, Cuboid cuboidToTurnOn) {
            Set<Cuboid> cuboidsToTurnOn = cuboidToTurnOn.subCuboidsWithoutOverlap(reactorCore);
            reactorCore.addAll(cuboidsToTurnOn);
        }

        private static void turnOff(Set<Cuboid> reactorCore, Cuboid cuboidToTurnOff) {
            Set<Cuboid> resultingReactorCore = new HashSet<>();
            for (Cuboid cuboid : reactorCore) {
                Set<Cuboid> subCuboidsNotTurnedOff = cuboid.subCuboidsWithoutOverlap(cuboidToTurnOff);
                resultingReactorCore.addAll(subCuboidsNotTurnedOff);
            }
            reactorCore.clear();
            reactorCore.addAll(resultingReactorCore);
        }

        @Override
        public String toString() {
            return "RebootStep{" +
                    "instruction=" + instruction +
                    ", " + instructionCuboid +
                    '}';
        }
    }
}

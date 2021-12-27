package com.johncaboose.adventofcode.twentytwentyone.days;

import com.johncaboose.adventofcode.twentytwentyone.shared.Coordinate3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Day22 implements ISolvableDay {

    private static final Pattern COORDINATE_INTERVAL_PATTERN = Pattern.compile("[xyz]=(-?[0-9]+)\\.\\.(-?[0-9]+)");

    @Override
    public long partOneSolver(String input) {
        List<RebootStep> rebootSteps = readInstructions(input);
        Set<Coordinate3> reactorCore = new HashSet<>();

        Interval initializationProcedureArea = new Interval(-50, 50);

        for (RebootStep step : rebootSteps) {
            reactorCore = step.execute(reactorCore, initializationProcedureArea);
        }

        long turnedOnCubes = reactorCore.stream()
                .count();

        return turnedOnCubes;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
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
        if (!matcher.find()) {
            throw new IllegalArgumentException("Interval not found");
        }
        Interval xInterval = new Interval(matcher.group(1), matcher.group(2));

        if (!matcher.find()) {
            throw new IllegalArgumentException("Interval not found");
        }
        Interval yInterval = new Interval(matcher.group(1), matcher.group(2));

        if (!matcher.find()) {
            throw new IllegalArgumentException("Interval not found");
        }
        Interval zInterval = new Interval(matcher.group(1), matcher.group(2));

        // create and add RebootStep
        RebootStep step = new RebootStep(instruction, new Interval3(xInterval, yInterval, zInterval));
        return step;
    }

    private enum RebootStepInstruction {
        ON,
        OFF
    }

    private record Interval(int startInclusive, int endInclusive) {

        public Interval(String startInclusive, String endInclusive) {
            this(Integer.parseInt(startInclusive), Integer.parseInt(endInclusive));
        }

        /**
         * @return a sequential ordered IntStream from startInclusive (inclusive) to endInclusive (inclusive) by an incremental step of 1.
         */
        public IntStream intStream() {
            return IntStream.rangeClosed(startInclusive, endInclusive);
        }

        public boolean contains(int val) {
            return val >= startInclusive && val <= endInclusive;
        }

        public boolean contains(Coordinate3 coordinate) {
            return contains(coordinate.x()) && contains(coordinate.y()) && contains(coordinate.z());
        }

        public boolean overlaps(Interval interval) {
            long totalAmountOfElements = intStream().count() + interval.intStream().count();
            long uniqueElements = IntStream.concat(intStream(), interval.intStream())
                    .distinct()
                    .count();
            return totalAmountOfElements > uniqueElements;
        }

        public Interval clamped(Interval limit) {
            Interval clamped = new Interval(Math.max(startInclusive, limit.startInclusive), Math.min(endInclusive, limit.endInclusive));
            return clamped;
        }
    }

    private record Interval3(Interval xInterval, Interval yInterval, Interval zInterval) {

        public List<Coordinate3> coordinate3List() {
            List<Coordinate3> coordinate3List = Collections.synchronizedList(new ArrayList<>());

            xInterval.intStream().forEach(x -> {
                yInterval.intStream().forEach(y -> {
                    zInterval.intStream().forEach(z -> {
                        coordinate3List.add(new Coordinate3(x, y, z));
                    });
                });
            });

            return coordinate3List;
        }

        public boolean contains(Coordinate3 coordinate) {
            return xInterval.contains(coordinate.x()) &&
                    yInterval.contains(coordinate.y()) &&
                    zInterval.contains(coordinate.z());
        }


        public Interval3 filtered(Interval limit) {
            if (!limit.overlaps(xInterval) || !limit.overlaps(yInterval) || !limit.overlaps(zInterval)) {
                return null;
            }

            Interval3 filteredInterval = new Interval3(xInterval.clamped(limit), yInterval.clamped(limit), zInterval.clamped(limit));
            return filteredInterval;
        }
    }

    private record RebootStep(RebootStepInstruction instruction, Interval3 interval3) {

        public Set<Coordinate3> execute(Set<Coordinate3> reactorCore) {
            return execute(reactorCore, interval3);
        }

        public Set<Coordinate3> execute(Set<Coordinate3> reactorCore, Interval limit) {
            Interval3 reducedInstructionInterval = interval3.filtered(limit);
            if (reducedInstructionInterval == null) {
                return reactorCore;
            }
            return execute(reactorCore, reducedInstructionInterval);
        }

        public Set<Coordinate3> execute(Set<Coordinate3> reactorCore, Interval3 intervalToUse) {
            Set<Coordinate3> postExecutionReactorCore = new HashSet<>(reactorCore);

            switch (instruction) {
                case ON -> postExecutionReactorCore.addAll(intervalToUse.coordinate3List());
                case OFF -> postExecutionReactorCore.removeAll(intervalToUse.coordinate3List());
                default -> throw new UnsupportedOperationException("Unknown instruction");
            }

            return postExecutionReactorCore;

        }


    }
}

package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayList;
import java.util.List;

import static com.johncaboose.adventofcode.shared.Utils.populateListWithCommaSeparatedLongs;

class Day7 implements ISolvableDay<Long> {


    @Override
    public Long partOneSolver(String input) {
        List<Long> initialPositions = populateListWithCommaSeparatedLongs(input);

        return calculateMinimumFuelSpent(initialPositions, false);
    }

    @Override
    public Long partTwoSolver(String input) {
        List<Long> initialPositions = populateListWithCommaSeparatedLongs(input);

        return calculateMinimumFuelSpent(initialPositions, true);
    }

    private long calculateMinimumFuelSpent(List<Long> initialPositions, boolean fuelCostIncreasesWithEachStep) {
        long minimumFuelSpent = Long.MAX_VALUE;
        long maximumInitialPosition = initialPositions.stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);
        for (long i = 0; i < maximumInitialPosition; i++) {
            long fuelSpent = fuelSpentToMoveTo(i, new ArrayList<>(initialPositions), fuelCostIncreasesWithEachStep);
            if (fuelSpent < minimumFuelSpent) {
                minimumFuelSpent = fuelSpent;
            }
        }

        return minimumFuelSpent;
    }

    private static long fuelSpentToMoveTo(final long finalPosition, List<Long> initialPositions, boolean fuelCostIncreasesWithEachStep) {
        long fuelSpent = 0;
        for (long initialPosition : initialPositions) {
            long distance = Math.abs(initialPosition - finalPosition);
            fuelSpent += fuelCostIncreasesWithEachStep ? integerSum(distance) : distance;
        }
        return fuelSpent;
    }

    private static long integerSum(long lastValue) {
        return (lastValue * (lastValue + 1)) / 2;
    }
}

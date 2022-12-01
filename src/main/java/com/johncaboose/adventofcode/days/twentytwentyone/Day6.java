package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Utils;

import java.util.ArrayList;
import java.util.List;

class Day6 implements ISolvableDay {


    @Override
    public long partOneSolver(String input) {
        long days = 80;
        List<Long> allFish = Utils.populateListWithCommaSeparatedLongs(input);
        return calculateFishPopulation(allFish, days);
    }

    @Override
    public long partTwoSolver(String input) {
        long days = 256;
        List<Long> allFish = Utils.populateListWithCommaSeparatedLongs(input);
        return calculateFishPopulation(allFish, days);
    }

    private long calculateFishPopulation(List<Long> allFish, long days) {

        List<Long> currentAmountPerAge = new ArrayList<>();
        int maxAge = 8;
        for (int currentAge = 0; currentAge <= maxAge; currentAge++) {
            final int finalCurrentAge = currentAge;
            long amountOfFishAtCurrentAge = allFish.stream()
                    .filter(l -> l == finalCurrentAge)
                    .count();
            currentAmountPerAge.add(amountOfFishAtCurrentAge);
        }


        for (int currentDay = 1; currentDay <= days; currentDay++) {
            List<Long> nextAmountPerAge = new ArrayList<>(currentAmountPerAge);
            for (int i = 0; i < currentAmountPerAge.size(); i++) {
                long currentAmount = currentAmountPerAge.get(i);
                if (i == 0) {
                    nextAmountPerAge.set(8, currentAmount);
                    nextAmountPerAge.set(6, currentAmount);
                } else if (i == 7) {
                    nextAmountPerAge.set(6, currentAmount + nextAmountPerAge.get(6));
                } else {
                    nextAmountPerAge.set(i - 1, currentAmount);
                }

            }
            currentAmountPerAge = nextAmountPerAge;
        }
        return currentAmountPerAge.stream()
                .mapToLong(l -> l)
                .sum();
    }
}

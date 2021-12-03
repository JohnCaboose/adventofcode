package com.johncaboose.adventofcode.twentytwentyone;

import java.util.ArrayList;
import java.util.List;

public class Day1 implements ISolvableDay {

    @Override
    public String solutionPartOne() {
        List<Integer> depths = Utils.populateListWithNumbers(ProblemInput.DAY_1_INPUT_1);

        return String.valueOf(amountOfIncreases(depths));
    }

    @Override
    public String solutionPartTwo() {
        List<Integer> depths = Utils.populateListWithNumbers(ProblemInput.DAY_1_INPUT_1);
        List<Integer> slidingWindowOfDepths = new ArrayList<>();
        for (int i = 0; i < depths.size(); i++) {
            if (i + 2 < depths.size()) {
                int currentWindowSum = depths.get(i) + depths.get(i + 1) + depths.get(i + 2);
                slidingWindowOfDepths.add(currentWindowSum);
            }
        }
        return String.valueOf(amountOfIncreases(slidingWindowOfDepths));
    }

    private int amountOfIncreases(List<Integer> list) {
        if (list.size() < 2) {
            return 0;
        }

        int amountOfIncreases = 0;
        int lastValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current > lastValue) {
                amountOfIncreases++;
            }
            lastValue = current;
        }
        return amountOfIncreases;
    }

}

package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Utils;

import java.util.ArrayList;
import java.util.List;

class Day1 implements ISolvableDay<Long> {


    @Override
    public Long partOneSolver(String input) {
        List<Long> depths = Utils.populateListWithLongs(input);
        return amountOfIncreases(depths);
    }

    @Override
    public Long partTwoSolver(String input) {
        List<Long> depths = Utils.populateListWithLongs(input);
        List<Long> slidingWindowOfDepths = new ArrayList<>();
        for (int i = 0; i < depths.size(); i++) {
            if (i + 2 < depths.size()) {
                long currentWindowSum = depths.get(i) + depths.get(i + 1) + depths.get(i + 2);
                slidingWindowOfDepths.add(currentWindowSum);
            }
        }
        return amountOfIncreases(slidingWindowOfDepths);
    }

    private long amountOfIncreases(List<Long> list) {
        if (list.size() < 2) {
            return 0;
        }

        int amountOfIncreases = 0;
        long lastValue = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            long current = list.get(i);
            if (current > lastValue) {
                amountOfIncreases++;
            }
            lastValue = current;
        }
        return amountOfIncreases;
    }

}

package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToLongFunction;

class Day9 implements ISolvableDay<Long> {

    private static final Logger log = LogManager.getLogger(Day9.class);

    @Override
    public Long partOneSolver(String input) {
        return solve(input, Day9::extrapolateNext);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, Day9::extrapolatePrevious);
    }

    private static long solve(String input, ToLongFunction<List<Long>> mappingFunction) {
        String[] split = input.split("\n");
        List<List<Long>> histories = Arrays.stream(split)
                .map(Utils::populateListWithLongs)
                .toList();

        return histories.stream()
                .mapToLong(mappingFunction)
                .sum();
    }

    private static long extrapolateNext(List<Long> history) {
        if (history.stream().allMatch(l -> l == 0)) {
            return 0;
        }

        List<Long> differences = new ArrayList<>();
        for (int i = 0; i < history.size() - 1; i++) {
            long difference = history.get(i + 1) - history.get(i);
            differences.add(difference);
        }

        long toAdd = extrapolateNext(differences);

        return history.getLast() + toAdd;
    }

    private static long extrapolatePrevious(List<Long> history) {
        if (history.stream().allMatch(l -> l == 0)) {
            return 0;
        }

        List<Long> differences = new ArrayList<>();
        for (int i = 0; i < history.size() - 1; i++) {
            long difference = history.get(i + 1) - history.get(i);
            differences.add(difference);
        }

        long toRemove = extrapolatePrevious(differences);

        return history.getFirst() - toRemove;
    }

}

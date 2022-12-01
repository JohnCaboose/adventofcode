package com.johncaboose.adventofcode.days.twentytwenty;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Day1 implements ISolvableDay {
    @Override
    public long partOneSolver(String input) {
        Set<Long> numbers = new HashSet<>(Utils.populateListWithLongs(input));

        long sum = 2020;
        for (long number : numbers) {
            long sumMinusNumber = sum - number;
            if (numbers.contains(sumMinusNumber)) {
                return sumMinusNumber * number;
            }
        }

        return 0;
    }

    @Override
    public long partTwoSolver(String input) {
        List<Long> numbers = Utils.populateListWithLongs(input);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                for (int k = 0; k < numbers.size(); k++) {
                    if (i == j || i == k || j == k) {
                        continue;
                    }
                    
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 2020) {
                        return numbers.get(i) * numbers.get(j) * numbers.get(k);
                    }

                }
            }
        }

        return 0;
    }
}

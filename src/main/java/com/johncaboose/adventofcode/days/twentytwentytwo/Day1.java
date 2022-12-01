package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Day1 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        List<Long> knapsacks = knapsacks(input);

        return knapsacks.stream()
                .max(Long::compareTo)
                .orElse(0L);
    }

    @Override
    public long partTwoSolver(String input) {
        List<Long> knapsacks = knapsacks(input);
        return knapsacks.stream()
                .sorted(Collections.reverseOrder())
                .mapToLong(Long::longValue)
                .limit(3) // max 3 knapsacks
                .sum();
    }

    private List<Long> knapsacks(String input) {
        List<Long> knapsacks = new ArrayList<>();

        Scanner scanner = new Scanner(input);
        scanner.useDelimiter("\n");
        long currentGroupSum = 0;
        while (scanner.hasNextLine()) {
            if (scanner.hasNextLong()) {
                //another number in the group
                currentGroupSum += scanner.nextLong();
            } else {
                //new group of numbers
                knapsacks.add(currentGroupSum);
                scanner.nextLine();
                currentGroupSum = 0;
            }

        }

        return knapsacks;
    }
}

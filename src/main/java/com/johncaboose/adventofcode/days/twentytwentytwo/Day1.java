package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Day1 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        List<Long> knapsacks = caloriesPerKnapsack(input);

        // Find knapsack with highest amount of calories
        return knapsacks.stream()
                .mapToLong(Long::longValue)
                .max() // find highest calorie count
                .orElse(0L);
    }

    @Override
    public long partTwoSolver(String input) {
        List<Long> knapsacks = caloriesPerKnapsack(input);

        // Find sum of calories of the top 3 knapsacks
        return knapsacks.stream()
                // Sort highest calorie count first
                .sorted(Collections.reverseOrder())
                .mapToLong(Long::longValue)
                .limit(3)
                .sum();
    }

    /**
     * Number of calories each elf is carrying in their knapsack
     *
     * @param input puzzle input
     * @return each knapsack's calorie count as a list
     */
    private List<Long> caloriesPerKnapsack(String input) {
        List<Long> knapsacks = new ArrayList<>();

        Scanner scanner = new Scanner(input);
        // Standard delimiter would break the if-else in the while-loop
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

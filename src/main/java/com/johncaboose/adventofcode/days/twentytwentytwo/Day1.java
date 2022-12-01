package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.Scanner;

class Day1 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter("\n");
        long currentGroupSum = 0;
        long currentMax = 0;
        while (scanner.hasNextLine()) {
            if (scanner.hasNextLong()) {
                //another number
                currentGroupSum += scanner.nextLong();

                if (currentGroupSum > currentMax) {
                    currentMax = currentGroupSum;
                }
            } else {
                //new group of numbers!
                scanner.nextLine();
                currentGroupSum = 0;
            }

        }
        return currentMax;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }
}

package com.johncaboose.adventofcode.twentytwentyone.days;

import com.johncaboose.adventofcode.twentytwentyone.shared.ExtendedHashMap;
import com.johncaboose.adventofcode.twentytwentyone.shared.ExtendedMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day14 implements ISolvableDay {
    @Override
    public long partOneSolver(String input) {
        Map<String, String> insertionRules = new HashMap<>();
        String template = null;
        try (Scanner scanner = new Scanner(input)) {
            template = scanner.nextLine();
            scanner.nextLine(); // discard empty line
            while (scanner.hasNextLine()) {
                String[] ruleParts = scanner.nextLine().split(" -> ");
                insertionRules.put(ruleParts[0], ruleParts[1]);
            }
        }


        int steps = 10;
        final String finalChar = template.substring(template.length() - 1);
        StringBuilder stepResult = new StringBuilder(template);
        for (int step = 0; step < steps; step++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < stepResult.length() - 1; i++) {
                String pair = stepResult.substring(i, i + 2);
                sb.append(pair.substring(0, 1));
                String elementToInsert = insertionRules.get(pair);
                if (elementToInsert != null) {
                    sb.append(elementToInsert);
                }
            }
            sb.append(finalChar); //final char is always same for every step
            stepResult = sb;
        }

        ExtendedMap<Character, Integer> elementCount = new ExtendedHashMap<>();
        for (Character element : stepResult.toString().toCharArray()) {
            Integer currentValue = elementCount.getOrStoreDefault(element, 0);
            elementCount.put(element, currentValue + 1);
        }

        int maxAmount = elementCount.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .get()
                .getValue();

        int minAmount = elementCount.entrySet()
                .stream()
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .get()
                .getValue();

        return maxAmount - minAmount;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }
}

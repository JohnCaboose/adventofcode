package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ExtendedHashMap;
import com.johncaboose.adventofcode.shared.ExtendedMap;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Day14 implements ISolvableDay {
    @Override
    public long partOneSolver(String input) {
        int steps = 10;
        long solution = solve(input, steps);
        return solution;
    }

    @Override
    public long partTwoSolver(String input) {
        int steps = 40;
        long solution = solve(input, steps);
        return solution;
    }

    private long solve(String input, int steps) {
        Map<String, String> insertionRules = new HashMap<>();
        String template;
        try (Scanner scanner = new Scanner(input)) {
            template = scanner.nextLine();
            scanner.nextLine(); // discard empty line
            while (scanner.hasNextLine()) {
                String[] ruleParts = scanner.nextLine().split(" -> ");
                insertionRules.put(ruleParts[0], ruleParts[1]);
            }
        }

        ExtendedMap<String, Long> pairCounts = new ExtendedHashMap<>();
        for (int i = 0; i < template.length() - 1; i++) {
            String pair = template.substring(i, i + 2);
            Long currentValue = pairCounts.getOrStoreDefault(pair, 0L);
            pairCounts.put(pair, currentValue + 1);
        }

        for (int step = 0; step < steps; step++) {
            ExtendedMap<String, Long> postStepPairCounts = new ExtendedHashMap<>();

            for (Map.Entry<String, Long> pairEntry : pairCounts.entrySet()) {
                String insertedElement = insertionRules.get(pairEntry.getKey());
                char[] pairCharArray = pairEntry.getKey().toCharArray();

                String firstCreatedPair = pairCharArray[0] + insertedElement;
                String secondCreatedPair = insertedElement + pairCharArray[1];
                long amountCreated = pairEntry.getValue();

                Long currentFirstPairValue = postStepPairCounts.getOrStoreDefault(firstCreatedPair, 0L);
                postStepPairCounts.put(firstCreatedPair, currentFirstPairValue + amountCreated);

                Long currentSecondPairValue = postStepPairCounts.getOrStoreDefault(secondCreatedPair, 0L);
                postStepPairCounts.put(secondCreatedPair, currentSecondPairValue + amountCreated);
            }
            pairCounts = postStepPairCounts;
        }


        ExtendedMap<Character, Long> elementCount = new ExtendedHashMap<>();
        for (String pair : pairCounts.keySet()) {
            Character element = pair.charAt(0);
            Long currentValue = elementCount.getOrStoreDefault(element, 0L);
            elementCount.put(element, currentValue + pairCounts.get(pair));
        }

        Character finalCharacter = template.charAt(template.length() - 1);
        Long currentValue = elementCount.getOrStoreDefault(finalCharacter, 0L);
        elementCount.put(finalCharacter, currentValue + 1);


        long maxAmount = elementCount.entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .get()
                .getValue();

        long minAmount = elementCount.entrySet()
                .stream()
                .min(Comparator.comparingLong(Map.Entry::getValue))
                .get()
                .getValue();

        return maxAmount - minAmount;
    }
}

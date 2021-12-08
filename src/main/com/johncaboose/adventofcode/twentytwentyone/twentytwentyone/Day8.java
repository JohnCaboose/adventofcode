package com.johncaboose.adventofcode.twentytwentyone.twentytwentyone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day8 implements ISolvableDay {

    private final List<RenderedNumbers> renderedNumbers = List.of(
            new RenderedNumbers(0, List.of("a", "b", "c", "e", "f", "g")),
            new RenderedNumbers(1, List.of("c", "f")),
            new RenderedNumbers(2, List.of("a", "c", "d", "e", "g")),
            new RenderedNumbers(3, List.of("a", "c", "d", "f", "g")),
            new RenderedNumbers(4, List.of("b", "c", "d", "f")),
            new RenderedNumbers(5, List.of("a", "b", "d", "f", "g")),
            new RenderedNumbers(6, List.of("a", "b", "d", "e", "f", "g")),
            new RenderedNumbers(7, List.of("a", "c", "f")),
            new RenderedNumbers(8, List.of("a", "b", "c", "d", "e", "f", "g")),
            new RenderedNumbers(9, List.of("a", "b", "c", "d", "f", "g"))
    );

    private record RenderedNumbers(int number, List<String> usedSegments) {
        public int amountOfSegmentsUsed() {
            return usedSegments.size();
        }
    }


    @Override
    public long partOneSolver(String input) {
        List<String> allDigits = getDigitsFromInput(input, true);
        List<Integer> lengthsToFilter = List.of(2, 4, 3, 7);
        return allDigits.stream()
                .filter(s -> lengthsToFilter.contains(s.length()))
                .count();
    }

    private List<String> getDigitsFromInput(String input, boolean outputsOnly) {
        List<String> allDigits = new ArrayList<>();
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] entryParts = line.split(" \\| ");
                if (outputsOnly) {
                    String[] digits = entryParts[1].split(" ");
                    for (String digit : digits) {
                        allDigits.add(digit);
                    }
                } else {
                    for (String entryPart : entryParts) {
                        String[] digits = entryPart.split(" ");
                        for (String digit : digits) {
                            allDigits.add(digit);
                        }
                    }
                }

            }
        }
        return allDigits;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }
}

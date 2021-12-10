package com.johncaboose.adventofcode.twentytwentyone.twentytwentyone;

import java.util.*;

public class Day8 implements ISolvableDay {


    // 1 = ..c..f. // length 2
    // 7 = a.c..f. // length 3
    // 4 = .bcd.f. // length 4
    // 2 = a.cde.g // length 5
    // 3 = a.cd.fg // length 5
    // 5 = ab.d.fg // length 5
    // 0 = abc.efg // length 6
    // 6 = ab.defg // length 6
    // 9 = abcd.fg // length 6
    // 8 = abcdefg // length 7

    // e 4 times
    // b 6 times
    // d,g 7 times
    // a,c 8 times
    // f 9 times

    @Override
    public long partOneSolver(String input) {
        List<String> allDigits = getAllOutputDigits(input);
        List<Integer> lengthsToFilter = List.of(2, 3, 4, 7);
        return allDigits.stream()
                .filter(s -> lengthsToFilter.contains(s.length()))
                .count();
    }

    @Override
    public long partTwoSolver(String input) {
        List<Integer> outputValues = new ArrayList<>();
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] entryParts = line.split(" \\| ");

                List<String> signalPatterns = collectDigits(entryParts[0]);
                List<String> outputDigits = collectDigits(entryParts[1]);

                int outputValue = outputValue(signalPatterns, outputDigits);
                outputValues.add(outputValue);
            }
        }

        return outputValues.stream()
                .reduce(0, Integer::sum);
    }

    private static List<String> collectDigits(String splitLinePart) {
        String[] digits = splitLinePart.split(" ");
        return Arrays.asList(digits);
    }


    private static int outputValue(List<String> signalPatterns, List<String> outputDigits) {
        Map<String, Integer> appearancesPerLetter = appearancesPerLetter(signalPatterns);

        Map<String, Integer> mapping = mappingOfSignalPatternsToNumbers(signalPatterns, appearancesPerLetter);

        return outputValue(outputDigits, mapping);
    }

    private static int outputValue(List<String> outputDigits, Map<String, Integer> mapping) {

        StringBuilder outputNumbers = new StringBuilder();
        for (String s : outputDigits) {
            outputNumbers.append(mapping.get(sortedString(s)));
        }

        int value = Integer.parseInt(outputNumbers.toString());

        return value;
    }

    private static Map<String, Integer> mappingOfSignalPatternsToNumbers(List<String> signalPatterns, Map<String, Integer> appearancesPerLetter) {

        // f, b, e appear a unique number of times in the signalPatterns
        String f = letterWithUniqueAppearances(appearancesPerLetter, 9);
        String b = letterWithUniqueAppearances(appearancesPerLetter, 6);
        String e = letterWithUniqueAppearances(appearancesPerLetter, 4);

        // c, is the other letter in the sequence of length 2 that isn't f
        String c = signalPatterns.stream()
                .filter(s -> s.length() == 2)
                .map(s -> s.replace(f, ""))
                .findFirst()
                .get();

        // a, the other letter that appears 8 times that isn't c
        String a = letterWithSameAppearancesAsOthers(appearancesPerLetter, 8, c);

        // g, the letter that exists 7 times but doesn't exist in the sequence of length 4
        String length4Sequence = signalPatterns.stream()
                .filter(s -> s.length() == 4)
                .findFirst()
                .get();
        String g = letterWithSameAppearancesAsOthers(appearancesPerLetter, 7, length4Sequence);

        // d, the other letter that exists 7 times but isn't g
        String d = letterWithSameAppearancesAsOthers(appearancesPerLetter, 7, g);


        return mappingOfSignalPatternsToNumbers(signalPatterns, a, b, c, d, e, f, g);
    }

    private static Map<String, Integer> mappingOfSignalPatternsToNumbers(List<String> signalPatterns, String a, String b, String c, String d, String e, String f, String g) {
        String zero = a + b + c + e + f + g;
        String one = c + f;
        String two = a + c + d + e + g;
        String three = a + c + d + f + g;
        String four = b + c + d + f;
        String five = a + b + d + f + g;
        String six = a + b + d + e + f + g;
        String seven = a + c + f;
        String eight = a + b + c + d + e + f + g;
        String nine = a + b + c + d + f + g;

        List<String> mappings = List.of(zero, one, two, three, four, five, six, seven, eight, nine);

        Map<String, Integer> retVal = new HashMap<>();
        for (int i = 0; i < mappings.size(); i++) {
            retVal.put(sortedString(mappings.get(i)), i);
        }

        return retVal;
    }

    private static String sortedString(String unsorted) {
        char[] charArray = unsorted.toCharArray();
        Arrays.sort(charArray);

        return String.valueOf(charArray);
    }

    private static boolean sameCharactersInString(String a, String b) {
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }

    private static String letterWithUniqueAppearances(Map<String, Integer> appearancesPerLetter, int appearances) {
        return letterWithSameAppearancesAsOthers(appearancesPerLetter, appearances, "");
    }

    /**
     * @param appearancesPerLetter amount of appearances per letter
     * @param appearances          amount of times letter appears
     * @param exclude              any chars in this will be excluded and not be returned
     * @return the letter that appears the specified amount of times, but not one of the specified String of letters to exclude
     */
    private static String letterWithSameAppearancesAsOthers(Map<String, Integer> appearancesPerLetter, int appearances, String exclude) {
        return appearancesPerLetter.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == appearances)
                .filter(s -> !exclude.contains(s.getKey()))
                .findFirst()
                .get()
                .getKey();
    }


    private static Map<String, Integer> appearancesPerLetter(List<String> signalPatterns) {
        Map<String, Integer> retVal = new HashMap<>();
        for (String letter : List.of("a", "b", "c", "d", "e", "f", "g")) {
            int count = (int) signalPatterns.stream().filter(s -> s.contains(letter)).count();
            retVal.put(letter, count);
        }
        return retVal;
    }

    private List<String> getAllOutputDigits(String input) {
        List<String> retValue = new ArrayList<>();
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] entryParts = line.split(" \\| ");
                List<String> outputDigits = collectDigits(entryParts[1]);
                retValue.addAll(outputDigits);
            }
        }
        return retValue;
    }
}

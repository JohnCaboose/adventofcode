package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Day1 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day1.class);
    private static final Pattern FIRST_DIGIT = Pattern.compile("(\\d)");
    public static final Pattern LAST_DIGIT = Pattern.compile(".*(\\d)");

    private static final Pattern FIRST_PART_2_DIGIT = Pattern.compile("(\\d|one|two|three|four|five|six|seven|eight|nine)");
    private static final Pattern LAST_PART_2_DIGIT = Pattern.compile(".*(\\d|one|two|three|four|five|six|seven|eight|nine)");

    @Override
    public Long partOneSolver(String input) {
        return solve(input, false);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, true);
    }

    private static Long solve(String input, boolean part2) {
        List<Long> twoDigitNumbers = parseInput(input, part2);
        return twoDigitNumbers.stream()
                .mapToLong(Long::valueOf)
                .sum();
    }

    private static List<Long> parseInput(String input, boolean part2) {
        Scanner scanner = new Scanner(input);
        List<Long> twoDigitNumbers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            twoDigitNumbers.add(twoDigitNumber(scanner.nextLine(), part2));
        }
        return twoDigitNumbers;
    }

    private static Long twoDigitNumber(String line, boolean part2) {
        String firstDigit = getDigit(part2 ? FIRST_PART_2_DIGIT : FIRST_DIGIT, line);
        String lastDigit = getDigit(part2 ? LAST_PART_2_DIGIT : LAST_DIGIT, line);
        return Long.parseLong(firstDigit + lastDigit);
    }

    private static String getDigit(Pattern pattern, String line) {
        Matcher matcher = pattern.matcher(line);
        if (!matcher.find()) {
            throw new IllegalArgumentException("No digit found");
        }
        return textToDigit(matcher.group(1));
    }

    private static String textToDigit(String text) {
        return switch (text) {
            case "one" -> "1";
            case "two" -> "2";
            case "three" -> "3";
            case "four" -> "4";
            case "five" -> "5";
            case "six" -> "6";
            case "seven" -> "7";
            case "eight" -> "8";
            case "nine" -> "9";
            default -> text;
        };
    }

}

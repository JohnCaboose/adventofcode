package com.johncaboose.adventofcode.twentytwentyone.days;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day18 implements ISolvableDay {

    private static final Pattern LITERAL_PATTERN = Pattern.compile("[0-9]+");
    private static final Pattern LAST_LITERAL_PATTERN = Pattern.compile(".*[^0-9]([0-9]+)");
    private static final Pattern LEFT_BRACKET_PATTERN = Pattern.compile("\\[");
    private static final Pattern COMMA_PATTERN = Pattern.compile(",");
    private static final Pattern RIGHT_BRACKET_PATTERN = Pattern.compile("]");

    private static final Pattern TEN_OR_HIGHER_LITERAL_PATTERN = Pattern.compile("[1-9][0-9]+");
    private static final Pattern PAIR_OF_LITERALS_PATTERN = Pattern.compile("\\[[0-9]+,[0-9]+]");
    private static final char LEFT_BRACKET = '[';
    private static final char RIGHT_BRACKET = ']';


    @Override
    public long partOneSolver(String input) {
        String result = calculateSum(input);
        SnailfishElement finalResult = readInputNumber(result);
        long magnitude = finalResult.getMagnitude();
        return magnitude;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }

    String calculateSum(String input) {
        Queue<String> inputNumbers = readInput(input);
        String result = inputNumbers.remove();
        while (inputNumbers.size() > 0) {
            String second = inputNumbers.remove();
            result = add(result, second);
            result = reduce(result);
        }
        return result;
    }

    private static String add(String first, String second) {
        return "[" + first + "," + second + "]";
    }

    static String reduce(String number) {
        String reduced = number;
        while (true) {
            String interim = explode(reduced);
            if (!reduced.equals(interim)) {
                reduced = interim;
                //number exploded, see if any more explosions needed
                continue;
            }

            interim = split(reduced);
            if (reduced.equals(interim)) {
                // number was neither exploded nor split -> number is reduced
                break;
            } else {
                reduced = interim;
            }

        }
        return reduced;
    }

    static String explode(String number) {
        int indexWhereExplodingPairBegins = findPairToExplode(number);
        if (indexWhereExplodingPairBegins > 0) {
            //Exploding pair found!
            //Note: match can exist more than once in the string!
            Matcher matcher = PAIR_OF_LITERALS_PATTERN.matcher(number.substring(indexWhereExplodingPairBegins));
            if (!matcher.find()) {
                throw new RuntimeException("Found pair to explode but then couldn't match it against pattern.");
            }
            String match = matcher.group();
            SnailfishNumber snailfishNumberOfMatch = (SnailfishNumber) readInputNumber(match);
            long leftLiteral = snailfishNumberOfMatch.leftSide.getMagnitude();
            long rightLiteral = snailfishNumberOfMatch.rightSide.getMagnitude();

            //First replace the exploded pair with the zero
            number = number.substring(0, indexWhereExplodingPairBegins) +
                    "0" +
                    number.substring(indexWhereExplodingPairBegins + match.length());

            // Add the rightLiteral to first number to the right of the exploded pair (if any)
            number = number.substring(0, indexWhereExplodingPairBegins + 1) +
                    LITERAL_PATTERN.matcher(number.substring(indexWhereExplodingPairBegins + 1))
                            .replaceFirst((matchResult) -> {
                                String found = matchResult.group();
                                long replacement = Long.valueOf(found) + rightLiteral;
                                return String.valueOf(replacement);
                            });

            // Add the leftLiteral to the first number to the left of the exploded pair (if any)
            number = LAST_LITERAL_PATTERN.matcher(number.substring(0, indexWhereExplodingPairBegins))
                    .replaceFirst((matchResult -> {
                        String found = matchResult.group(1);
                        long replacementLong = Long.valueOf(found) + leftLiteral;
                        String replacement = String.valueOf(replacementLong);
                        replacement = matchResult.group(0).substring(0, matchResult.group(0).length() - found.length())
                                + replacement;
                        return replacement;
                    }))
                    + number.substring(indexWhereExplodingPairBegins);

        }
        return number;
    }

    private static int findPairToExplode(String reduced) {
        int level = 0;
        int indexWhereExplodingLiteralBegins = -1;
        char[] chars = reduced.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case LEFT_BRACKET:
                    level++;
                    break;
                case RIGHT_BRACKET:
                    level--;
                    break;
                default:
                    break;
            }
            if (level == 5) {
                indexWhereExplodingLiteralBegins = i;
                break;
            }
        }
        return indexWhereExplodingLiteralBegins;

    }

    static String split(String number) {
        Matcher matcher = TEN_OR_HIGHER_LITERAL_PATTERN.matcher(number);
        if (matcher.find()) {
            String literalToSplit = matcher.group(0);
            long literalValue = Long.valueOf(literalToSplit);
            long newLeft = literalValue / 2; // half, round down
            long newRight = newLeft == literalValue ? newLeft : newLeft + 1; // half, round up
            String splitNumber = matcher.replaceFirst("[" + newLeft + "," + newRight + "]");
            return splitNumber;
        }
        return number;
    }

    private Queue<String> readInput(String input) {
        Queue<String> snailfishNumbers = new LinkedList<>();
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String snailfishNumber = scanner.nextLine();
                snailfishNumbers.add(snailfishNumber);
            }
        }
        return snailfishNumbers;
    }

    private static SnailfishElement readInputNumber(String number) {
        try (Scanner scanner = new Scanner(number)) {
            return readSnailfishElement(scanner);
        }
    }

    private static SnailfishElement readSnailfishElement(Scanner scanner) {
        String literalValue = scanner.findWithinHorizon(LITERAL_PATTERN, 1);
        if (literalValue != null) {
            //Find any more numbers part of this literal
            String found = "";
            while (found != null) {
                literalValue += found;
                found = scanner.findWithinHorizon(LITERAL_PATTERN, 1);
            }

            return new SnailfishLiteral(Long.parseLong(literalValue));
        }

        scanner.skip(LEFT_BRACKET_PATTERN);
        SnailfishElement leftSide = readSnailfishElement(scanner);

        scanner.skip(COMMA_PATTERN);
        SnailfishElement rightSide = readSnailfishElement(scanner);

        scanner.skip(RIGHT_BRACKET_PATTERN);

        SnailfishElement returnValue = new SnailfishNumber(leftSide, rightSide);
        return returnValue;

    }


    private static class SnailfishNumber implements SnailfishElement {
        private SnailfishElement leftSide;
        private SnailfishElement rightSide;


        public SnailfishNumber(SnailfishElement leftSide, SnailfishElement rightSide) {
            this.leftSide = leftSide;
            this.rightSide = rightSide;
        }


        @Override
        public long getMagnitude() {
            return (3 * leftSide.getMagnitude()) + (2 * rightSide.getMagnitude());
        }


        @Override
        public String toString() {
            return "[" + leftSide + "," + rightSide + ']';
        }
    }

    private static class SnailfishLiteral implements SnailfishElement {
        private long literalValue;

        public SnailfishLiteral(long literalValue) {
            this.literalValue = literalValue;
        }

        @Override
        public long getMagnitude() {
            return literalValue;
        }

        @Override
        public String toString() {
            return String.valueOf(literalValue);
        }

    }


    private interface SnailfishElement {
        long getMagnitude();
    }


}

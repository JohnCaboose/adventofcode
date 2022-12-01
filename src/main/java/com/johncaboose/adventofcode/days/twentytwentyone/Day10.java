package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;

class Day10 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        List<Long> allLineScores = getAllLineScores(input, ScoringType.ILLEGAL_CHARACTERS);
        return sum(allLineScores);
    }

    @Override
    public long partTwoSolver(String input) {
        List<Long> allLineScores = getAllLineScores(input, ScoringType.INCOMPLETE_LINES);
        return median(allLineScores);
    }

    private List<Long> getAllLineScores(String input, ScoringType scoringType) {
        List<Long> allLineScores = new ArrayList<>();
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                long lineScore = calculateLineScore(line, scoringType);
                if (lineScore > 0) {
                    allLineScores.add(lineScore);
                }
            }
        }
        return allLineScores;
    }

    private long sum(Collection<Long> numbers) {
        return numbers.stream()
                .reduce(0L, Long::sum);
    }

    private long median(Collection<Long> numbers) {
        if (numbers.isEmpty() || numbers.size() % 2 == 0) {
            throw new IllegalArgumentException("Can't find true median, list empty or has even number of elements");
        }

        List<Long> sortedList = numbers.stream()
                .sorted()
                .toList();

        return sortedList.get(sortedList.size() / 2);
    }

    private enum ScoringType {
        INCOMPLETE_LINES, ILLEGAL_CHARACTERS
    }

    private long calculateLineScore(String line, ScoringType scoringType) {
        Deque<Character> closerStack = new ArrayDeque<>();
        for (Character currentChar : line.toCharArray()) {

            final Character expectedNextCloser = closerStack.peek();
            if (isOpener(currentChar)) {
                switch (currentChar) {
                    case '(' -> closerStack.push(')');
                    case '[' -> closerStack.push(']');
                    case '{' -> closerStack.push('}');
                    case '<' -> closerStack.push('>');
                    default -> throw new RuntimeException("Faulty code or input, currentLine: " + line);
                }
            } else if (currentChar.equals(expectedNextCloser)) {
                //Found the right closer
                closerStack.pop();
            } else {
                //Expected a closer but found the wrong closer - corrupted line
                if (scoringType.equals(ScoringType.ILLEGAL_CHARACTERS)) {
                    return getScore(currentChar, scoringType);
                } else {
                    return -1;
                }
            }

        }
        if (scoringType.equals(ScoringType.INCOMPLETE_LINES)) {

            long score = 0;
            for (Character missingCloser : closerStack) {
                score *= 5;
                score += getScore(missingCloser, scoringType);
            }
            return score;
        } else {
            return -1;
        }
    }

    private boolean isOpener(Character currentChar) {
        return switch (currentChar) {
            case '(', '[', '{', '<' -> true;
            default -> false;
        };
    }

    private long getScore(Character character, ScoringType scoringType) {
        if (scoringType.equals(ScoringType.ILLEGAL_CHARACTERS))
            return switch (character) {
                case ')' -> 3;
                case ']' -> 57;
                case '}' -> 1197;
                case '>' -> 25137;
                default -> throw new RuntimeException("Faulty code or input, character: " + character);
            };
        else if (scoringType.equals(ScoringType.INCOMPLETE_LINES)) {
            return switch (character) {
                case ')' -> 1;
                case ']' -> 2;
                case '}' -> 3;
                case '>' -> 4;
                default -> throw new RuntimeException("Faulty code or input, character: " + character);
            };
        }
        throw new RuntimeException("Faulty code or input, character: " + character);
    }


}

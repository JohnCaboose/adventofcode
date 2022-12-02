package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Day2 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        return solve(input, false);
    }

    @Override
    public long partTwoSolver(String input) {
        return solve(input, true);
    }

    private long solve(String input, boolean partTwo) {
        List<Round> rounds = readInput(input, partTwo);

        return rounds.stream()
                .mapToLong(Round::score)
                .sum();
    }

    private List<Round> readInput(String input, boolean partTwo) {
        List<Round> rounds = new ArrayList<>();
        Scanner scanner = new Scanner(input);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (partTwo) {
                rounds.add(Round.createPart2(line));
            } else {
                rounds.add(Round.createPart1(line));
            }
        }

        return rounds;
    }


    private static class Round {

        private final Move theirs;
        private final Move mine;
        private final Outcome outcome;

        private Round(Move theirs, Move mine) {
            this.theirs = theirs;
            this.mine = mine;
            this.outcome = calculateOutcome();
        }

        private Round(Move theirs, Outcome wantedOutcome) {
            this.theirs = theirs;
            this.outcome = wantedOutcome;
            this.mine = calculateMove();
        }

        public static Round createPart1(String inputLine) {
            return new Round(Move.fromLetter(firstLetter(inputLine)), Move.fromLetter(secondLetter(inputLine)));
        }

        private static String firstLetter(String inputLine) {
            return inputLine.substring(0, 1);
        }

        private static String secondLetter(String inputLine) {
            return inputLine.substring(2, 3);
        }


        public static Round createPart2(String inputLine) {
            return new Round(Move.fromLetter(firstLetter(inputLine)), Outcome.fromLetter(secondLetter(inputLine)));
        }

        public long score() {
            return mine.moveSubscore() + outcomeSubscore();
        }

        private long outcomeSubscore() {
            return switch (outcome) {
                case WIN -> 6;
                case DRAW -> 3;
                case LOSS -> 0;
            };
        }

        private Outcome calculateOutcome() {
            if (mine.beats(theirs)) {
                return Outcome.WIN;
            }

            if (mine.equals(theirs)) {
                return Outcome.DRAW;
            }

            return Outcome.LOSS;
        }

        private Move calculateMove() {
            return switch (outcome) {
                case WIN -> Move.moveThatInputBeats(Move.moveThatInputBeats(theirs));
                case DRAW -> theirs;
                case LOSS -> Move.moveThatInputBeats(theirs);
            };
        }

    }

    private enum Outcome {
        WIN,
        DRAW,
        LOSS;

        public static Outcome fromLetter(String letter) {
            return switch (letter) {
                case "Z" -> WIN;
                case "Y" -> DRAW;
                case "X" -> LOSS;
                default -> throw new IllegalArgumentException("Illegal input:" + letter);
            };
        }
    }

    private enum Move {
        ROCK,
        PAPER,
        SCISSORS;

        public static Move fromLetter(String letter) {
            return switch (letter) {
                case "A", "X" -> ROCK;
                case "B", "Y" -> PAPER;
                case "C", "Z" -> SCISSORS;
                default -> throw new IllegalArgumentException("Unrecognized letter");
            };
        }

        public long moveSubscore() {
            return switch (this) {
                case ROCK -> 1;
                case PAPER -> 2;
                case SCISSORS -> 3;
            };
        }

        public boolean beats(Move otherMove) {
            return moveThatInputBeats(this).equals(otherMove);
        }

        public static Move moveThatInputBeats(Move input) {
            return switch (input) {
                case ROCK -> SCISSORS;
                case PAPER -> ROCK;
                case SCISSORS -> PAPER;
            };
        }
    }
}

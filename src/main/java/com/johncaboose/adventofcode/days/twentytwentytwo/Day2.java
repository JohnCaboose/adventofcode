package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Day2 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        return solve(input, true);
    }

    @Override
    public long partTwoSolver(String input) {
        return solve(input, false);
    }

    private long solve(String input, boolean partOne) {
        List<Round> rounds = createRounds(input, partOne);

        // Calculate game score which is the sum of the scores of each round
        return rounds.stream()
                .mapToLong(Round::score)
                .sum();
    }

    private List<Round> createRounds(String input, boolean isPartOne) {
        List<Round> rounds = new ArrayList<>();

        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            rounds.add(Round.create(scanner.nextLine(), isPartOne));
        }

        return rounds;
    }


    private static class Round {

        private final Move mine;
        private final Outcome outcome;

        private Round(Move theirs, Move mine) {
            this.mine = mine;
            this.outcome = Outcome.fromMoves(theirs, mine);
        }

        private Round(Move theirs, Outcome wantedOutcome) {
            this.mine = calculateMyMove(wantedOutcome, theirs);
            this.outcome = wantedOutcome;
        }

        private static Round create(String inputLine, boolean isPartOne) {
            var letters = inputLine.split(" ");
            String firstLetter = letters[0];
            String secondLetter = letters[1];
            return isPartOne
                    ? new Round(Move.fromLetter(firstLetter), Move.fromLetter(secondLetter))
                    : new Round(Move.fromLetter(firstLetter), Outcome.fromLetter(secondLetter));
        }

        public long score() {
            return mine.score() + outcome.score();
        }

        private static Move calculateMyMove(Outcome outcome, Move theirs) {
            return switch (outcome) {
                case DRAW -> theirs;
                case WIN -> Move.moveThatInputLosesTo(theirs);
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
                case "X" -> LOSS;
                case "Y" -> DRAW;
                case "Z" -> WIN;
                default -> throw new IllegalArgumentException("Illegal input:" + letter);
            };
        }

        private static Outcome fromMoves(Move theirs, Move mine) {
            if (mine == theirs) {
                return Outcome.DRAW;
            }

            if (mine.beats(theirs)) {
                return Outcome.WIN;
            }

            return Outcome.LOSS;
        }

        public long score() {
            return switch (this) {
                case WIN -> 6;
                case DRAW -> 3;
                case LOSS -> 0;
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

        public long score() {
            return switch (this) {
                case ROCK -> 1;
                case PAPER -> 2;
                case SCISSORS -> 3;
            };
        }

        public boolean beats(Move otherMove) {
            return otherMove == moveThatInputBeats(this);
        }

        public static Move moveThatInputBeats(Move input) {
            return switch (input) {
                case ROCK -> SCISSORS;
                case PAPER -> ROCK;
                case SCISSORS -> PAPER;
            };
        }

        public static Move moveThatInputLosesTo(Move input) {
            return switch (input) {
                case ROCK -> PAPER;
                case PAPER -> SCISSORS;
                case SCISSORS -> ROCK;
            };
        }
    }
}

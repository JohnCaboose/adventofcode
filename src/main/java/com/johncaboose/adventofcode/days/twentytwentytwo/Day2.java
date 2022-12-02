package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Day2 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        var rounds = readInput(input);

        return rounds.stream()
                .mapToLong(Round::score)
                .sum();
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }

    private List<Round> readInput(String input) {
        List<Round> rounds = new ArrayList<>();
        Scanner scanner = new Scanner(input);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            rounds.add(new Round(line));
        }

        return rounds;
    }


    private record Round(Move otherPlayers, Move mine) {
        public Round(String inputLine) {
            this(Move.fromLetter(inputLine.substring(0, 1)), Move.fromLetter(inputLine.substring(2, 3)));
        }

        public long score() {
            return mine.moveSubscore() + outcomeSubscore();
        }

        private long outcomeSubscore() {
            return switch (outcome()) {
                case WIN -> 6;
                case DRAW -> 3;
                case LOSS -> 0;
            };
        }

        private Outcome outcome() {
            if (mine.equals(otherPlayers)) {
                return Outcome.DRAW;
            }

            if (mine.beats(otherPlayers)) {
                return Outcome.WIN;
            }

            return Outcome.LOSS;
        }

    }

    private enum Outcome {
        WIN,
        LOSS,
        DRAW
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
            return switch (this) {
                case ROCK -> SCISSORS.equals(otherMove);
                case PAPER -> ROCK.equals(otherMove);
                case SCISSORS -> PAPER.equals(otherMove);
            };
        }
    }
}

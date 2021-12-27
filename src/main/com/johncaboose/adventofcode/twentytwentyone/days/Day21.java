package com.johncaboose.adventofcode.twentytwentyone.days;

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day21 implements ISolvableDay {

    private static final List<Integer> POSSIBLE_POSITIONS = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


    @Override
    public long partOneSolver(String input) {
        List<Player> players = new ArrayList<>();
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String startPosString = line.replaceAll("Player . starting position: ", "");
                int startPos = Integer.parseInt(startPosString);
                Player player = new Player(startPos);
                players.add(player);
            }
        }
        DeterministicDice dice = new DeterministicDice();
        int winThreshold = 1000;

        while (true) {
            for (int i = 0; i < players.size(); i++) {
                Player player = players.get(i);

                int stepsToTake = dice.sumOfThreeThrows();
                player.movePlayer(stepsToTake);
                if (player.getScore() >= winThreshold) {
                    Player nextPlayer = players.get((i + 1) % players.size());
                    long finalScore = nextPlayer.getScore() * dice.getTimesThrown();
                    return finalScore;
                }
            }
        }

    }

    private static class Player {
        private int positionIndex;

        private int score = 0;

        public Player(int startPosition) {
            positionIndex = POSSIBLE_POSITIONS.indexOf(startPosition);
        }

        public void movePlayer(int steps) {
            positionIndex += steps;
            positionIndex %= POSSIBLE_POSITIONS.size();

            score += POSSIBLE_POSITIONS.get(positionIndex);
        }

        public int getPosition() {
            return POSSIBLE_POSITIONS.get(positionIndex);
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "position=" + getPosition() +
                    ", score=" + getScore() +
                    '}';
        }
    }

    private static class DeterministicDice {
        private static final int AMOUNT_OF_SIDES_ON_DICE = 100;

        private int lastThrow = 0;
        private long timesThrown = 0;

        public int sumOfThreeThrows() {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += valueOfThrow();
            }
            return sum;
        }

        public int valueOfThrow() {
            if (lastThrow == AMOUNT_OF_SIDES_ON_DICE) {
                lastThrow = 1;
            } else {
                lastThrow++;
            }
            timesThrown++;
            return lastThrow;
        }

        public long getTimesThrown() {
            return timesThrown;
        }


    }

    @Override
    public long partTwoSolver(String input) {
        Map<Integer, Long> universesPerSteps = new HashMap<>();
        universesPerSteps.put(3, 1L);
        universesPerSteps.put(4, 3L);
        universesPerSteps.put(5, 6L);
        universesPerSteps.put(6, 7L);
        universesPerSteps.put(7, 6L);
        universesPerSteps.put(8, 3L);
        universesPerSteps.put(9, 1L);

        for (int winThreshold = 1; winThreshold < 21; winThreshold++) {
            solvePart2(input, universesPerSteps, winThreshold);
        }

        int winThreshold = 21;

        long solution = solvePart2(input, universesPerSteps, winThreshold);
        return solution;
    }

    private long solvePart2(String input, Map<Integer, Long> universesPerSteps, int winThreshold) {
        int player1StartPos = getPlayerStartingPosition("1", input);
        Map<Universe, Long> player1Universes = startUniverse(player1StartPos);

        int player2StartPos = getPlayerStartingPosition("2", input);
        Map<Universe, Long> player2Universes = startUniverse(player2StartPos);

        long player1Wins = 0;
        long player2Wins = 0;

        while (!player1Universes.isEmpty() && !player2Universes.isEmpty()) {
            player1Universes = calculateUniversesAtStep(player1Universes, player2Universes, universesPerSteps);
            player1Wins += universesWithPlayerWins(player1Universes, player2Universes, winThreshold);

            player2Universes = calculateUniversesAtStep(player2Universes, player1Universes, universesPerSteps);
            player2Wins += universesWithPlayerWins(player2Universes, player1Universes, winThreshold);

        }
        System.out.println("win score: %2d, p1 wins: %20d, p2 wins: %20d".formatted(winThreshold, player1Wins, player2Wins)); //TODO remove
        return Math.max(player1Wins, player2Wins);
    }

    private static Map<Universe, Long> startUniverse(int startingPos) {
        Map<Universe, Long> universes = new HashMap<>();
        universes.put(new Universe(0, startingPos), 1L);
        return universes;
    }

    private static Map<Universe, Long> calculateUniversesAtStep(Map<Universe, Long> lastRound, Map<Universe, Long> otherPlayerUniverses, Map<Integer, Long> universesPerSteps) {
        Map<Universe, Long> currentRound = new HashMap<>();

        // This whole thing should be possible to parallelize, if I can be bothered
        for (Entry<Universe, Long> lastRoundUniverseWithAmount : lastRound.entrySet()) {
            Universe initialUniverse = lastRoundUniverseWithAmount.getKey();

            for (Entry<Integer, Long> universesForStep : universesPerSteps.entrySet()) {
                // Calculate the result universe based on amount of steps to take and initial universe
                int indexOfCurrentPosition = POSSIBLE_POSITIONS.indexOf(initialUniverse.position());
                int indexOfNewPosition = (indexOfCurrentPosition + universesForStep.getKey()) % POSSIBLE_POSITIONS.size();
                int resultPosition = POSSIBLE_POSITIONS.get(indexOfNewPosition);
                int resultScore = initialUniverse.score() + resultPosition;
                Universe resultUniverse = new Universe(resultScore, resultPosition);

                // Calculate and add the amount of result universes that spawned from this loop-iteration
                long amountOfResultUniversesToAdd = lastRoundUniverseWithAmount.getValue() * universesForStep.getValue();
                long totalResultUniverses = currentRound.getOrDefault(resultUniverse, 0L) + amountOfResultUniversesToAdd;
                currentRound.put(resultUniverse, totalResultUniverses);
            }

        }

        // For every way there is for the current player to get their universes, the other person can exist in all of their universes
        long amountOfOtherUniverses = otherPlayerUniverses.values()
                .stream()
                .mapToLong(l -> l)
                .sum();
        for (Entry<Universe, Long> entry : currentRound.entrySet()) {
            entry.setValue(entry.getValue() * amountOfOtherUniverses);
        }

        return currentRound;
    }

    private static long universesWithPlayerWins(Map<Universe, Long> winningPlayerUniverses,
                                                Map<Universe, Long> losingPlayerUniverses, int winThreshold) {
        List<Entry<Universe, Long>> winningPlayerEntries = winningPlayerUniverses.entrySet()
                .stream()
                .filter(entry -> entry.getKey().score >= winThreshold)
                .toList();

        long amountOfUniversesThatAreFinished = winningPlayerEntries.stream()
                .mapToLong(entry -> entry.getValue())
                .sum();

        List<Universe> finishedUniverses = winningPlayerEntries.stream()
                .map(entry -> entry.getKey())
                .toList();

        for (Universe key : finishedUniverses) {
            winningPlayerUniverses.remove(key);
        }

        return amountOfUniversesThatAreFinished;
    }

    private record Universe(int score, int position) {

    }

    private static int getPlayerStartingPosition(String playerName, String input) {
        Matcher matcher = Pattern.compile("Player " + playerName + " starting position: ([0-9]+)")
                .matcher(input);
        matcher.find();
        int startingPosition = Integer.parseInt(matcher.group(1));
        return startingPosition;
    }
}

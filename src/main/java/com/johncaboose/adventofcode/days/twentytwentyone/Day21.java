package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Day21 implements ISolvableDay {

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
                    return nextPlayer.getScore() * dice.getTimesThrown(); //final score
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

        int winThreshold = 21;

        int player1StartPos = getPlayerStartingPosition("1", input);
        Map<Universe, Long> player1Universes = startUniverse(player1StartPos);

        int player2StartPos = getPlayerStartingPosition("2", input);
        Map<Universe, Long> player2Universes = startUniverse(player2StartPos);

        long player1Wins = 0;
        long player2Wins = 0;

        while (!player1Universes.isEmpty() && !player2Universes.isEmpty()) {
            player1Universes = calculateUniversesAtStep(player1Universes, universesPerSteps);
            player1Wins += universesWithPlayerWins(player1Universes, player2Universes, winThreshold);

            player2Universes = calculateUniversesAtStep(player2Universes, universesPerSteps);
            player2Wins += universesWithPlayerWins(player2Universes, player1Universes, winThreshold);

        }
        return Math.max(player1Wins, player2Wins);
    }

    private static Map<Universe, Long> startUniverse(int startingPos) {
        Map<Universe, Long> universes = new HashMap<>();
        universes.put(new Universe(0, startingPos), 1L);
        return universes;
    }

    private static Map<Universe, Long> calculateUniversesAtStep(Map<Universe, Long> lastRound, Map<Integer, Long> universesPerSteps) {
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


        return currentRound;
    }

    private static long universesWithPlayerWins(Map<Universe, Long> lastActivePlayerUniverses,
                                                Map<Universe, Long> otherPlayerUniverses, int winThreshold) {

        Map<Universe, Long> winningUniverses = lastActivePlayerUniverses.entrySet()
                .stream()
                .filter(entry -> entry.getKey().score >= winThreshold)
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

        long winningUniverseCount = winningUniverses.values()
                .stream()
                .mapToLong(l -> l)
                .sum();

        //Remove universes that are wins from the
        for (Universe key : winningUniverses.keySet()) {
            lastActivePlayerUniverses.remove(key);
        }

        // For every universe the active player can win, there is a certain amount of ways the other player can lose
        long amountOfOtherUniverses = otherPlayerUniverses.values()
                .stream()
                .mapToLong(l -> l)
                .sum();

        return winningUniverseCount * amountOfOtherUniverses;
    }

    private record Universe(int score, int position) {

    }

    private static int getPlayerStartingPosition(String playerName, String input) {
        Matcher matcher = Pattern.compile("Player " + playerName + " starting position: ([0-9]+)")
                .matcher(input);
        boolean found = matcher.find();
        if (!found) {
            throw new IllegalArgumentException("Could not find the starting position of the player");
        }
        return Integer.parseInt(matcher.group(1));
    }
}

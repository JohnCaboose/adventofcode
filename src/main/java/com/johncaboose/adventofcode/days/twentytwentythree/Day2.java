package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Day2 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day2.class);
    private static final Pattern GAME_ID_PATTERN = Pattern.compile("Game (?<gameid>\\d+):");
    private static final Pattern RED_COUNT_PATTERN = Pattern.compile("(?<count>\\d+) red");
    private static final Pattern GREEN_COUNT_PATTERN = Pattern.compile("(?<count>\\d+) green");
    private static final Pattern BLUE_COUNT_PATTERN = Pattern.compile("(?<count>\\d+) blue");


    @Override
    public Long partOneSolver(String input) {
        //Restrictions
        long redMax = 12;
        long greenMax = 13;
        long blueMax = 14;

        List<Game> games = parseInput(input);

        return games.stream()
                .filter(game -> game.isPossible(redMax, greenMax, blueMax))
                .mapToLong(Game::id)
                .sum();
    }

    @Override
    public Long partTwoSolver(String input) {
        List<Game> games = parseInput(input);
        return games.stream()
                .mapToLong(Game::power)
                .sum();
    }

    private record Game(long id, List<Subset> subsets) {

        public boolean isPossible(long redMax, long greenMax, long blueMax) {
            return subsets.stream()
                    .allMatch(subset -> subset.isPossible(redMax, greenMax, blueMax));
        }

        public long power() {
            //find minimum cube count required for the game to be possible
            long red = max(Subset::red);
            long green = max(Subset::green);
            long blue = max(Subset::blue);
            //power is defined as counts multiplied together
            return red * green * blue;
        }

        private long max(java.util.function.ToLongFunction<Subset> mapper) {
            return subsets().stream()
                    .mapToLong(mapper)
                    .max()
                    .orElse(0);
        }

    }

    private record Subset(long red, long green, long blue) {
        public boolean isPossible(long redMax, long greenMax, long blueMax) {
            return red <= redMax && green <= greenMax && blue <= blueMax;
        }
    }

    private static List<Game> parseInput(String input) {
        List<Game> games = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Game game = parseGame(line);
            games.add(game);
        }
        return games;
    }

    private static Game parseGame(String line) {
        long id = parseGameId(line);
        List<Subset> subsets = parseGameSubsets(line);
        return new Game(id, subsets);
    }

    private static long parseGameId(String line) {
        Matcher matcher = GAME_ID_PATTERN.matcher(line);
        if (!matcher.find()) {
            throw new IllegalArgumentException("Couldn't find id in " + line);
        }
        String id = matcher.group("gameid");
        return Long.parseLong(id);
    }

    private static List<Subset> parseGameSubsets(String line) {
        //parseSubset is good enough that it doesn't matter that game id is present in the first subset string
        return Arrays.stream(line.split(";"))
                .map(Day2::parseSubset)
                .collect(Collectors.toList());
    }

    private static Subset parseSubset(String subset) {
        return new Subset(
                parseColorCount(subset, RED_COUNT_PATTERN),
                parseColorCount(subset, GREEN_COUNT_PATTERN),
                parseColorCount(subset, BLUE_COUNT_PATTERN)
        );
    }

    private static long parseColorCount(String subset, Pattern colorCountPattern) {
        Matcher matcher = colorCountPattern.matcher(subset);
        if (matcher.find()) {
            return Long.parseLong(matcher.group("count"));
        } else {
            //Color not present in subset
            return 0;
        }
    }
}

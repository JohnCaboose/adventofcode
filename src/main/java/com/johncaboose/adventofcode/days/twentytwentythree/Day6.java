package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.exceptions.ParseException;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Interval;
import com.johncaboose.adventofcode.shared.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

class Day6 implements ISolvableDay<Long> {

    private static final Logger log = LogManager.getLogger(Day6.class);

    @Override
    public Long partOneSolver(String input) {
        List<Race> races = parsePart1Input(input);

        return races.stream()
                .mapToLong(Race::waysToWin)
                .reduce(1, Math::multiplyExact);
    }


    @Override
    public Long partTwoSolver(String input) {
        Race race = parsePart2Input(input);

        return race.waysToWin();
    }

    private record Race(long time, long distance) {
        public long waysToWin() {
            double sqrt = Math.sqrt((Math.pow(time, 2)) - 4 * distance);

            double firstSolution = (time - sqrt) / 2;
            double lastSolution = (time + sqrt) / 2;

            //if solutions are integers they only tie the race, we need a win
            if ((firstSolution % 1) == 0) {
                firstSolution++;
            }
            if ((lastSolution % 1) == 0) {
                lastSolution--;
            }
            //Only count integer solutions
            long actualLast = (long) Math.floor(lastSolution);
            long actualFirst = (long) Math.ceil(firstSolution);

            long waysToWin = new Interval(actualFirst, actualLast).size();

            log.debug("{}, ways to win: {}", this, waysToWin);
            return waysToWin;
        }
    }

    private static List<Race> parsePart1Input(String input) {
        String[] split = input.split("\n");
        List<Long> times = Utils.populateListWithLongs(split[0].substring("Time:      ".length()));
        List<Long> distances = Utils.populateListWithLongs(split[1].substring("Distance:  ".length()));

        if (times.size() != distances.size()) {
            throw new ParseException("amount of times and distances have to match");
        }

        List<Race> races = new ArrayList<>();

        for (int i = 0; i < times.size(); i++) {
            Race race = new Race(times.get(i), distances.get(i));
            races.add(race);
        }

        return races;
    }

    private static Race parsePart2Input(String input) {
        String[] split = input.split("\n");
        long time = Long.parseLong(split[0].substring("Time:      ".length()).replaceAll(" ", ""));
        long distance = Long.parseLong(split[1].substring("Distance:  ".length()).replaceAll(" ", ""));
        return new Race(time, distance);
    }
}

package com.johncaboose.adventofcode.days.twentytwenty;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Interval;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

class Day5 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day5.class);

    @Override
    public Long partOneSolver(String input) {
        List<String> boardingPasses = parseInput(input);
        return boardingPasses.stream()
                .map(Day5::seatId)
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);
    }

    @Override
    public Long partTwoSolver(String input) {
        List<String> boardingPasses = parseInput(input);
        List<Long> seatIds = boardingPasses.stream()
                .map(Day5::seatId)
                .sorted()
                .toList();

        for (int i = 1; i < seatIds.size(); i++) {
            long previous = seatIds.get(i - 1);
            long current = seatIds.get(i);

            if (previous + 2 == current) {
                return previous + 1;
            }
        }

        return -1L;
    }

    private static List<String> parseInput(String input) {
        String[] boardingPasses = input.split("\n");
        return List.of(boardingPasses);
    }

    private static long seatId(String boardingPass) {
        if (boardingPass.length() != 10) {
            throw new IllegalArgumentException("Boarding pass length not 10, input: " + boardingPass);
        }

        long row = reduce(boardingPass.substring(0, 7), new Interval(0, 127));
        long column = reduce(boardingPass.substring(7, 10), new Interval(0, 7));

        return (row * 8) + column;
    }

    private static long reduce(String instructions, Interval interval) {
        for (int i = 0; i < instructions.length(); i++) {
            String letter = instructions.substring(i, i + 1);
            if (letter.equals("B") || letter.equals("R")) {
                interval = interval.halve(true);
            } else if (letter.equals("F") || letter.equals("L")) {
                interval = interval.halve(false);
            } else {
                throw new IllegalArgumentException("letter was: " + letter + ", as part of line: " + instructions);
            }
        }
        if (interval.size() != 1) {
            throw new IllegalStateException("didn't result in one number");
        }
        return interval.startInclusive();
    }
}

package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

class Day6 implements ISolvableDay<Long> {

    private static final int START_OF_PACKET_MARKER_LENGTH = 4;
    private static final int START_OF_MESSAGE_MARKER_LENGTH = 14;

    @Override
    public Long partOneSolver(String input) {
        return solve(input, START_OF_PACKET_MARKER_LENGTH);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, START_OF_MESSAGE_MARKER_LENGTH);
    }

    private static long solve(String input, int markerLength) {
        for (int i = markerLength; i < input.length(); i++) {
            String potentialMarker = input.substring(i - markerLength, i);
            if (isMarker(potentialMarker, markerLength)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isMarker(String candidate, int markerLength) {
        return candidate.codePoints().distinct().count() == markerLength;
    }
}

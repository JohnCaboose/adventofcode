package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.Couple;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Day4 implements ISolvableDay<Long> {

    @Override
    public Long partOneSolver(String input) {
        List<Couple<Interval, Interval>> assignmentPairs = createAssignmentPairs(input);
        return assignmentPairs.stream()
                .filter(Day4::oneIntervalCompletelyInsideOther)
                .count();
    }

    @Override
    public Long partTwoSolver(String input) {
        List<Couple<Interval, Interval>> assignmentPairs = createAssignmentPairs(input);
        return assignmentPairs.stream()
                .filter(pair -> pair.first().overlaps(pair.second()))
                .count();
    }

    private static List<Couple<Interval, Interval>> createAssignmentPairs(String input) {
        List<Couple<Interval, Interval>> allAssignments = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            allAssignments.add(createAssignmentPair(scanner.nextLine()));
        }
        return allAssignments;
    }

    private static Couple<Interval, Interval> createAssignmentPair(String line) {
        String[] intervals = line.split(",");
        return new Couple<>(Interval.fromString(intervals[0]), Interval.fromString(intervals[1]));
    }

    private static boolean oneIntervalCompletelyInsideOther(Couple<Interval, Interval> intervalPair) {
        Interval first = intervalPair.first();
        Interval second = intervalPair.second();
        return first.completelyInside(second) || second.completelyInside(first);
    }

}

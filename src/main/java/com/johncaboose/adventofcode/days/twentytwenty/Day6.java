package com.johncaboose.adventofcode.days.twentytwenty;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

class Day6 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day6.class);

    private static final Set<Integer> ALL_QUESTIONS = "abcdefghijklmnopqrstuvwxyz".chars()
            .boxed()
            .collect(Collectors.toSet());

    @Override
    public Long partOneSolver(String input) {
        return solve(input, true);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, false);
    }

    private static long solve(String input, boolean part1) {
        List<Set<Integer>> answersPerGroup = parseInput(input, part1);
        return answersPerGroup.stream()
                .map(Set::size) // amount of answers per group
                .mapToLong(Long::valueOf)
                .sum(); // sum of all groups answers
    }

    private static List<Set<Integer>> parseInput(String input, boolean part1) {
        //finish all groups with an empty line, for parsing purposes
        input += System.lineSeparator() + System.lineSeparator();

        if (part1) {
            return parseInputPart1(input);
        } else {
            return parseInputPart2(input);
        }

    }

    private static List<Set<Integer>> parseInputPart1(String input) {
        Scanner scanner = new Scanner(input);

        List<Set<Integer>> answersPerGroup = new ArrayList<>();
        Set<Integer> answeredByAnyoneInGroup = new HashSet<>();
        while (scanner.hasNextLine()) {
            String onePersonsAnswers = scanner.nextLine();
            if (onePersonsAnswers.isBlank()) {
                answersPerGroup.add(answeredByAnyoneInGroup);
                answeredByAnyoneInGroup = new HashSet<>();
                continue;
            }
            Set<Integer> answeredByThePerson = onePersonsAnswers.chars().boxed().collect(Collectors.toSet());
            answeredByAnyoneInGroup.addAll(answeredByThePerson);
        }
        return answersPerGroup;
    }


    private static List<Set<Integer>> parseInputPart2(String input) {
        Scanner scanner = new Scanner(input);
        List<Set<Integer>> answersPerGroup = new ArrayList<>();
        Set<Integer> answeredByAllInTheGroup = new HashSet<>(ALL_QUESTIONS);
        while (scanner.hasNextLine()) {
            String onePersonsAnswers = scanner.nextLine();
            if (onePersonsAnswers.isBlank()) {
                answersPerGroup.add(answeredByAllInTheGroup);
                answeredByAllInTheGroup = new HashSet<>(ALL_QUESTIONS);
                continue;
            }
            Set<Integer> notAnsweredByThePerson = new HashSet<>(ALL_QUESTIONS);
            notAnsweredByThePerson.removeAll(onePersonsAnswers.chars().boxed().collect(Collectors.toSet()));

            answeredByAllInTheGroup.removeAll(notAnsweredByThePerson);
        }
        return answersPerGroup;
    }
}

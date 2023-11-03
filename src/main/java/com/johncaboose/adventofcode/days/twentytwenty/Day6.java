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
        List<Set<Integer>> groupsAnswers = parseInputPart1(input);
        return solve(groupsAnswers);
    }


    @Override
    public Long partTwoSolver(String input) {
        List<Set<Integer>> groupsAnswers = parseInputPart2(input);
        return solve(groupsAnswers);
    }

    private static long solve(List<Set<Integer>> groupsAnswers) {
        return groupsAnswers.stream()
                .map(Set::size)
                .mapToLong(Long::valueOf)
                .sum();
    }

    private static List<Set<Integer>> parseInputPart1(String input) {
        List<Set<Integer>> answersPerGroup = new ArrayList<>();

        Scanner scanner = new Scanner(input);
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
        answersPerGroup.add(answeredByAnyoneInGroup);
        return answersPerGroup;
    }

    private static List<Set<Integer>> parseInputPart2(String input) {
        List<Set<Integer>> groups = new ArrayList<>();

        Scanner scanner = new Scanner(input);
        Set<Integer> answeredByAllInTheGroup = new HashSet<>(ALL_QUESTIONS);
        while (scanner.hasNextLine()) {
            String onePersonsAnswers = scanner.nextLine();
            if (onePersonsAnswers.isBlank()) {
                groups.add(answeredByAllInTheGroup);
                answeredByAllInTheGroup = new HashSet<>(ALL_QUESTIONS);
                continue;
            }
            Set<Integer> notAnsweredByThePerson = new HashSet<>(ALL_QUESTIONS);
            notAnsweredByThePerson.removeAll(onePersonsAnswers.chars().boxed().collect(Collectors.toSet()));

            answeredByAllInTheGroup.removeAll(notAnsweredByThePerson);
        }
        groups.add(answeredByAllInTheGroup);
        return groups;
    }
}

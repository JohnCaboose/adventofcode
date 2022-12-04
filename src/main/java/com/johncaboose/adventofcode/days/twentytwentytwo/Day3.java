package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;
import java.util.stream.Collectors;

class Day3 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        List<Rucksack> rucksacks = readInput(input);

        return rucksacks.stream()
                .map(Rucksack::intersection)
                .flatMap(Set::stream)
                .map(Day3::score)
                .mapToLong(Long::longValue)
                .sum();
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }

    private List<Rucksack> readInput(String input) {
        List<Rucksack> rucksacks = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            rucksacks.add(createRucksack(scanner.nextLine()));
        }
        return rucksacks;
    }

    private static Rucksack createRucksack(String line) {
        String firstHalf = line.substring(0, line.length() / 2);
        String secondHalf = line.substring(line.length() / 2);
        return new Rucksack(createCompartment(firstHalf), createCompartment(secondHalf));
    }

    private static Set<Integer> createCompartment(String letters) {
        return letters.codePoints()
                .boxed()
                .collect(Collectors.toSet());

    }

    private record Rucksack(Set<Integer> firstCompartment, Set<Integer> secondCompartment) {

        public Set<Integer> intersection() {
            Set<Integer> intersection = new HashSet<>(firstCompartment);
            intersection.retainAll(secondCompartment);
            return intersection;
        }
    }

    private static long score(Integer s) {
        if (s > 96) {
            return s - 96;
        }
        return s - 64 + 26;
    }

}

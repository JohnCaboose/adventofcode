package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;
import java.util.stream.Collectors;

class Day3 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        List<Rucksack> rucksacks = createRucksacks(input);

        return rucksacks.stream()
                // find the items found in both compartments of each rucksack
                .map(Rucksack::intersection)
                // find the priorities of all these items
                .flatMap(Set::stream)
                .map(Day3::priority)
                // sum the priorities for the solution
                .mapToLong(Long::longValue)
                .sum();
    }

    @Override
    public long partTwoSolver(String input) {
        List<Rucksack> rucksacks = createRucksacks(input);
        List<List<Rucksack>> groups = groupedRucksacks(rucksacks);

        return groups.stream()
                // find the items found in all rucksacks in the group, for each group
                .map(Day3::intersection)
                // find the priorities of all these items
                .flatMap(Set::stream)
                .map(Day3::priority)
                // sum the priorities for the solution
                .mapToLong(Long::longValue)
                .sum();
    }

    private List<Rucksack> createRucksacks(String input) {
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

        public Set<Integer> union() {
            Set<Integer> union = new HashSet<>(firstCompartment);
            union.addAll(secondCompartment);
            return union;
        }
    }

    /**
     * @param rucksacks list of all rucksacks
     * @return list of all groups of rucksacks, three per group.
     */
    private static List<List<Rucksack>> groupedRucksacks(List<Rucksack> rucksacks) {
        List<List<Rucksack>> groups = new ArrayList<>();
        List<Rucksack> currentGroup = new ArrayList<>();
        for (int i = 0; i < rucksacks.size(); i++) {
            if (i % 3 == 0) {
                currentGroup = new ArrayList<>();
                groups.add(currentGroup);
            }
            currentGroup.add(rucksacks.get(i));
        }
        return groups;
    }

    /**
     * @param group a group of rucksacks, size must be exactly 3
     * @return the intersection of integers contained in all rucksacks (regardless of compartment)
     */
    private static Set<Integer> intersection(List<Rucksack> group) {
        if (group.size() != 3) {
            throw new IllegalArgumentException("group must have 3 members");
        }

        List<Set<Integer>> rucksacksWithCombinedCompartments = group.stream()
                .map(Rucksack::union)
                .toList();

        Set<Integer> intersection = new HashSet<>(rucksacksWithCombinedCompartments.get(0));
        intersection.retainAll(rucksacksWithCombinedCompartments.get(1));
        intersection.retainAll(rucksacksWithCombinedCompartments.get(2));

        return intersection;
    }

    /**
     * The priority is 1-26 for a-z, and 27-52 for A-Z.
     *
     * @param codePoint the unicode codepoint of a-z, A-Z
     * @return the priority of the letter
     */
    private static long priority(Integer codePoint) {
        if (codePoint > 96) {
            return codePoint - 96;
        }
        return codePoint - 64 + 26;
    }

}

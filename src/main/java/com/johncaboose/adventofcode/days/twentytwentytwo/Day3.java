package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;

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
        List<List<Rucksack>> groups = groupRucksacks(rucksacks);

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
            rucksacks.add(new Rucksack(scanner.nextLine()));
        }
        return rucksacks;
    }


    private record Rucksack(List<Integer> codePoints) {

        public Rucksack(String items) {
            this(items.codePoints().boxed().toList());
        }

        public Set<Integer> intersection() {
            int size = codePoints.size();
            List<Integer> firstCompartment = codePoints.subList(0, size / 2);
            List<Integer> secondCompartment = codePoints.subList(size / 2, size);

            Set<Integer> intersection = new HashSet<>(firstCompartment);
            intersection.retainAll(secondCompartment);
            return intersection;
        }

    }

    /**
     * @param rucksacks list of all rucksacks
     * @return list of all groups of rucksacks, three per group.
     */
    private static List<List<Rucksack>> groupRucksacks(List<Rucksack> rucksacks) {
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
     * @param group a group of rucksacks, size must be exactly 3 as per problem description
     * @return the intersection of integers contained in all rucksacks (regardless of compartment)
     */
    private static Set<Integer> intersection(List<Rucksack> group) {
        Set<Integer> intersection = new HashSet<>(group.get(0).codePoints());
        intersection.retainAll(group.get(1).codePoints());
        intersection.retainAll(group.get(2).codePoints());
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

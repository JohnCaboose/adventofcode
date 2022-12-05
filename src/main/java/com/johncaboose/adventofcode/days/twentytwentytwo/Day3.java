package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;

class Day3 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        List<Rucksack> rucksacks = createRucksacks(input);

        return rucksacks.stream()
                // find the items found in both compartments of each rucksack
                .map(Rucksack::commonItems)
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
        List<Group> groups = groupRucksacks(rucksacks);

        return groups.stream()
                // find the items found in all rucksacks in the group, for each group
                .map(Group::commonItems)
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

        /**
         * @return the set of items shared between the two compartments
         */
        public Set<Integer> commonItems() {
            int size = codePoints.size();
            List<Integer> firstCompartment = codePoints.subList(0, size / 2);
            List<Integer> secondCompartment = codePoints.subList(size / 2, size);

            Set<Integer> intersection = new HashSet<>(firstCompartment);
            intersection.retainAll(secondCompartment);
            return intersection;
        }

    }

    private record Group(List<Rucksack> rucksacks) {

        public void add(Rucksack rucksack) {
            rucksacks.add(rucksack);
        }

        /**
         * @return the intersection of codePoints contained in all rucksacks (regardless of compartment)
         */
        private Set<Integer> commonItems() {
            if (rucksacks.size() != 3) {
                throw new IllegalStateException("Group must contain 3 rucksacks");
            }

            Set<Integer> intersection = new HashSet<>(rucksacks.get(0).codePoints());
            intersection.retainAll(rucksacks.get(1).codePoints());
            intersection.retainAll(rucksacks.get(2).codePoints());
            return intersection;
        }
    }

    /**
     * @param rucksacks list of all rucksacks
     * @return list of all groups of rucksacks, three per group.
     */
    private static List<Group> groupRucksacks(List<Rucksack> rucksacks) {
        List<Group> groups = new ArrayList<>();

        Group currentGroup = new Group(new ArrayList<>());
        groups.add(currentGroup);

        for (int i = 0; i < rucksacks.size(); i++) {
            if (i > 0 && i % 3 == 0) {
                currentGroup = new Group(new ArrayList<>());
                groups.add(currentGroup);
            }
            currentGroup.add(rucksacks.get(i));
        }
        
        return groups;
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

package com.johncaboose.adventofcode.days.twentytwenty;

import com.johncaboose.adventofcode.shared.ExtendedHashMap;
import com.johncaboose.adventofcode.shared.ExtendedMap;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Day7 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day7.class);

    private static final Pattern CONTAINED_BAGS = Pattern.compile("(\\d+) ([\\w ]+) bags?");

    @Override
    public Long partOneSolver(String input) {
        ExtendedMap<String, Bag> allBags = readInput(input);
        Bag shinyGoldBag = allBags.get("shiny gold");

        Set<String> parentalColors = new HashSet<>();
        List<Bag> parents = shinyGoldBag.getParents();
        while (!parents.isEmpty()) {
            parentalColors.addAll(
                    parents.stream()
                            .map(Bag::getColor)
                            .collect(Collectors.toSet())
            );

            parents = parents.stream()
                    .map(Bag::getParents)
                    .flatMap(List::stream)
                    .collect(Collectors.toList());
        }


        return (long) parentalColors.size();
    }

    @Override
    public Long partTwoSolver(String input) {
        ExtendedMap<String, Bag> allBags = readInput(input);
        Bag shinyGoldBag = allBags.get("shiny gold");
        return shinyGoldBag.containedBagCount();
    }

    private static ExtendedMap<String, Bag> readInput(String input) {
        ExtendedMap<String, Bag> allBags = new ExtendedHashMap<>();

        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] nameAndContents = line.split(" bags contain ");
            String bagColor = nameAndContents[0];
            //Create or find the bag this line is about
            Bag bag = findBag(allBags, bagColor);

            //Create or find the bags the bag contains
            String contents = nameAndContents[1];
            Matcher matcher = CONTAINED_BAGS.matcher(contents);
            while (matcher.find()) {
                long amountContained = Long.parseLong(matcher.group(1));
                String contentColor = matcher.group(2);

                Bag contentBag = findBag(allBags, contentColor);
                addBagRelationship(bag, contentBag, amountContained);
            }

        }

        return allBags;
    }

    private static void addBagRelationship(Bag parent, Bag child, long amountOfChildren) {
        parent.getChildren().put(child, amountOfChildren);
        child.getParents().add(parent);
    }

    private static Bag findBag(ExtendedMap<String, Bag> allBags, String bagColor) {
        return allBags.getOrStoreDefault(bagColor, () -> new Bag(bagColor));
    }


    private static class Bag {
        private final String color;
        private final Map<Bag, Long> children = new HashMap<>();
        private final List<Bag> parents = new ArrayList<>();
        private Long containedBagCount = null;

        private Bag(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public Map<Bag, Long> getChildren() {
            return children;
        }

        public List<Bag> getParents() {
            return parents;
        }

        public long containedBagCount() {
            if (containedBagCount != null) {
                return containedBagCount;
            }
            long temp = 0;
            for (Map.Entry<Bag, Long> entry : getChildren().entrySet()) {
                Long childCount = entry.getValue();
                Bag child = entry.getKey();
                temp += childCount;
                temp += childCount * child.containedBagCount();
            }
            return containedBagCount = temp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bag bag = (Bag) o;
            return Objects.equals(color, bag.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return color + " bag";
        }
    }
}

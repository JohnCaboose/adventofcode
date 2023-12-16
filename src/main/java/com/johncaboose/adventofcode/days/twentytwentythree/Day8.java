package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.shared.Couple;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Day8 implements ISolvableDay<Long> {

    private static final Logger log = LogManager.getLogger(Day8.class);

    @Override
    public Long partOneSolver(String input) {
        Couple<List<Direction>, Map<String, String>> couple = parseInput(input);

        List<Direction> directions = couple.first();
        Map<String, String> mapping = couple.second();

        String destinationNode = "ZZZ";
        String currentNode = "AAA";
        return distance(currentNode, destinationNode, directions, mapping, false);
    }

    @Override
    public Long partTwoSolver(String input) {
        Couple<List<Direction>, Map<String, String>> couple = parseInput(input);

        List<Direction> directions = couple.first();
        Map<String, String> mapping = couple.second();

        List<String> startNodes = findStartNodes(mapping);

        //Assume that we go in loops where the solution is found via LCM
        return startNodes.stream()
                .parallel()
                .map(startNode -> distance(startNode, null, directions, mapping, true))
                .mapToLong(l -> l)
                .reduce(1L, ArithmeticUtils::lcm);
    }

    private static long distance(String startNode,
                                 String destinationNode,
                                 List<Direction> directions,
                                 Map<String, String> mapping,
                                 boolean part2) {
        String currentNode = startNode;
        long stepsTaken = 0;
        for (; part2 ? currentNode.charAt(2) != 'Z' : !currentNode.equals(destinationNode); stepsTaken++) {
            int index = (int) stepsTaken % directions.size();
            Direction direction = directions.get(index);

            String key = currentNode + direction;
            currentNode = mapping.get(key);
        }
        return stepsTaken;
    }

    private static List<String> findStartNodes(Map<String, String> mapping) {
        return mapping.keySet()
                .stream()
                .parallel()
                .map(key -> key.substring(0, 3))
                .filter(key -> key.charAt(2) == 'A')
                .toList();
    }


    private enum Direction {
        L,
        R
    }

    private static Couple<List<Direction>, Map<String, String>> parseInput(String input) {
        String[] split = input.split("\n\n");

        List<Direction> directions = new ArrayList<>();
        for (char c : split[0].toCharArray()) {
            directions.add(Direction.valueOf(String.valueOf(c)));
        }

        Map<String, String> mapping = new HashMap<>();
        Matcher matcher = Pattern.compile("(?<source>\\w{3}) = \\((?<left>\\w{3}), (?<right>\\w{3})\\)")
                .matcher(input);
        while (matcher.find()) {
            String source = matcher.group("source");
            String left = matcher.group("left");
            String right = matcher.group("right");

            mapping.put(source + Direction.L, left);
            mapping.put(source + Direction.R, right);
        }
        return Couple.of(directions, mapping);
    }
}

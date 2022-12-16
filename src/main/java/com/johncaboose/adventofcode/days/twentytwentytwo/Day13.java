package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

class Day13 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day13.class);
    private static final String NUMBER_PATTERN = "\\d+";
    private static final String LEFT_BRACKET_PATTERN = "\\[";
    private static final String RIGHT_BRACKET_PATTERN = "]";
    private static final String COMMA_PATTERN = ",";

    @Override
    public Long partOneSolver(String input) {
        return solve(input);
    }

    @Override
    public Long partTwoSolver(String input) {
        return null;
    }

    private static long solve(String input) {
        Map<Integer, PacketPair> packetPairs = parseInput(input);

        return packetPairs.entrySet()
                .stream()
                .filter(e -> e.getValue().rightOrder())
                .mapToInt(Map.Entry::getKey)
                .sum();
    }

    private static Map<Integer, PacketPair> parseInput(String input) {
        String[] coupleStrings = input.split("\n\n");
        Map<Integer, PacketPair> map = new TreeMap<>();
        for (int i = 0; i < coupleStrings.length; i++) {
            map.put(i + 1, parsePacketCouple(coupleStrings[i]));
        }
        return map;
    }

    private static PacketPair parsePacketCouple(String packetPair) {
        String[] packets = packetPair.split("\n");
        return new PacketPair(parsePacket(packets[0]), parsePacket(packets[1]));
    }

    private static PacketContent parsePacket(String line) {
        Scanner scanner = new Scanner(line);
        return parsePacketContent(scanner);
    }

    private static PacketContent parsePacketContent(Scanner scanner) {
        scanner.useDelimiter("");
        Deque<PacketContent> stack = new ArrayDeque<>();

        while (scanner.hasNext()) {
            if (scanner.hasNext(NUMBER_PATTERN)) {
                String number = "";
                do {
                    number += scanner.next(NUMBER_PATTERN);

                } while (scanner.hasNext(NUMBER_PATTERN));
                int value = Integer.parseInt(number);
                stack.peekFirst().list.add(new PacketContent(value));
                continue;
            }

            if (scanner.hasNext(LEFT_BRACKET_PATTERN)) {
                scanner.next(LEFT_BRACKET_PATTERN);
                PacketContent content = new PacketContent(new ArrayList<>());
                if (!stack.isEmpty()) {
                    stack.peekFirst().list.add(content);
                }
                stack.addFirst(content);

                continue;
            }

            if (scanner.hasNext(COMMA_PATTERN)) {
                scanner.next(COMMA_PATTERN);
                continue;
            }

            if (scanner.hasNext(RIGHT_BRACKET_PATTERN)) {
                scanner.next(RIGHT_BRACKET_PATTERN);
                if (stack.size() == 1) {
                    return stack.removeFirst();
                } else {
                    stack.removeFirst();
                    continue;
                }
            }
            throw new IllegalArgumentException("Could not parse the line");
        }
        throw new IllegalArgumentException("Could not parse the line");
    }

    private record PacketPair(PacketContent left, PacketContent right) {
        public boolean rightOrder() {
            return PacketContent.correctlyOrdered(left, right);
        }
    }

    private static class PacketContent {
        private final List<PacketContent> list;
        private final Integer integer;

        public PacketContent(int integer) {
            list = null;
            this.integer = integer;
        }

        public PacketContent(List<PacketContent> list) {
            this.list = list;
            integer = null;
        }

        public static boolean correctlyOrdered(PacketContent left, PacketContent right) {
            logger.debug("=== Pair check ===");
            int comparison = compare(left, right);
            if (comparison < 0) {
                logger.debug("CORRECT ORDER");
                return true;
            }
            logger.debug("INCORRECT ORDER");
            return false;
        }

        private static int compare(PacketContent left, PacketContent right) {
            logger.debug("Compare {} vs {}", left, right);
            if (left.integer != null && right.integer != null) {
                //COMPARE NUMBERS
                return compare(left.integer, right.integer);
            }

            if (left.list != null && right.list != null) {
                //COMPARE LISTS
                return compare(left.list, right.list);
            }

            //COMPARE MIXED LIST/NUMBER
            logger.debug("Side type mismatch, convert and try again");
            if (left.integer != null) {
                return compare(new PacketContent(List.of(left)), right);
            } else {
                return compare(left, new PacketContent(List.of(right)));
            }
        }

        private static int compare(int left, int right) {
            int comparison = left - right;

            if (comparison > 0) {
                logger.debug("Right side is smaller, so inputs are not in the right order");
            } else if (comparison < 0) {
                logger.debug("Left side is smaller, so inputs are in the right order");
            } else {
                logger.trace("Sides are same, continue checking");
            }


            return comparison;
        }

        private static int compare(List<PacketContent> leftList, List<PacketContent> rightList) {
            for (int i = 0; true; i++) {
                if (i == leftList.size() && i < rightList.size()) {
                    logger.debug("Left side ran out of items, so inputs are in the right order");
                    return Integer.MIN_VALUE;
                }

                if (i < leftList.size() && i == rightList.size()) {
                    logger.debug("Right side ran out of items, so inputs are not in the right order");
                    return Integer.MAX_VALUE;
                }

                if (i == leftList.size() && i == rightList.size()) {
                    logger.trace("Ran out of items in both lists, continue checking...");
                    return 0;
                }

                int comparisonValue = compare(leftList.get(i), rightList.get(i));
                if (comparisonValue != 0) {
                    return comparisonValue;
                }
            }
        }

        @Override
        public String toString() {
            if (list != null) {
                return "[" +
                        list.stream()
                                .map(PacketContent::toString)
                                .collect(Collectors.joining(COMMA_PATTERN))
                        + "]";
            }
            if (integer != null) {
                return String.valueOf(integer);
            }

            throw new IllegalStateException();
        }
    }

}

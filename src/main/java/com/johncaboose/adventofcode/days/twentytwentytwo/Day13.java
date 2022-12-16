package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Day13 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day13.class);
    private static final String FIRST_DIVIDER = "[[2]]";
    private static final String SECOND_DIVIDER = "[[6]]";
    private static final PacketComparator PACKET_COMPARATOR = new PacketComparator();

    @Override
    public Long partOneSolver(String input) {
        Map<Integer, PacketPair> packetPairs = parseInput(input);
        return (long) packetPairs.entrySet()
                .stream()
                .filter(e -> e.getValue().orderedCorrectly())
                .mapToInt(Map.Entry::getKey)
                .sum();
    }

    @Override
    public Long partTwoSolver(String input) {
        List<PacketContent> packets = parseInputAndAddDividerPackets(input);
        return findDecoderKey(packets);
    }

    private static Map<Integer, PacketPair> parseInput(String input) {
        String[] coupleStrings = input.split("\n\n");
        Map<Integer, PacketPair> map = new TreeMap<>();
        for (int i = 0; i < coupleStrings.length; i++) {
            map.put(i + 1, PacketPair.parsePacketCouple(coupleStrings[i]));
        }
        return map;
    }

    private static List<PacketContent> parseInputAndAddDividerPackets(String input) {
        input += "\n" + FIRST_DIVIDER;
        input += "\n" + SECOND_DIVIDER;

        Scanner scanner = new Scanner(input);
        List<PacketContent> packets = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isBlank()) {
                continue;
            }
            packets.add(PacketContent.parsePacket(line));
        }
        return packets;
    }

    private static long findDecoderKey(List<PacketContent> packets) {
        List<PacketContent> sortedPackets = packets.stream()
                .sorted(PACKET_COMPARATOR)
                .toList();

        Map<Integer, PacketContent> indexedPackets = new TreeMap<>();
        for (int i = 0; i < sortedPackets.size(); i++) {
            indexedPackets.put(i + 1, sortedPackets.get(i));
        }

        List<String> dividers = List.of(FIRST_DIVIDER, SECOND_DIVIDER);
        return indexedPackets.entrySet()
                .stream()
                // Filter out dividers
                .filter(entry -> {
                    String packetString = entry.getValue().toString();
                    return dividers.contains(packetString);
                })
                // Map to their 1-indexed indices
                .mapToInt(Map.Entry::getKey)
                // Decoder key is indices multiplied together
                .reduce(1, Math::multiplyExact);
    }

    private record PacketPair(PacketContent left, PacketContent right) {
        public boolean orderedCorrectly() {
            return PacketContent.orderedCorrectly(left, right);
        }

        private static PacketPair parsePacketCouple(String packetPair) {
            String[] packets = packetPair.split("\n");
            return new PacketPair(PacketContent.parsePacket(packets[0]), PacketContent.parsePacket(packets[1]));
        }
    }

    private record PacketContent(List<PacketContent> list, Integer integer) {
        private static final Pattern LEFT_BRACKET_PATTERN = Pattern.compile("\\[");
        private static final Pattern RIGHT_BRACKET_PATTERN = Pattern.compile("]");
        private static final Pattern COMMA_PATTERN = Pattern.compile(",");
        private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d+");

        public PacketContent(int integer) {
            this(null, integer);
        }

        public PacketContent(List<PacketContent> list) {
            this(list, null);
        }

        public static boolean orderedCorrectly(PacketContent left, PacketContent right) {
            logger.debug("=== Pair check ===");
            int comparison = PACKET_COMPARATOR.compare(left, right);

            if (comparison < 0) {
                logger.debug("CORRECT ORDER");
                return true;
            } else {
                logger.debug("INCORRECT ORDER");
                return false;
            }
        }

        @Override
        public String toString() {
            if (list != null) {
                return "[" + list.stream().map(PacketContent::toString).collect(Collectors.joining(",")) + "]";
            }
            if (integer != null) {
                return String.valueOf(integer);
            }
            throw new IllegalStateException();
        }

        private static PacketContent parsePacket(String line) {
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter("");
            Deque<PacketContent> stack = new ArrayDeque<>();

            while (scanner.hasNext()) {
                if (scanner.hasNext(NUMBER_PATTERN)) {
                    // There has to be a way of tokenizing better to skip loop, but whatever
                    StringBuilder number = new StringBuilder();
                    do {
                        number.append(scanner.next(NUMBER_PATTERN));
                    } while (scanner.hasNext(NUMBER_PATTERN));
                    int value = Integer.parseInt(number.toString());
                    Objects.requireNonNull(stack.peekFirst()).list.add(new PacketContent(value));
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
                throw new IllegalArgumentException("Could not parse packet");
            }
            throw new IllegalArgumentException("Could not parse packet");
        }
    }

    private static class PacketComparator implements Comparator<PacketContent> {

        @Override
        public int compare(PacketContent left, PacketContent right) {
            logger.debug("Compare {} vs {}", left, right);
            if (left.integer != null && right.integer != null) {
                logger.trace("Both are integers");
                return compare(left.integer, right.integer);
            }

            if (left.list != null && right.list != null) {
                logger.trace("Both are lists");
                return compare(left.list, right.list);
            }

            logger.debug("Mixed types; convert and retry comparison");
            if (left.integer != null) {
                return compare(new PacketContent(List.of(left)), right);
            } else {
                return compare(left, new PacketContent(List.of(right)));
            }
        }

        private int compare(int left, int right) {
            if (right < left) {
                logger.debug("Right side is smaller, so inputs are not in the right order");
                return 1;
            } else if (left < right) {
                logger.debug("Left side is smaller, so inputs are in the right order");
                return -1;
            } else {
                logger.trace("Sides are same, continue checking");
                return 0;
            }
        }

        private int compare(List<PacketContent> left, List<PacketContent> right) {
            for (int i = 0; ; i++) {
                if (i == left.size() && i < right.size()) {
                    logger.debug("Left side ran out of items, so inputs are in the right order");
                    return -1;
                }

                if (i < left.size() && i == right.size()) {
                    logger.debug("Right side ran out of items, so inputs are not in the right order");
                    return 1;
                }

                if (i == left.size() && i == right.size()) {
                    logger.trace("Ran out of items in both lists, continue checking...");
                    return 0;
                }

                int comparisonValue = compare(left.get(i), right.get(i));
                if (comparisonValue != 0) {
                    return comparisonValue;
                } // else continue...
            }
        }
    }

}

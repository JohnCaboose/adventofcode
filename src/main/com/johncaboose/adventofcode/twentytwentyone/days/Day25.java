package com.johncaboose.adventofcode.twentytwentyone.days;

import com.johncaboose.adventofcode.shared.Coordinate;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Day25 implements ISolvableDay {
    @Override
    public long partOneSolver(String input) {
        Map<Coordinate, RegionContent> state = readInput(input);
        int xBoundExclusive = 1 + state.keySet()
                .stream()
                .mapToInt(c -> c.x())
                .max()
                .getAsInt();
        int yBoundExclusive = 1 + state.keySet()
                .stream()
                .mapToInt(c -> c.y())
                .max()
                .getAsInt();

        int steps = 0;
        boolean movementPerformed = false;
        do {
            movementPerformed = stepState(state, xBoundExclusive, yBoundExclusive);
            steps++;
        } while (movementPerformed);

        return steps;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }

    private static Map<Coordinate, RegionContent> readInput(String input) {
        //TODO refactor to make this share code in a smart way with Day 11 and Day 15
        Map<Coordinate, RegionContent> returnValue = new HashMap<>();
        try (Scanner scanner = new Scanner(input)) {
            int y = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int x = 0; x < line.length(); x++) {
                    RegionContent content = RegionContent.fromChar(line.charAt(x));
                    returnValue.put(new Coordinate(x, y), content);
                }

                y++;
            }

        }
        return returnValue;
    }

    private static boolean stepState(Map<Coordinate, RegionContent> state, int xBoundExclusive, int yBoundExclusive) {
        Map<Coordinate, RegionContent> nextState = new HashMap<>();
        AtomicBoolean anythingMoved = new AtomicBoolean(false);

        Set<Coordinate> untouchedCoordinates = new HashSet<>(state.keySet());

        // First move all east-bound
        state.forEach((coordinate, content) -> {
            if (content.equals(RegionContent.EAST_CUCUMBER)) {
                Coordinate nextCoordinate = new Coordinate((coordinate.x() + 1) % xBoundExclusive, coordinate.y());
                moveCucumber(state, nextCoordinate, coordinate, anythingMoved, nextState, content, untouchedCoordinates);
            }
        });

        // Construct mid move result, where all east-bound have moved but no south-bound
        Map<Coordinate, RegionContent> midMoveResult = new HashMap<>();
        midMoveResult.putAll(nextState);
        state.forEach((coordinate, content) -> {
            if (content.equals(RegionContent.SOUTH_CUCUMBER)) {
                midMoveResult.put(coordinate, content);
            }
        });
        untouchedCoordinates.forEach(coordinate -> midMoveResult.putIfAbsent(coordinate, RegionContent.EMPTY));


        // Second move all south-bound
        state.forEach((coordinate, content) -> {
            if (content.equals(RegionContent.SOUTH_CUCUMBER)) {
                Coordinate nextCoordinate = new Coordinate(coordinate.x(), (coordinate.y() + 1) % yBoundExclusive);
                moveCucumber(midMoveResult, nextCoordinate, coordinate, anythingMoved, nextState, content, untouchedCoordinates);
            }
        });

        // Finally set all the other spaces to empty
        untouchedCoordinates.forEach(coordinate -> nextState.put(coordinate, RegionContent.EMPTY));

        // Update state to its new... state
        state.clear();
        state.putAll(nextState);

        return anythingMoved.get();
    }

    private static void moveCucumber(Map<Coordinate, RegionContent> state, Coordinate nextCoordinate, Coordinate coordinate, AtomicBoolean anythingMoved, Map<Coordinate, RegionContent> nextState, RegionContent content, Set<Coordinate> shouldBeEmpty) {
        boolean move = !nextState.containsKey(nextCoordinate) && RegionContent.EMPTY.equals(state.get(nextCoordinate));
        Coordinate coordinateToUse = move ? nextCoordinate : coordinate;

        anythingMoved.compareAndSet(false, move);

        nextState.put(coordinateToUse, content);
        shouldBeEmpty.remove(coordinateToUse);
    }

    private enum RegionContent {
        EAST_CUCUMBER,
        SOUTH_CUCUMBER,
        EMPTY;

        public static RegionContent fromString(String regionContent) {
            return switch (regionContent) {
                case ">" -> EAST_CUCUMBER;
                case "v" -> SOUTH_CUCUMBER;
                case "." -> EMPTY;
                default -> throw new IllegalArgumentException("Cannot recognize RegionContent from provided String");
            };
        }

        public static RegionContent fromChar(char regionContent) {
            return switch (regionContent) {
                case '>' -> EAST_CUCUMBER;
                case 'v' -> SOUTH_CUCUMBER;
                case '.' -> EMPTY;
                default -> throw new IllegalArgumentException("Cannot recognize RegionContent from provided char");
            };
        }

        @Override
        public String toString() {
            return switch (this) {
                case EAST_CUCUMBER -> ">";
                case SOUTH_CUCUMBER -> "v";
                case EMPTY -> ".";
            };
        }


    }

    private static String printField(Map<Coordinate, RegionContent> state, int xBoundExclusive, int yBoundExclusive) {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < yBoundExclusive; y++) {
            for (int x = 0; x < xBoundExclusive; x++) {
                sb.append(state.get(new Coordinate(x, y)));
            }
            sb.append("\n");
        }
        return sb.toString();

    }
}

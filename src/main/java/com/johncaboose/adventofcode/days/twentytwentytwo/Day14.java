package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ExtendedHashMap;
import com.johncaboose.adventofcode.shared.ExtendedMap;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Day14 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day14.class);

    private static final Coordinate SAND_SPAWN = new Coordinate(500, 0);

    @Override
    public Long partOneSolver(String input) {
        return solve(input, true);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, false);
    }

    private long solve(String input, boolean partOne) {
        Set<Coordinate> rockCoordinates = parseInput(input);
        ExtendedMap<Coordinate, Item> items = new ExtendedHashMap<>();
        rockCoordinates.forEach(c -> items.put(c, Item.ROCK));

        dropSand(items, partOne);

        return items.values()
                .stream()
                .filter(item -> item == Item.SETTLED_SAND)
                .count();
    }

    private static Set<Coordinate> parseInput(String input) {
        Scanner scanner = new Scanner(input);
        Set<Coordinate> rockCoordinates = new HashSet<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] lineCoordinates = line.split(" -> ");

            for (int i = 1; i < lineCoordinates.length; i++) {
                Coordinate start = new Coordinate(lineCoordinates[i - 1]);
                Coordinate end = new Coordinate(lineCoordinates[i]);
                if (start.x() == end.x()) {
                    rockCoordinates.addAll(
                            IntStream.rangeClosed(Math.min(start.y(), end.y()), Math.max(start.y(), end.y()))
                                    .mapToObj(y -> new Coordinate(start.x(), y))
                                    .collect(Collectors.toSet())
                    );
                } else if (start.y() == end.y()) {
                    rockCoordinates.addAll(
                            IntStream.rangeClosed(Math.min(start.x(), end.x()), Math.max(start.x(), end.x()))
                                    .mapToObj(x -> new Coordinate(x, start.y()))
                                    .collect(Collectors.toSet())
                    );
                } else {
                    throw new IllegalArgumentException("Non-straight line");
                }
            }

        }
        return rockCoordinates;
    }

    private void dropSand(ExtendedMap<Coordinate, Item> items, boolean partOne) {
        int highestRockY = items.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == Item.ROCK)
                .mapToInt(entry -> entry.getKey().y())
                .max()
                .orElseThrow();

        int floorY = highestRockY + 2;

        Coordinate sand = SAND_SPAWN;
        while (true) {
            Coordinate nextCoordinate = nextSandCoordinate(items, sand, floorY);
            if (nextCoordinate == null) {
                // sand is at rest, time start over with new grain of sand
                items.put(sand, Item.SETTLED_SAND);
                if (sand.equals(SAND_SPAWN)) {
                    // We have blocked the source, time to break
                    break;
                }
                sand = SAND_SPAWN;
            } else {
                // sand moves to new position
                sand = nextCoordinate;

                if (partOne && sand.y() >= highestRockY) {
                    //sand will "fall forever", time to break if solving part one
                    break;
                }
            }

        }
    }

    private Coordinate nextSandCoordinate(ExtendedMap<Coordinate, Item> items, Coordinate currentCoordinate, int floorY) {
        int newY = currentCoordinate.y() + 1;
        int oldX = currentCoordinate.x();

        if (newY == floorY) {
            // Can't move into floor, no next coordinate possible
            return null;
        }

        Coordinate down = new Coordinate(oldX, newY);
        if (items.get(down) == null) {
            return down;
        }

        Coordinate leftDown = new Coordinate(oldX - 1, newY);
        if (items.get(leftDown) == null) {
            return leftDown;
        }

        Coordinate rightDown = new Coordinate(oldX + 1, newY);
        if (items.get(rightDown) == null) {
            return rightDown;
        }

        // All coordinates blocked -> no next coordinate
        return null;
    }

    private enum Item {
        SETTLED_SAND,
        ROCK
    }
}

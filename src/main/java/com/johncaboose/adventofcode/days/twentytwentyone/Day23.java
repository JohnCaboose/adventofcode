package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Day23 implements ISolvableDay {

    private static final Pattern INPUT_PATTERN = Pattern.compile("#([A-D])#([A-D])#([A-D])#([A-D])#");

    private static final Map<AmphipodClass, Integer> COST_PER_STEP = Map.of(
            AmphipodClass.A, 1,
            AmphipodClass.B, 10,
            AmphipodClass.C, 100,
            AmphipodClass.D, 1000
    );

    private static final Map<AmphipodClass, Integer> HALLWAY_DESTINATION_COORDINATE = Map.of(
            AmphipodClass.A, 2,
            AmphipodClass.B, 4,
            AmphipodClass.C, 6,
            AmphipodClass.D, 8
    );

    private static final Set<BurrowCoordinate> VALID_HALLWAY_RESTING_BURROW_COORDINATES = Set.of(0, 1, 3, 5, 7, 9, 10)
            .stream()
            .map(coordinate -> new BurrowCoordinate(BurrowRoomType.HALLWAY, coordinate, 0))
            .collect(Collectors.toSet());

    @Override
    public long partOneSolver(String input) {
        Map<BurrowCoordinate, AmphipodClass> startingState = readInput(input);
        int maxAllowedDepth = 2; //TODO read from startingState?


        return 0;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }

    private static int stepsRequiredForMove(BurrowCoordinate start, BurrowCoordinate end) {
        if (start.roomType.equals(end.roomType)) {
            throw new IllegalArgumentException("Can't calculate cost for illegal move");
        }
        int hallwayCost = Math.abs(end.hallwayCoordinate() - start.hallwayCoordinate());
        int depthCost = Math.abs(end.depth() - start.depth());
        return hallwayCost + depthCost;
    }

    private Set<BurrowCoordinate> requiredToNotBeBlocked(BurrowCoordinate start, BurrowCoordinate end) {
        Set<BurrowCoordinate> result = new HashSet<>();
        for (int depth = 1; depth < start.depth(); depth++) {
            result.add(new BurrowCoordinate(BurrowRoomType.SIDE_ROOM, start.hallwayCoordinate(), depth));
        }

        int lowest = Math.min(start.hallwayCoordinate(), end.hallwayCoordinate());
        int highest = Math.max(start.hallwayCoordinate(), end.hallwayCoordinate());

        for (int hallwayCoordinate = lowest; hallwayCoordinate <= highest; hallwayCoordinate++) {
            result.add(new BurrowCoordinate(BurrowRoomType.HALLWAY, hallwayCoordinate, 0));
        }

        return result;
    }


    private Map<BurrowCoordinate, AmphipodClass> readInput(String input) {
        Map<BurrowCoordinate, AmphipodClass> startingPosition = new HashMap<>();
        Matcher matcher = INPUT_PATTERN.matcher(input);

        for (int depth = 1; matcher.find(); depth++) {
            BurrowCoordinate sideRoomAt2 = new BurrowCoordinate(BurrowRoomType.SIDE_ROOM, 2, depth);
            BurrowCoordinate sideRoomAt4 = new BurrowCoordinate(BurrowRoomType.SIDE_ROOM, 4, depth);
            BurrowCoordinate sideRoomAt6 = new BurrowCoordinate(BurrowRoomType.SIDE_ROOM, 6, depth);
            BurrowCoordinate sideRoomAt8 = new BurrowCoordinate(BurrowRoomType.SIDE_ROOM, 8, depth);

            startingPosition.put(sideRoomAt2, AmphipodClass.valueOf(matcher.group(1)));
            startingPosition.put(sideRoomAt4, AmphipodClass.valueOf(matcher.group(2)));
            startingPosition.put(sideRoomAt6, AmphipodClass.valueOf(matcher.group(3)));
            startingPosition.put(sideRoomAt8, AmphipodClass.valueOf(matcher.group(4)));
        }
        return startingPosition;
    }


    private enum AmphipodClass {
        A,
        B,
        C,
        D;
    }

    private enum BurrowRoomType {
        HALLWAY,
        SIDE_ROOM;
    }

    /*
     * #############
     * #0123456789.#
     * ###B#C#B#D###
     *   #A#D#C#A#
     *   #########
     * The final coordinate at the "." is 10. This is the hallway.
     * The hallway is at depth "0".
     * The side rooms seen below the hallway are depths 1,2, where 1 is closest to hallway.
     */
    private record BurrowCoordinate(BurrowRoomType roomType, int hallwayCoordinate, int depth) {

    }


}

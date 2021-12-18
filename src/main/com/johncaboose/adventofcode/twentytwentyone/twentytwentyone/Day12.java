package com.johncaboose.adventofcode.twentytwentyone.twentytwentyone;

import com.johncaboose.adventofcode.twentytwentyone.twentytwentyone.Utils.ExtendedHashMap;
import com.johncaboose.adventofcode.twentytwentyone.twentytwentyone.Utils.ExtendedMap;

import java.util.*;

public class Day12 implements ISolvableDay {

    public static final String START = "start";
    public static final String END = "end";

    @Override
    public long partOneSolver(String input) {
        CaveNetwork caveNetwork = constructCaveNetwork(input);
        int amountOfPaths = possiblePathsToEnd(caveNetwork, new HashSet<>(), new Cave(START));
        return amountOfPaths;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }

    private int possiblePathsToEnd(CaveNetwork caves, Set<Cave> traversedSmallCaves, Cave currentCave) {

        if (currentCave.caveType.equals(CaveType.END)) {
            return 1;
        }

        boolean currentCaveSmallAndAlreadyTraversed = currentCave.caveType.equals(CaveType.SMALL) && !traversedSmallCaves.add(currentCave);
        if (currentCaveSmallAndAlreadyTraversed) {
            return 0;
        }

        int pathsFound = 0;

        List<Cave> possibleOptions = caves.adjacencyMap.get(currentCave.name);
        for (Cave cave : possibleOptions) {
            pathsFound += possiblePathsToEnd(caves, new HashSet<>(traversedSmallCaves), cave);
        }

        return pathsFound;
    }


    private enum CaveType {
        SMALL,
        LARGE,
        START,
        END;
    }

    private record Cave(String name, CaveType caveType) {

        public Cave(String name) {
            this(name, caveTypeOf(name));
        }

        private static CaveType caveTypeOf(String name) {
            if (START.equals(name)) {
                return CaveType.START;
            }

            if (END.equals(name)) {
                return CaveType.END;
            }

            return name.toLowerCase().equals(name) ? CaveType.SMALL : CaveType.LARGE;
        }


    }

    private class CaveNetwork {
        ExtendedMap<String, List<Cave>> adjacencyMap = new ExtendedHashMap<>();

        public void addConnection(String firstCaveName, String secondCaveName) {
            List<Cave> availableCavesFromFirst = adjacencyMap.getOrStoreDefault(firstCaveName, new ArrayList<>());
            List<Cave> availableCavesFromSecond = adjacencyMap.getOrStoreDefault(secondCaveName, new ArrayList<>());


            Cave firstCave = new Cave(firstCaveName);
            Cave secondCave = new Cave(secondCaveName);

            //Don't create connections TO the start cave or FROM the end cave
            if (!secondCave.caveType.equals(CaveType.START) && !firstCave.caveType.equals(CaveType.END)) {
                availableCavesFromFirst.add(secondCave);
            }

            if (!firstCave.caveType.equals(CaveType.START) && !secondCave.caveType.equals(CaveType.END)) {
                availableCavesFromSecond.add(firstCave);
            }


        }

    }

    private CaveNetwork constructCaveNetwork(String input) {
        CaveNetwork caveNetwork = new CaveNetwork();
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] caveNames = line.split("-");
                caveNetwork.addConnection(caveNames[0], caveNames[1]);
            }
        }
        return caveNetwork;
    }
}

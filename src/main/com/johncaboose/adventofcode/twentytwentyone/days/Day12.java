package com.johncaboose.adventofcode.twentytwentyone.days;

import com.johncaboose.adventofcode.shared.ExtendedHashMap;
import com.johncaboose.adventofcode.shared.ExtendedMap;

import java.util.*;


public class Day12 implements ISolvableDay {

    public static final String START = "start";
    public static final String END = "end";

    @Override
    public long partOneSolver(String input) {
        return solveProblem(input, 1);
    }

    @Override
    public long partTwoSolver(String input) {
        return solveProblem(input, 2);
    }

    private int solveProblem(String input, int maxTraversalCount) {
        CaveNetwork caveNetwork = constructCaveNetwork(input);
        List<String> allPaths = new ArrayList<>();
        possiblePathsToEnd(caveNetwork, new HashMap<>(), maxTraversalCount, new Cave(START),
                allPaths, new StringBuilder());
        return allPaths.size();
    }

    private void possiblePathsToEnd(CaveNetwork caves, Map<String, Integer> smallCaveTraversalCount,
                                    int maxTraversalCount, Cave currentCave, List<String> allPaths, StringBuilder currentPath) {
        if (!START.equals(currentCave.name)) {
            currentPath.append(",");
        }
        currentPath.append(currentCave.name);

        if (currentCave.caveType.equals(CaveType.END)) {
            allPaths.add(currentPath.toString());
            return;
        }

        // Only one small cave can be visited more than max amount, unless max is one
        if (currentCave.caveType.equals(CaveType.SMALL)) {
            //Check max amount of visits for any cave, excluding current visit
            int maxVisitForAnyCave = smallCaveTraversalCount.values()
                    .stream()
                    .max(Integer::compareTo)
                    .orElse(0);

            int timesVisitedIncludingThis = smallCaveTraversalCount.getOrDefault(currentCave.name, 0) + 1;
            smallCaveTraversalCount.put(currentCave.name, timesVisitedIncludingThis);

            if (timesVisitedIncludingThis == maxTraversalCount) {
                //This is fine to continue with but only if no others are already traveled max amount
                if (maxVisitForAnyCave == maxTraversalCount && maxTraversalCount > 1) {
                    return;
                }
            } else if (timesVisitedIncludingThis > maxTraversalCount) {
                return;
            }
        }


        List<Cave> possibleOptions = caves.adjacencyMap.get(currentCave.name);
        for (Cave cave : possibleOptions) {
            possiblePathsToEnd(caves, new HashMap<>(smallCaveTraversalCount), maxTraversalCount, cave,
                    allPaths, new StringBuilder(currentPath));
        }

        return;
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
        for (List<Cave> lists : caveNetwork.adjacencyMap.values()) {
            lists.sort((c1, c2) -> c1.name.compareToIgnoreCase(c2.name));
        }
        return caveNetwork;
    }
}

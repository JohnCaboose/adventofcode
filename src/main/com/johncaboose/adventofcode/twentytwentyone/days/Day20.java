package com.johncaboose.adventofcode.twentytwentyone.days;

import com.johncaboose.adventofcode.twentytwentyone.shared.Coordinate;
import com.johncaboose.adventofcode.twentytwentyone.shared.ExtendedHashMap;
import com.johncaboose.adventofcode.twentytwentyone.shared.ExtendedMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day20 implements ISolvableDay {
    @Override
    public long partOneSolver(String input) {
        int amountOfEnhancementsToPerform = 2;
        long litPixels = solve(input, amountOfEnhancementsToPerform);
        return litPixels;
    }

    @Override
    public long partTwoSolver(String input) {
        int amountOfEnhancementsToPerform = 50;
        long litPixels = solve(input, amountOfEnhancementsToPerform);
        return litPixels;
    }

    private long solve(String input, int amountOfEnhancementsToPerform) {
        List<Boolean> algorithmList = new ArrayList<>();
        ExtendedMap<Coordinate, Boolean> relevantPixels = new ExtendedHashMap<>();

        readInput(input, algorithmList, relevantPixels, amountOfEnhancementsToPerform);

        enhance(algorithmList, relevantPixels, amountOfEnhancementsToPerform);

        long litPixels = relevantPixels.values().stream().filter(Boolean::booleanValue).count();
        return litPixels;
    }

    private void enhance(List<Boolean> algorithmList, ExtendedMap<Coordinate, Boolean> relevantPixels,
                         int amountOfEnhancementsToPerform) {
        boolean allOffBecomeOn = algorithmList.get(0);
        boolean allOnBecomeOff = !algorithmList.get(algorithmList.size() - 1);


        for (int i = 0; i < amountOfEnhancementsToPerform; i++) {
            boolean nonRelevantPixelsOn = (allOffBecomeOn && allOffBecomeOn && i % 2 == 1) ||
                    (allOffBecomeOn && !allOnBecomeOff && i > 0);

            ExtendedMap<Coordinate, Boolean> enhancedRelevantPixels = new ExtendedHashMap<>();
            for (Coordinate coordinate : relevantPixels.keySet()) {
                boolean on = onAfterEnhancement(coordinate, relevantPixels, algorithmList, nonRelevantPixelsOn);
                enhancedRelevantPixels.put(coordinate, on);
            }

            relevantPixels.clear();
            relevantPixels.putAll(enhancedRelevantPixels);
        }
    }

    private void readInput(String input, List<Boolean> algorithmMap, ExtendedMap<Coordinate, Boolean> relevantPixels, int amountOfEnhancementsToPerform) {
        try (Scanner scanner = new Scanner(input)) {
            String algorithmString = scanner.nextLine();

            if (algorithmString.length() != 512) {
                throw new IllegalArgumentException("Wrong length of algorithm string in input.");
            }

            for (char character : algorithmString.toCharArray()) {
                boolean on = character == '#';
                algorithmMap.add(on);
            }
            scanner.nextLine(); // Empty line

            int lineIndex = 0;
            int maxX = 0;
            int maxY = 0;
            while (scanner.hasNextLine()) {
                maxY = lineIndex;
                String line = scanner.nextLine();
                maxX = line.length() - 1;
                for (int x = 0; x < line.length(); x++) {
                    boolean on = line.charAt(x) == '#';
                    relevantPixels.put(new Coordinate(x, lineIndex), on);
                }
                lineIndex++;
            }

            // expand field of relevant pixels
            int expansionSize = amountOfEnhancementsToPerform + 3; // The extra 3 shouldn't affect the result (?)
            for (int x = -expansionSize; x <= maxX + expansionSize; x++) {
                for (int y = -expansionSize; y <= maxY + expansionSize; y++) {
                    relevantPixels.putIfAbsent(new Coordinate(x, y), false);
                }
            }
        }
    }


    private static boolean onAfterEnhancement(Coordinate centerCoordinate, Map<Coordinate, Boolean> relevantPixels, List<Boolean> algorithmList, boolean nonRelevantPixelsOn) {
        // The coordinates in a 3x3 grid around centerCoordinate, including itself
        List<Coordinate> coordinates = new ArrayList<>();
        int centerY = centerCoordinate.y();
        for (int y = centerY - 1; y <= centerY + 1; y++) {
            for (int x = centerCoordinate.x() - 1; x <= centerCoordinate.x() + 1; x++) {
                coordinates.add(new Coordinate(x, y));
            }
        }
        // Values of those pixels
        List<Boolean> coordinatePixelsOn = new ArrayList<>();
        for (Coordinate coordinate : coordinates) {
            coordinatePixelsOn.add(relevantPixels.getOrDefault(coordinate, nonRelevantPixelsOn));
        }
        //Now convert those booleans to the integer they represent
        int indexInAlgorithmList = 0;
        for (int i = 0; i < coordinatePixelsOn.size(); i++) {
            indexInAlgorithmList = indexInAlgorithmList << 1;
            indexInAlgorithmList = indexInAlgorithmList | (coordinatePixelsOn.get(i) ? 1 : 0);
        }

        //Find out the new value of centerCoordinate pixel after enhancing it
        boolean on = algorithmList.get(indexInAlgorithmList);

        return on;
    }

    private static String relevantPixelsAsString(Map<Coordinate, Boolean> relevantPixels) {
        int minX = relevantPixels.keySet().stream().mapToInt(Coordinate::x).min().orElse(0);
        int maxX = relevantPixels.keySet().stream().mapToInt(Coordinate::x).max().orElse(0);
        int minY = relevantPixels.keySet().stream().mapToInt(Coordinate::y).min().orElse(0);
        int maxY = relevantPixels.keySet().stream().mapToInt(Coordinate::y).max().orElse(0);

        StringBuilder sb = new StringBuilder();
        for (int y = minY; y <= maxY; y++) {
            if (y > minY) {
                sb.append(System.lineSeparator());
            }
            for (int x = minX; x <= maxX; x++) {
                boolean pixelOn = relevantPixels.getOrDefault(new Coordinate(x, y), false);
                sb.append(pixelOn ? '#' : '.');
            }

        }

        return sb.toString();
    }

}

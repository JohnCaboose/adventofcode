package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;

class Day9 implements ISolvableDay {

    @Override
    public long partOneSolver(String input) {
        HeightMap heightMap = constructHeightMap(input);
        List<Coordinate> lowPoints = lowPoints(heightMap);

        int riskLevelSum = 0;
        for (Coordinate coordinate : lowPoints) {
            riskLevelSum += heightMap.riskLevel(coordinate.x(), coordinate.y());
        }

        return riskLevelSum;
    }

    @Override
    public long partTwoSolver(String input) {
        HeightMap heightMap = constructHeightMap(input);
        List<Coordinate> lowPoints = lowPoints(heightMap);
        List<Basin> basins = basins(heightMap, lowPoints);

        int product = basins.stream()
                .map(Basin::size)
                .sorted(Collections.reverseOrder())
                .limit(3)
                .reduce(1, Math::multiplyExact);

        return product;
    }


    private List<Coordinate> lowPoints(HeightMap heightMap) {
        List<Coordinate> lowPoints = new ArrayList<>();

        for (int x = 0; x < heightMap.getXSize(); x++) {
            for (int y = 0; y < heightMap.getYSize(); y++) {
                if (heightMap.lowPoint(x, y)) {
                    lowPoints.add(new Coordinate(x, y));
                }
            }
        }
        return lowPoints;
    }

    private List<Basin> basins(HeightMap heightMap, List<Coordinate> lowPoints) {
        List<Basin> basins = new ArrayList<>();
        for (Coordinate coordinate : lowPoints) {
            Collection<Coordinate> basinCoordinates = basinCoordinates(heightMap, coordinate);
            basins.add(new Basin(basinCoordinates));
        }
        return basins;
    }

    private Collection<Coordinate> basinCoordinates(HeightMap heightMap, Coordinate coordinate) {
        Set<Coordinate> alreadyFoundBasinCoordinates = new HashSet<>();

        Queue<Coordinate> basinCoordinatesToCheck = new ArrayDeque<>();
        basinCoordinatesToCheck.add(coordinate);

        while (basinCoordinatesToCheck.size() > 0) {
            // Retrieve coordinate to check
            Coordinate currentCoordinate = basinCoordinatesToCheck.poll();
            // Prevent coordinate from being checked again now that it's removed
            alreadyFoundBasinCoordinates.add(currentCoordinate);
            // Retrieve neighbors that are also in the basin
            Set<Coordinate> adjacentBasinCoordinates = heightMap.adjacentBasinCoordinates(currentCoordinate);

            // Add any not already checked or queued coordinates to the queue of coordinates to check
            for (Coordinate basinCoordinate : adjacentBasinCoordinates) {
                if (alreadyFoundBasinCoordinates.add(basinCoordinate)) {
                    basinCoordinatesToCheck.offer(basinCoordinate);
                }
            }

        }

        return alreadyFoundBasinCoordinates;
    }

    private record Basin(Collection<Coordinate> coordinates) {
        public int size() {
            return coordinates.size();
        }
    }

    private record HeightMap(List<List<Integer>> heightMap) {

        public boolean coordinateValid(int x, int y) {
            return x >= 0 && x < getXSize() && y >= 0 && y < getYSize();
        }

        public int getYSize() {
            return heightMap.get(0).size();
        }

        public int getXSize() {
            return heightMap.size();
        }

        private int valueOrIntMax(Coordinate coordinate) {
            return valueOrIntMax(coordinate.x(), coordinate.y());
        }

        public int valueOrIntMax(int x, int y) {
            return coordinateValid(x, y) ? heightMap.get(x).get(y) : Integer.MAX_VALUE;
        }


        public int riskLevel(int x, int y) {
            return valueOrIntMax(x, y) + 1;
        }

        public boolean basinPoint(Coordinate coordinate) {
            return valueOrIntMax(coordinate) < 9;
        }

        public boolean lowPoint(int x, int y) {
            int hereValue = valueOrIntMax(x, y);

            for (Coordinate neighbour : new Coordinate(x, y).neighbours()) {
                if (valueOrIntMax(neighbour) <= hereValue) {
                    return false;
                }

            }
            return true;
        }

        public Set<Coordinate> adjacentBasinCoordinates(Coordinate coordinate) {
            Set<Coordinate> nearbyBasinCoordinates = new HashSet<>();
            for (Coordinate neighbour : coordinate.neighbours()) {
                if (basinPoint(neighbour)) {
                    nearbyBasinCoordinates.add(neighbour);
                }

            }
            return nearbyBasinCoordinates;
        }
    }

    private static HeightMap constructHeightMap(String input) {
        List<List<Integer>> heightMap;
        try (Scanner scanner = new Scanner(input)) {
            heightMap = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                List<Integer> rowValues = new ArrayList<>();
                for (int i = 0; i < line.length(); i++) {
                    rowValues.add(Character.getNumericValue(line.charAt(i)));
                }
                heightMap.add(rowValues);
            }
        }
        return new HeightMap(heightMap);
    }

}

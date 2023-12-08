package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.shared.AbstractGrid;
import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.regex.Pattern;

class Day3 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day3.class);
    private static final Pattern NON_SYMBOLS = Pattern.compile("\\d|\\.");
    private static final Pattern NUMBERS = Pattern.compile("\\d");

    @Override
    public Long partOneSolver(String input) {
        EngineGrid engine = new EngineGrid(input);

        List<EngineNumber> partNumbers = engine.getPartNumbers();
        return partNumbers.stream()
                .mapToLong(EngineNumber::number)
                .sum();
    }

    @Override
    public Long partTwoSolver(String input) {
        EngineGrid engine = new EngineGrid(input);

        List<Gear> gears = engine.getGears();

        return gears.stream()
                .mapToLong(Gear::gearRatio)
                .sum();
    }

    private static class EngineGrid extends AbstractGrid<String> {
        public EngineGrid(String input) {
            super(input);
        }

        @Override
        public String valueOf(char character) {
            return String.valueOf(character);
        }

        public List<EngineNumber> getPartNumbers() {
            return getEngineNumbers()
                    .stream()
                    .filter(this::isPartNumber)
                    .toList();
        }

        private List<EngineNumber> getEngineNumbers() {
            List<EngineNumber> engineNumbers = new ArrayList<>();

            for (int y = 0; y < getYBoundExclusive(); y++) {
                String currentNumber = null;
                Set<Coordinate> currentNumberCoordinates = new HashSet<>();
                for (int x = 0; x < getXBoundExclusive(); x++) {
                    Coordinate coordinate = new Coordinate(x, y);
                    String s = grid.get(coordinate);
                    if (isNumber(s)) {
                        //start new number (or add to number being built)
                        currentNumber = currentNumber != null ? currentNumber + s : s;
                        currentNumberCoordinates.add(coordinate);
                    } else if (currentNumber != null) {
                        //number is over, add and reset
                        engineNumbers.add(new EngineNumber(Long.parseLong(currentNumber), currentNumberCoordinates));
                        currentNumber = null;
                        currentNumberCoordinates = new HashSet<>();
                    } else {
                        //Still not a number, keep going
                    }
                }

                //end of line -> end of number
                if (currentNumber != null) {
                    engineNumbers.add(new EngineNumber(Long.parseLong(currentNumber), currentNumberCoordinates));
                }
            }

            return engineNumbers;
        }

        private boolean isPartNumber(EngineNumber engineNumber) {
            for (Coordinate engineCoordinate : engineNumber.coordinates()) {
                for (Coordinate neighbour : engineCoordinate.allNeighbours()) {
                    if (isSymbol(grid.get(neighbour))) {
                        return true;
                    }
                }
            }
            return false;
        }

        public List<Gear> getGears() {
            List<Gear> foundGears = new ArrayList<>();

            List<Coordinate> foundPotentialGears = getPotentialGears();
            Map<Coordinate, EngineNumber> partNumbersByCoordinate = getPartNumbersByCoordinateMap();

            for (Coordinate potentialGearCoordinate : foundPotentialGears) {
                //asterisk is a gear if it neighbors exactly two part numbers
                List<EngineNumber> adjacentPartNumbers = adjacentPartNumbers(partNumbersByCoordinate, potentialGearCoordinate);
                if (adjacentPartNumbers.size() == 2) {
                    foundGears.add(new Gear(adjacentPartNumbers));
                }
            }

            return foundGears;
        }

        private Map<Coordinate, EngineNumber> getPartNumbersByCoordinateMap() {
            List<EngineNumber> partNumbers = getPartNumbers();
            Map<Coordinate, EngineNumber> partNumbersByCoordinate = new HashMap<>();
            for (EngineNumber partNumber : partNumbers) {
                for (Coordinate coordinate : partNumber.coordinates()) {
                    partNumbersByCoordinate.put(coordinate, partNumber);
                }
            }
            return partNumbersByCoordinate;
        }

        private List<EngineNumber> adjacentPartNumbers(Map<Coordinate, EngineNumber> partNumbersByCoordinate, Coordinate potentialGearCoordinate) {
            List<Coordinate> neighbors = potentialGearCoordinate.allNeighbours();
            return neighbors.stream()
                    .map(partNumbersByCoordinate::get) //adjacent part numbers
                    .filter(Objects::nonNull) //remove nulls (no part number at coordinate)
                    .distinct() //remove duplicates
                    .toList();
        }

        private List<Coordinate> getPotentialGears() {
            List<Coordinate> potentialGears = new ArrayList<>();
            for (int y = 0; y < getYBoundExclusive(); y++) {
                for (int x = 0; x < getXBoundExclusive(); x++) {
                    Coordinate coordinate = new Coordinate(x, y);
                    String s = grid.get(coordinate);
                    if (isAsterisk(s)) {
                        potentialGears.add(coordinate);
                    }
                }
            }
            return potentialGears;
        }

        private boolean isSymbol(String s) {
            if (s == null) {
                return false;
            }

            return !NON_SYMBOLS.matcher(s).find();
        }

        private boolean isAsterisk(String s) {
            return "*".equals(s);
        }

        private boolean isNumber(String s) {
            if (s == null) {
                return false;
            }

            return NUMBERS.matcher(s).find();
        }


    }

    private record EngineNumber(long number, Set<Coordinate> coordinates) {
    }

    private record Gear(long firstPartNumber, long secondPartNumber) {

        public Gear(List<EngineNumber> partNumbers) {
            this(partNumbers.get(0).number(), partNumbers.get(1).number());
        }

        public long gearRatio() {
            return firstPartNumber * secondPartNumber;
        }
    }


}

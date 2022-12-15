package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.IntegerGrid;
import com.johncaboose.adventofcode.shared.graph.Graph;
import com.johncaboose.adventofcode.shared.graph.Node;

import java.util.List;
import java.util.Map.Entry;

class Day15 implements ISolvableDay<Long> {
    @Override
    public Long partOneSolver(String input) {
        return solve(input, false);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, true);
    }

    private long solve(String input, boolean part2) {
        Cavern cavern = new Cavern(input);

        if (part2) {
            cavern.adjustRiskLevelsAndSize();
        }

        Graph graph = cavern.toGraph();

        Coordinate startCoordinate = new Coordinate(0, 0);
        Node startNode = graph.getNode(startCoordinate);

        Node destinationNode = startNode.calculateShortestPath(cavern.getDestinationCoordinate());
        if (destinationNode == null) {
            return Long.MAX_VALUE; // Could not find path
        }
        return destinationNode.getDistance();
    }

    private static class Cavern extends IntegerGrid {
        private static final int SIZE_INCREASE_FACTOR = 5;

        public Cavern(String input) {
            super(input);
        }

        public void adjustRiskLevelsAndSize() {
            List<Integer> possibleValues = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
            int tileSizeX = lastX + 1;
            int newLastX = tileSizeX * SIZE_INCREASE_FACTOR - 1;

            int tileSizeY = lastY + 1;
            int newLastY = tileSizeY * SIZE_INCREASE_FACTOR - 1;

            for (int x = 0; x <= newLastX; x++) {
                for (int y = 0; y <= newLastY; y++) {
                    int toAdd = (x / tileSizeX) + (y / tileSizeY);
                    if (toAdd == 0) {
                        //In original tile: move on
                        continue;
                    }

                    int riskAtCoordinate = grid.get(new Coordinate(x % tileSizeX, y % tileSizeY));
                    int originalValueIndex = possibleValues.indexOf(riskAtCoordinate);
                    int riskIndex = originalValueIndex + toAdd;


                    grid.put(new Coordinate(x, y), possibleValues.get(riskIndex % possibleValues.size()));
                }
            }

            lastX = newLastX;
            lastY = newLastY;
        }

        private Coordinate getDestinationCoordinate() {
            return new Coordinate(lastX, lastY);
        }

        public Graph toGraph() {
            Graph graph = new Graph();

            //First add all nodes
            for (Entry<Coordinate, Integer> entry : grid.entrySet()) {
                Node node = new Node(entry.getKey());
                graph.addNode(node);
            }

            //Then populate them with the correct neighbors
            for (Coordinate coordinate : grid.keySet()) {
                Node node = graph.getNode(coordinate);

                for (Coordinate neighborCoordinate : coordinate.neighbours()) {
                    Node neighborNode = graph.getNode(neighborCoordinate);
                    if (neighborNode != null) {
                        node.addDestination(neighborNode, grid.get(neighborCoordinate));
                    }
                }
            }

            return graph;
        }

    }

}

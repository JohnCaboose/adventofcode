package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.AbstractGrid;
import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.graph.Graph;
import com.johncaboose.adventofcode.shared.graph.Node;

import java.util.List;
import java.util.Map;

class Day12 implements ISolvableDay<Long> {

    @Override
    public Long partOneSolver(String input) {
        HillClimbingArea area = new HillClimbingArea(input);
        Coordinate startCoordinate = area.getStartCoordinate();

        return shortestPath(startCoordinate, area);
    }

    @Override
    public Long partTwoSolver(String input) {
        HillClimbingArea area = new HillClimbingArea(input);

        // Would likely be computationally faster switch the direction (as well as adjust the height condition)
        // and then see reaching any of the "start" coordinates as reaching the end coordinate.
        // But less than 2 seconds  is fast enough for me, and less work too. 😅

        return area.getAllStartCoordinates()
                .stream()
                .mapToLong((startCoordinate) -> shortestPath(startCoordinate, area))
                .min()
                .orElse(Long.MAX_VALUE);
    }

    private static long shortestPath(Coordinate startCoordinate, HillClimbingArea area) {
        Graph graph = area.toGraph();
        Node startNode = graph.getNode(startCoordinate);

        Coordinate destinationCoordinate = area.getDestinationCoordinate();
        Node destinationNode = startNode.calculateShortestPath(destinationCoordinate);
        if (destinationNode == null) {
            return Long.MAX_VALUE;
        }
        return destinationNode.getDistance();
    }

    private static class HillClimbingArea extends AbstractGrid<String> {

        public static final String DESTINATION = "E";
        public static final String START = "S";

        public HillClimbingArea(String input) {
            super(input);
        }

        @Override
        public String valueOf(char character) {
            return String.valueOf(character);
        }

        private Coordinate getStartCoordinate() {
            return getCoordinate(START);
        }

        private List<Coordinate> getAllStartCoordinates() {
            return grid.entrySet()
                    .stream()
                    .filter(e -> e.getValue().equals("a") || e.getValue().equals("S"))
                    .map(Map.Entry::getKey)
                    .toList();
        }

        private Coordinate getDestinationCoordinate() {
            return getCoordinate(DESTINATION);
        }

        private Coordinate getCoordinate(String s) {
            return grid.entrySet()
                    .stream()
                    .filter(e -> e.getValue().equals(s))
                    .findFirst()
                    .orElseThrow()
                    .getKey();
        }

        public Graph toGraph() {
            Graph graph = new Graph();

            //First add all nodes
            for (Map.Entry<Coordinate, String> entry : grid.entrySet()) {
                Node node = new Node(entry.getKey());
                graph.addNode(node);
            }

            //Then populate them with the correct neighbors
            for (var entry : grid.entrySet()) {
                Coordinate coordinate = entry.getKey();
                int currentHeight = heightOf(entry.getValue());
                Node node = graph.getNode(coordinate);

                for (Coordinate neighborCoordinate : coordinate.neighbours()) {
                    Node neighborNode = graph.getNode(neighborCoordinate);
                    if (neighborNode != null && currentHeight + 1 >= heightOf(grid.get(neighborCoordinate))) {
                        node.addDestination(neighborNode, 1);
                    }
                }
            }

            return graph;
        }

        private static int heightOf(String value) {
            if (value.equals(START)) {
                value = "a";
            } else if (value.equals(DESTINATION)) {
                value = "z";
            }
            return value.codePointAt(0);
        }

    }
}

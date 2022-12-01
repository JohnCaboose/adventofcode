package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.Coordinate;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.IntegerGrid;

import java.util.*;
import java.util.Map.Entry;

class Day15 implements ISolvableDay {
    @Override
    public long partOneSolver(String input) {
        return solve(input, false);
    }

    @Override
    public long partTwoSolver(String input) {
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

        Node destinationNode = calculateShortestPathFromSource(startNode, cavern.getDestinationCoordinate());
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

    private static class Graph {
        private final HashMap<Coordinate, Node> nodes = new HashMap<>();

        public void addNode(Node node) {
            nodes.put(node.coordinate, node);
        }

        public Node getNode(Coordinate coordinate) {
            return nodes.get(coordinate);
        }

    }

    private static class Node implements Comparable<Node> {

        private final Coordinate coordinate;
        private int distance = Integer.MAX_VALUE;
        private final Map<Node, Integer> adjacentNodes = new HashMap<>();

        public Node(Coordinate coordinate) {
            this.coordinate = coordinate;
        }

        public void addDestination(Node destination, int distance) {
            adjacentNodes.put(destination, distance);
        }

        public Coordinate getCoordinate() {
            return coordinate;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public Map<Node, Integer> getAdjacentNodes() {
            return adjacentNodes;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return coordinate.equals(node.coordinate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(coordinate);
        }

        @Override
        public String toString() {
            return "Node{" + coordinate.toString() + "}";
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(distance, o.distance);
        }
    }

    private static Node calculateShortestPathFromSource(Node source, Coordinate targetCoordinate) {
        source.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        PriorityQueue<Node> unsettledNodes = new PriorityQueue<>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() > 0) {
            Node currentNode = unsettledNodes.poll();

            for (Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    if (!unsettledNodes.contains(adjacentNode)) {
                        unsettledNodes.add(adjacentNode);
                    }
                }
            }

            settledNodes.add(currentNode);

            if (currentNode.getCoordinate().equals(targetCoordinate)) {
                // settling target node means we have found the shortest path to it, no need for further calculations
                return currentNode;
            }
        }
        return null; // target never found!?
    }

    private static void calculateMinimumDistance(Node evaluationNode, int edgeWeight, Node sourceNode) {
        int sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeight < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeight);
        }
    }
}

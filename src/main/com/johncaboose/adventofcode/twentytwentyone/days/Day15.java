package com.johncaboose.adventofcode.twentytwentyone.days;

import com.johncaboose.adventofcode.twentytwentyone.shared.Coordinate;

import java.util.*;
import java.util.Map.Entry;

public class Day15 implements ISolvableDay {
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

        Node destinationNode = calculateShortestPathFromSource(graph, startNode, cavern.getDestinationCoordinate());
        return destinationNode.getDistance();
    }

    private static class Cavern {
        private final HashMap<Coordinate, Integer> grid = new HashMap<>();
        private int lastX = 0;
        private int lastY = 0;

        public Cavern(String input) {
            try (Scanner scanner = new Scanner(input)) {
                int x = 0;

                while (scanner.hasNextLine()) {
                    lastX = x;
                    String line = scanner.nextLine();
                    for (int y = 0; y < line.length(); y++) {
                        lastY = y;
                        int value = Character.getNumericValue(line.charAt(y));
                        grid.put(new Coordinate(x, y), value);
                    }

                    x++;
                }

            }
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

        public void adjustRiskLevelsAndSize() {
            //TODO
        }
    }

    private static class Graph {
        private HashMap<Coordinate, Node> nodes = new HashMap<>();

        public void addNode(Node node) {
            nodes.put(node.coordinate, node);
        }

        public Node getNode(Coordinate coordinate) {
            return nodes.get(coordinate);
        }

    }

    private static class Node {

        private Coordinate coordinate;
        private List<Node> shortestPath = new LinkedList<>();
        private Integer distance = Integer.MAX_VALUE;
        private Map<Node, Integer> adjacentNodes = new HashMap<>();

        public void addDestination(Node destination, int distance) {
            adjacentNodes.put(destination, distance);
        }

        public Node(Coordinate coordinate) {
            this.coordinate = coordinate;
        }

        public Integer getDistance() {
            return distance;
        }

        public void setDistance(Integer distance) {
            this.distance = distance;
        }

        public List<Node> getShortestPath() {
            return shortestPath;
        }

        public void setShortestPath(List<Node> shortestPath) {
            this.shortestPath = shortestPath;
        }

        public Map<Node, Integer> getAdjacentNodes() {
            return adjacentNodes;
        }

    }

    private static Node calculateShortestPathFromSource(Graph graph, Node source, Coordinate target) {
        source.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() > 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
            if (currentNode.coordinate.equals(target)) {
                return currentNode;
            }
        }
        return null; // target never found!?
    }

    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }
}

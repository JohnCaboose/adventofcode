package com.johncaboose.adventofcode.shared.graph;

import com.johncaboose.adventofcode.shared.Coordinate;

import java.util.*;

public class Node implements Comparable<Node> {

    private final Coordinate coordinate;
    private long distance = Long.MAX_VALUE;
    private final Map<Node, Long> adjacentNodes = new HashMap<>();

    public Node(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void addDestination(Node destination, long distance) {
        adjacentNodes.put(destination, distance);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public Map<Node, Long> getAdjacentNodes() {
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
        return Long.compare(distance, o.distance);
    }

    public Node calculateShortestPath(Coordinate targetCoordinate) {
        Node source = this;
        source.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        PriorityQueue<Node> unsettledNodes = new PriorityQueue<>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() > 0) {
            Node currentNode = unsettledNodes.poll();

            for (Map.Entry<Node, Long> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Long edgeWeight = adjacencyPair.getValue();
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

    public static void calculateMinimumDistance(Node evaluationNode, long edgeWeight, Node sourceNode) {
        long sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeight < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeight);
        }
    }
}

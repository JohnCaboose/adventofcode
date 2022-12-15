package com.johncaboose.adventofcode.shared.graph;

import com.johncaboose.adventofcode.shared.Coordinate;

import java.util.HashMap;

public class Graph {
    private final HashMap<Coordinate, Node> nodes = new HashMap<>();

    public void addNode(Node node) {
        nodes.put(node.getCoordinate(), node);
    }

    public Node getNode(Coordinate coordinate) {
        return nodes.get(coordinate);
    }

}

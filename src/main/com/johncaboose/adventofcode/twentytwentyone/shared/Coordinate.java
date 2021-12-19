package com.johncaboose.adventofcode.twentytwentyone.shared;

import java.util.List;

public record Coordinate(int x, int y) {
    public Coordinate(Coordinate other) {
        this(other.x, other.y);
    }

    public List<Coordinate> neighbours() {
        return List.of(
                new Coordinate(x - 1, y), //up
                new Coordinate(x + 1, y), //down
                new Coordinate(x, y - 1), //left
                new Coordinate(x, y + 1)  //right
        );
    }

    @Override
    public String toString() {
        return x + "," + y;
    }

}

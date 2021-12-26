package com.johncaboose.adventofcode.twentytwentyone.shared;

import java.util.List;

public record Coordinate(int x, int y) {

    public static final String SEPARATOR_STRING = ",";

    /**
     * @param coordinateString comma-separated according to the "x,y" format where x and y are integers
     */
    public Coordinate(String coordinateString) {
        this(coordinateString.split(SEPARATOR_STRING)[0], coordinateString.split(SEPARATOR_STRING)[1]);
    }

    public Coordinate(String x, String y) {
        this(Integer.parseInt(x), Integer.parseInt(y));
    }


    public Coordinate(Coordinate other) {
        this(other.x, other.y);
    }

    /**
     * @return list of neighbour coordinates, not including the diagonal neighbours.
     */
    public List<Coordinate> neighbours() {
        return List.of(
                new Coordinate(x - 1, y),
                new Coordinate(x + 1, y),
                new Coordinate(x, y - 1),
                new Coordinate(x, y + 1)
        );
    }


    @Override
    public String toString() {
        return x + SEPARATOR_STRING + y;
    }

}

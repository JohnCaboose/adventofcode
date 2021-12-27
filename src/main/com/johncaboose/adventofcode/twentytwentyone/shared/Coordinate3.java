package com.johncaboose.adventofcode.twentytwentyone.shared;

public record Coordinate3(int x, int y, int z) {

    public static final String SEPARATOR_STRING = ",";

    /**
     * @param coordinateString comma-separated according to the "x,y,z" format where x and y and z are integers
     */
    public Coordinate3(String coordinateString) {
        this(coordinateString.split(SEPARATOR_STRING)[0], coordinateString.split(SEPARATOR_STRING)[1], coordinateString.split(SEPARATOR_STRING)[2]);
    }

    public Coordinate3(String x, String y, String z) {
        this(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(z));
    }


    public Coordinate3(Coordinate3 other) {
        this(other.x, other.y, other.z);
    }


    @Override
    public String toString() {
        return x + SEPARATOR_STRING + y + SEPARATOR_STRING + z;
    }
}

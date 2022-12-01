package com.johncaboose.adventofcode.shared;

public record Coordinate3(int x, int y, int z) {

    public static final String SEPARATOR_STRING = ",";

    /**
     * @param coordinateString comma-separated according to the "x,y,z" format where x and y and z are integers
     */
    public Coordinate3(String coordinateString) {
        this(coordinateString.split(SEPARATOR_STRING)[0], coordinateString.split(SEPARATOR_STRING)[1], coordinateString.split(SEPARATOR_STRING)[2]);
    }

    /**
     * @param x string representation of the value for the x-axis
     * @param y string representation of the value for the y-axis
     * @param z string representation of the value for the z-axis
     */
    public Coordinate3(String x, String y, String z) {
        this(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(z));
    }

    /**
     * Constructs an deep copy of the provided Coordinate3.
     *
     * @param other the Coordinate3 to copy the values from to create this new object.
     */
    public Coordinate3(Coordinate3 other) {
        this(other.x, other.y, other.z);
    }


    @Override
    public String toString() {
        return x + SEPARATOR_STRING + y + SEPARATOR_STRING + z;
    }
}

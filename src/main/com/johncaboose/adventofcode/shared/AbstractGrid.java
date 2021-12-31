package com.johncaboose.adventofcode.shared;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @param <T> the type of content contained in the grid
 */
public abstract class AbstractGrid<T> {

    protected final HashMap<Coordinate, T> grid = new HashMap<>();
    protected int lastX = 0;
    protected int lastY = 0;

    public AbstractGrid(AbstractGrid<? extends T> other) {
        grid.putAll(other.grid);
        lastX = other.lastX;
        lastY = other.lastY;
    }

    public AbstractGrid(String input) {
        try (Scanner scanner = new Scanner(input)) {
            int y = 0;

            while (scanner.hasNextLine()) {
                lastY = y;
                String line = scanner.nextLine();
                for (int x = 0; x < line.length(); x++) {
                    lastX = x;
                    T value = valueOf(line.charAt(x));
                    grid.put(new Coordinate(x, y), value);
                }

                y++;
            }

        }
    }

    public int getXBoundExclusive() {
        return lastX + 1;
    }

    public int getYBoundExclusive() {
        return lastY + 1;
    }

    /**
     * Convert the character representation of the content to T
     *
     * @param character
     * @return
     */
    public abstract T valueOf(char character);

    /**
     * Convert the content to its character representation
     *
     * @param content
     * @return
     */
    public String stringOf(T content) {
        return content.toString();
    }

    /**
     * @return the amount of entries in the grid
     */
    public int size() {
        return grid.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y <= lastY; y++) {
            for (int x = 0; x <= lastX; x++) {
                sb.append(stringOf(grid.get(new Coordinate(x, y))));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

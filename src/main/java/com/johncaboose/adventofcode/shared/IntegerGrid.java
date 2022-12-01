package com.johncaboose.adventofcode.shared;

public abstract class IntegerGrid extends AbstractGrid<Integer> {

    public IntegerGrid(AbstractGrid<? extends Integer> other) {
        super(other);
    }

    public IntegerGrid(String input) {
        super(input);
    }

    @Override
    public Integer valueOf(char character) {
        return Character.getNumericValue(character);
    }
}

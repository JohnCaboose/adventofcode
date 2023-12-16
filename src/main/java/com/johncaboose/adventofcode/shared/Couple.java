package com.johncaboose.adventofcode.shared;

public record Couple<F, S>(F first, S second) {
    public static <F, S> Couple<F, S> of(F first, S second) {
        return new Couple<>(first, second);
    }

}

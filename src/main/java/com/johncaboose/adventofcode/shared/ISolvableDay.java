package com.johncaboose.adventofcode.shared;

public interface ISolvableDay<T> {

    T partOneSolver(String input);

    T partTwoSolver(String input);
}

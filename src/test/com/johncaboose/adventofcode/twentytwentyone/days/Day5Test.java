package com.johncaboose.adventofcode.twentytwentyone.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day5Test {

    private static final String EXAMPLE = ProblemInput.DAY_5_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_5_INPUT;

    private ISolvableDay sut = new Day5();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(5, sut.partOneSolver(EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(4745, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(12, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(18442, sut.partTwoSolver(INPUT));
    }

}
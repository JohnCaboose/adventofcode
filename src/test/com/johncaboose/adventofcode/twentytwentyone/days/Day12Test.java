package com.johncaboose.adventofcode.twentytwentyone.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day12Test {

    private static final String EXAMPLE = ProblemInput.DAY_12_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_12_INPUT;

    private ISolvableDay sut = new Day12();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(10, sut.partOneSolver(EXAMPLE));
    }


    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(4549, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(36, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(120535, sut.partTwoSolver(INPUT));
    }

}
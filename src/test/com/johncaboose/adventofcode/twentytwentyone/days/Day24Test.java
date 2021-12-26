package com.johncaboose.adventofcode.twentytwentyone.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day24Test {

    private static final String EXAMPLE = ProblemInput.DAY_24_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_24_INPUT;

    private ISolvableDay sut = new Day24();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(58, sut.partOneSolver(EXAMPLE));
    }


    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(-1, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(-1, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(-1, sut.partTwoSolver(INPUT));
    }

}
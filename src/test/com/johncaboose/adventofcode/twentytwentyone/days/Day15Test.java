package com.johncaboose.adventofcode.twentytwentyone.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day15Test {

    private static final String EXAMPLE = ProblemInput.DAY_15_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_15_INPUT;

    private ISolvableDay sut = new Day15();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(40, sut.partOneSolver(EXAMPLE));
    }


    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(621, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(315, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(2904, sut.partTwoSolver(INPUT));
    }

}
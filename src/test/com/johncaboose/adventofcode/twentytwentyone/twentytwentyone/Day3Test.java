package com.johncaboose.adventofcode.twentytwentyone.twentytwentyone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3Test {

    ISolvableDay sut = new Day3();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(198, sut.partOneSolver(ProblemInput.DAY_3_EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(4001724, sut.partOneSolver(ProblemInput.DAY_3_INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(230, sut.partTwoSolver(ProblemInput.DAY_3_EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(587895, sut.partTwoSolver(ProblemInput.DAY_3_INPUT));
    }

}
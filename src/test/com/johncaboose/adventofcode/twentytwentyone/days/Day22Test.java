package com.johncaboose.adventofcode.twentytwentyone.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day22Test {

    private static final String EXAMPLE_1 = ProblemInput.DAY_22_EXAMPLE_1;
    private static final String EXAMPLE_2 = ProblemInput.DAY_22_EXAMPLE_2;
    private static final String INPUT = ProblemInput.DAY_22_INPUT;

    private ISolvableDay sut = new Day22();

    @Test
    void part1Solver_WHEN_exampleInput1_THEN_outputMatchesExampleOutput() {
        assertEquals(39, sut.partOneSolver(EXAMPLE_1));
    }

    @Test
    void part1Solver_WHEN_exampleInput2_THEN_outputMatchesExampleOutput() {
        assertEquals(590784, sut.partOneSolver(EXAMPLE_2));
    }


    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(583641, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput1_THEN_outputMatchesExampleOutput() {
        assertEquals(-1, sut.partTwoSolver(EXAMPLE_1));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(-1, sut.partTwoSolver(INPUT));
    }

}
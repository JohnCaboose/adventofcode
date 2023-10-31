package com.johncaboose.adventofcode.days.twentytwenty;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day5Test {

    private static final String EXAMPLE = ProblemInput.DAY_5_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_5_INPUT;

    private final ISolvableDay<Long> sut = new Day5();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(820, sut.partOneSolver(EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(994, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(-1, sut.partTwoSolver(EXAMPLE)); // Has no solution
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(741, sut.partTwoSolver(INPUT));
    }

}
package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day9Test {

    private static final String EXAMPLE = ProblemInput.DAY_9_EXAMPLE;
    private static final String EXAMPLE_2 = ProblemInput.DAY_9_EXAMPLE_2;
    private static final String INPUT = ProblemInput.DAY_9_INPUT;

    private final ISolvableDay<Long> sut = new Day9();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(13, sut.partOneSolver(EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(6266, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(36, sut.partTwoSolver(EXAMPLE_2));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(2369, sut.partTwoSolver(INPUT));
    }

}
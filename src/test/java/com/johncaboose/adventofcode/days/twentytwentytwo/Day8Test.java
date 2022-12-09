package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day8Test {

    private static final String EXAMPLE = ProblemInput.DAY_8_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_8_INPUT;

    private final ISolvableDay<Long> sut = new Day8();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(21, sut.partOneSolver(EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(1733, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(8, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(284648, sut.partTwoSolver(INPUT));
    }

}
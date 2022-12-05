package com.johncaboose.adventofcode.days.twentytwenty;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day3Test {

    private static final String EXAMPLE = ProblemInput.DAY_3_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_3_INPUT;

    private final ISolvableDay<Long> sut = new Day3();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(7, sut.partOneSolver(EXAMPLE));
    }


    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(156, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(336, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(3521829480L, sut.partTwoSolver(INPUT));
    }

}
package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day1Test {

    private static final String EXAMPLE = ProblemInput.DAY_1_EXAMPLE;
    private static final String EXAMPLE_PART_2 = ProblemInput.DAY_1_EXAMPLE_2;
    private static final String INPUT = ProblemInput.DAY_1_INPUT;

    private final ISolvableDay<Long> sut = new Day1();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(142, sut.partOneSolver(EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(55816, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(281, sut.partTwoSolver(EXAMPLE_PART_2));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(54980, sut.partTwoSolver(INPUT));
    }

}
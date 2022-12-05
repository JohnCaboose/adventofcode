package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day25Test {

    private static final String EXAMPLE = ProblemInput.DAY_25_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_25_INPUT;

    private final ISolvableDay<Long> sut = new Day25();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(58, sut.partOneSolver(EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(482, sut.partOneSolver(INPUT));
    }

}
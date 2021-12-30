package com.johncaboose.adventofcode.twentytwentyone.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day24Test {

    private static final String INPUT = ProblemInput.DAY_24_INPUT;

    private ISolvableDay sut = new Day24();


    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(92793949489995L, sut.partOneSolver(INPUT));
    }


    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(51131616112781L, sut.partTwoSolver(INPUT));
    }

}
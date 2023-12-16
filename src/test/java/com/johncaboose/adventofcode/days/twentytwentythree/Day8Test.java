package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Day8Test {

    private static final String EXAMPLE = ProblemInput.DAY_8_EXAMPLE;
    private static final String PART_2_EXAMPLE = ProblemInput.DAY_8_PART_2_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_8_INPUT;

    private final ISolvableDay<Long> sut = new Day8();

    @Test
    @Order(1)
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(6, sut.partOneSolver(EXAMPLE));
    }

    @Test
    @Order(2)
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(12169, sut.partOneSolver(INPUT));
    }

    @Test
    @Order(3)
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(6, sut.partTwoSolver(PART_2_EXAMPLE));
    }

    @Test
    @Order(4)
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(12_030_780_859_469L, sut.partTwoSolver(INPUT));
    }

}
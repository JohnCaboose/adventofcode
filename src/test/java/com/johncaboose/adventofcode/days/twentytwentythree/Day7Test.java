package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Day7Test {

    private static final String EXAMPLE = ProblemInput.DAY_7_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_7_INPUT;

    private final ISolvableDay<Long> sut = new Day7();

    @Test
    @Order(1)
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(6440, sut.partOneSolver(EXAMPLE));
    }

    @Test
    @Order(2)
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(246163188, sut.partOneSolver(INPUT));
    }

    @Test
    @Order(3)
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(5905, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    @Order(4)
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(245794069, sut.partTwoSolver(INPUT));
    }

}
package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Day22Test {

    private static final String EXAMPLE_1 = ProblemInput.DAY_22_EXAMPLE_1;
    private static final String EXAMPLE_2 = ProblemInput.DAY_22_EXAMPLE_2;
    private static final String EXAMPLE_3 = ProblemInput.DAY_22_EXAMPLE_3;
    private static final String INPUT = ProblemInput.DAY_22_INPUT;

    private final ISolvableDay<Long> sut = new Day22();

    @Test
    @Order(1)
    void part1Solver_WHEN_exampleInput1_THEN_outputMatchesExampleOutput() {
        assertEquals(39, sut.partOneSolver(EXAMPLE_1));
    }

    @Test
    @Order(1)
    void part1Solver_WHEN_exampleInput2_THEN_outputMatchesExampleOutput() {
        assertEquals(590784, sut.partOneSolver(EXAMPLE_2));
    }

    @Test
    @Order(1)
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(583641, sut.partOneSolver(INPUT));
    }

    @Test
    @Order(2)
    void part2Solver_WHEN_exampleInput3_THEN_outputMatchesExampleOutput() {
        assertEquals(2758514936282235L, sut.partTwoSolver(EXAMPLE_3));
    }

    @Test
    @Order(3)
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        //Warning: Test takes two minutes on m1 macbook air
        assertEquals(1182153534186233L, sut.partTwoSolver(INPUT));
    }


}
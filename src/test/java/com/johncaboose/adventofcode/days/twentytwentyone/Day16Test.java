package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day16Test {

    private static final String EXAMPLE_1 = "8A004A801A8002F478";
    private static final String EXAMPLE_2 = "620080001611562C8802118E34";
    private static final String EXAMPLE_3 = "C0015000016115A2E0802F182340";
    private static final String EXAMPLE_4 = "A0016C880162017C3686B18A3D4780";
    private static final String EXAMPLE_5 = "D2FE28";
    private static final String EXAMPLE_6 = "38006F45291200";
    private static final String PART_TWO_EXAMPLE = "9C0141080250320F1802104A08";
    private static final String INPUT = ProblemInput.DAY_16_INPUT;

    private final ISolvableDay sut = new Day16();

    @Test
    void part1Solver_WHEN_example1Input_THEN_outputMatchesExampleOutput() {
        assertEquals(16, sut.partOneSolver(EXAMPLE_1));
    }

    @Test
    void part1Solver_WHEN_example2Input_THEN_outputMatchesExampleOutput() {
        assertEquals(12, sut.partOneSolver(EXAMPLE_2));
    }

    @Test
    void part1Solver_WHEN_example3Input_THEN_outputMatchesExampleOutput() {
        assertEquals(23, sut.partOneSolver(EXAMPLE_3));
    }

    @Test
    void part1Solver_WHEN_example4Input_THEN_outputMatchesExampleOutput() {
        assertEquals(31, sut.partOneSolver(EXAMPLE_4));
    }

    @Test
    void part1Solver_WHEN_example5Input_THEN_outputMatchesExampleOutput() {
        assertEquals(6, sut.partOneSolver(EXAMPLE_5));
    }

    @Test
    void part1Solver_WHEN_example6Input_THEN_outputMatchesExampleOutput() {
        assertEquals(9, sut.partOneSolver(EXAMPLE_6));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(860, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(1, sut.partTwoSolver(PART_TWO_EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(470949537659L, sut.partTwoSolver(INPUT));
    }

}
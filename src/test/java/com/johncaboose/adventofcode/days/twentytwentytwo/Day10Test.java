package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day10Test {

    private static final String EXAMPLE = ProblemInput.DAY_10_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_10_INPUT;

    private final ISolvableDay<Long> sut = new Day10();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(13140, sut.partOneSolver(EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(14920, sut.partOneSolver(INPUT));
    }


    private static final String SCREEN_EXAMPLE = """
            ##..##..##..##..##..##..##..##..##..##..
            ###...###...###...###...###...###...###.
            ####....####....####....####....####....
            #####.....#####.....#####.....#####.....
            ######......######......######......####
            #######.......#######.......#######.....""";

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(SCREEN_EXAMPLE.hashCode(), sut.partTwoSolver(EXAMPLE));
    }

    private static final String SCREEN_ACTUAL = """
            ###..#..#..##...##...##..###..#..#.####.
            #..#.#..#.#..#.#..#.#..#.#..#.#..#....#.
            ###..#..#.#....#..#.#....###..#..#...#..
            #..#.#..#.#....####.#....#..#.#..#..#...
            #..#.#..#.#..#.#..#.#..#.#..#.#..#.#....
            ###...##...##..#..#..##..###...##..####.""";

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(SCREEN_ACTUAL.hashCode(), sut.partTwoSolver(INPUT));
    }

}
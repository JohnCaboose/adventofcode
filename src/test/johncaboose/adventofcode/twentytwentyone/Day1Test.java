package johncaboose.adventofcode.twentytwentyone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    ISolvableDay sut = new Day1();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(7, sut.partOneSolver(ProblemInput.DAY_1_EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(1665, sut.partOneSolver(ProblemInput.DAY_1_INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(5, sut.partTwoSolver(ProblemInput.DAY_1_EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(1702, sut.partTwoSolver(ProblemInput.DAY_1_INPUT));
    }

}
import org.junit.jupiter.api.Test;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day${DAY_NAME}Test {

    private static final String EXAMPLE = ProblemInput.DAY_${DAY_NAME}_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_${DAY_NAME}_INPUT;

    private final ISolvableDay<${SOLUTION_CLASS}> sut = new Day${DAY_NAME}();

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(null, sut.partOneSolver(EXAMPLE));
    }


    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(null, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(null, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(null, sut.partTwoSolver(INPUT));
    }

}
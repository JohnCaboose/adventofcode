import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Day${DAY_NAME}Test {

    private static final String EXAMPLE = ProblemInput.DAY_${DAY_NAME}_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_${DAY_NAME}_INPUT;

    private final ISolvableDay<${SOLUTION_CLASS}> sut = new Day${DAY_NAME}();

    @Test
    @Order(1)
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(-1, sut.partOneSolver(EXAMPLE));
    }

    @Test
    @Order(2)
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(-1, sut.partOneSolver(INPUT));
    }

    @Test
    @Order(3)
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(-1, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    @Order(4)
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(-1, sut.partTwoSolver(INPUT));
    }

}
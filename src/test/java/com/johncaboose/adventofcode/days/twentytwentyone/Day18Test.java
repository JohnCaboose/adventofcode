package com.johncaboose.adventofcode.days.twentytwentyone;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Day18Test {

    private static final String EXAMPLE = ProblemInput.DAY_18_EXAMPLE;
    private static final String INPUT = ProblemInput.DAY_18_INPUT;


    private final Day18 sut = new Day18();

    @Test
    @Order(1)
    void explode_WHEN_exampleInput1_THEN_outputMatchesExampleOutput() {
        String example = "[[[[[9,8],1],2],3],4]";
        String expected = "[[[[0,9],2],3],4]";

        assertEquals(expected, Day18.explode(example));
    }

    @Test
    @Order(1)
    void explode_WHEN_exampleInput2_THEN_outputMatchesExampleOutput() {
        String example = "[7,[6,[5,[4,[3,2]]]]]";
        String expected = "[7,[6,[5,[7,0]]]]";

        assertEquals(expected, Day18.explode(example));
    }

    @Test
    @Order(1)
    void explode_WHEN_exampleInput3_THEN_outputMatchesExampleOutput() {
        String example = "[[6,[5,[4,[3,2]]]],1]";
        String expected = "[[6,[5,[7,0]]],3]";

        assertEquals(expected, Day18.explode(example));
    }

    @Test
    @Order(1)
    void explode_WHEN_exampleInput4_THEN_outputMatchesExampleOutput() {
        String example = "[[3,[2,[1,[7,3]]]],[6,[5,[4,[3,2]]]]]";
        String expected = "[[3,[2,[8,0]]],[9,[5,[4,[3,2]]]]]";

        assertEquals(expected, Day18.explode(example));
    }

    @Test
    @Order(1)
    void explode_WHEN_exampleInput5_THEN_outputMatchesExampleOutput() {
        String example = "[[3,[2,[8,0]]],[9,[5,[4,[3,2]]]]]";
        String expected = "[[3,[2,[8,0]]],[9,[5,[7,0]]]]";

        assertEquals(expected, Day18.explode(example));
    }

    @Test
    @Order(1)
    void explode_WHEN_exampleInput6_THEN_outputMatchesExampleOutput() {
        String example = "[[[[0,7],4],[[7,8],[0,[6,7]]]],[1,1]]";
        String expected = "[[[[0,7],4],[[7,8],[6,0]]],[8,1]]";

        assertEquals(expected, Day18.explode(example));
    }

    @Test
    @Order(1)
    void split_WHEN_exampleInput1_THEN_outputMatchesExampleOutput() {
        String example = "[[[[0,7],4],[15,[0,13]]],[1,1]]";
        String expected = "[[[[0,7],4],[[7,8],[0,13]]],[1,1]]";

        assertEquals(expected, Day18.split(example));
    }

    @Test
    @Order(1)
    void split_WHEN_exampleInput2_THEN_outputMatchesExampleOutput() {
        String example = "[[[[0,7],4],[[7,8],[0,13]]],[1,1]]";
        String expected = "[[[[0,7],4],[[7,8],[0,[6,7]]]],[1,1]]";

        assertEquals(expected, Day18.split(example));
    }

    @Test
    @Order(1)
    void reduce_WHEN_exampleInput1_THEN_outputMatchesExampleOutput() {
        String example = "[[[[[4,3],4],4],[7,[[8,4],9]]],[1,1]]";
        String expected = "[[[[0,7],4],[[7,8],[6,0]]],[8,1]]";

        assertEquals(expected, Day18.reduce(example));
    }


    @Test
    @Order(2)
    void calculateSnailfishNumber_WHEN_exampleInput1_THEN_outputMatchesExampleOutput() {
        String example = """
                [[[[4,3],4],4],[7,[[8,4],9]]]
                [1,1]""";
        String expected = "[[[[0,7],4],[[7,8],[6,0]]],[8,1]]";

        assertEquals(expected, Day18.calculateSum(example));

    }

    @Test
    @Order(2)
    void calculateSnailfishNumber_WHEN_exampleInput2_THEN_outputMatchesExampleOutput() {
        String example = """
                [[[0,[4,5]],[0,0]],[[[4,5],[2,6]],[9,5]]]
                [7,[[[3,7],[4,3]],[[6,3],[8,8]]]]""";
        String expected = "[[[[4,0],[5,4]],[[7,7],[6,0]]],[[8,[7,7]],[[7,9],[5,0]]]]";

        assertEquals(expected, Day18.calculateSum(example));
    }

    @Test
    @Order(2)
    void calculateSnailfishNumber_WHEN_exampleInput3_THEN_outputMatchesExampleOutput() {
        String example = """
                [[[[4,0],[5,4]],[[7,7],[6,0]]],[[8,[7,7]],[[7,9],[5,0]]]]
                [[2,[[0,8],[3,4]]],[[[6,7],1],[7,[1,6]]]]""";
        String expected = "[[[[6,7],[6,7]],[[7,7],[0,7]]],[[[8,7],[7,7]],[[8,8],[8,0]]]]";

        assertEquals(expected, Day18.calculateSum(example));
    }

    @Test
    @Order(2)
    void calculateSnailfishNumber_WHEN_exampleInput4_THEN_outputMatchesExampleOutput() {
        String example = """
                [1,1]
                [2,2]
                [3,3]
                [4,4]""";
        String expected = "[[[[1,1],[2,2]],[3,3]],[4,4]]";

        assertEquals(expected, Day18.calculateSum(example));
    }

    @Test
    @Order(2)
    void calculateSnailfishNumber_WHEN_exampleInput5_THEN_outputMatchesExampleOutput() {
        String example = """
                [1,1]
                [2,2]
                [3,3]
                [4,4]
                [5,5]""";
        String expected = "[[[[3,0],[5,3]],[4,4]],[5,5]]";

        assertEquals(expected, Day18.calculateSum(example));
    }

    @Test
    @Order(2)
    void calculateSnailfishNumber_WHEN_exampleInput6_THEN_outputMatchesExampleOutput() {
        String example = """
                [1,1]
                [2,2]
                [3,3]
                [4,4]
                [5,5]
                [6,6]""";
        String expected = "[[[[5,0],[7,4]],[5,5]],[6,6]]";

        assertEquals(expected, Day18.calculateSum(example));
    }

    @Test
    void part1Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(4140, sut.partOneSolver(EXAMPLE));
    }

    @Test
    void part1Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(4289, sut.partOneSolver(INPUT));
    }

    @Test
    void part2Solver_WHEN_exampleInput_THEN_outputMatchesExampleOutput() {
        assertEquals(3993, sut.partTwoSolver(EXAMPLE));
    }

    @Test
    void part2Solver_WHEN_realInput_THEN_outputMatchesValidatedAnswer() {
        assertEquals(4807, sut.partTwoSolver(INPUT));
    }

}
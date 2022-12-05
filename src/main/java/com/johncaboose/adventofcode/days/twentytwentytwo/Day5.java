package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ExtendedMap;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class Day5 implements ISolvableDay<String> {

    @Override
    public String partOneSolver(String input) {
        String[] sections = input.split("\n\n");
        ExtendedMap<Integer, SupplyStack> stacks = readStacks(sections[0]);
        List<Move> moves = readMoves(sections[1]);

        return null;
    }

    @Override
    public String partTwoSolver(String input) {

        return null;
    }

    private static ExtendedMap<Integer, SupplyStack> readStacks(String stackPart) {
        return null;
    }

    private static List<Move> readMoves(String movePart) {
        return null;
    }


    private record Move(int amount, int fromStack, int toStack) {

    }

    private record SupplyStack(Deque<String> stack) {

        public SupplyStack() {
            this(new ArrayDeque<>());
        }
    }
}

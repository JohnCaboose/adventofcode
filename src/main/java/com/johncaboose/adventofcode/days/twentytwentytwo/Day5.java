package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ExtendedHashMap;
import com.johncaboose.adventofcode.shared.ExtendedMap;
import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Day5 implements ISolvableDay<String> {

    private static final Pattern INSTRUCTION_PATTERN = Pattern.compile("move (\\d+) from (\\d+) to (\\d+)");

    @Override
    public String partOneSolver(String input) {
        return solve(input, false);
    }

    @Override
    public String partTwoSolver(String input) {
        return solve(input, true);
    }

    private static String solve(String input, boolean moveMultipleCratesAtOnce) {
        String[] sections = input.split("\n\n");
        ExtendedMap<Integer, SupplyStack> stacks = readStacks(sections[0]);
        List<Instruction> instructions = readInstructions(sections[1]);

        for (Instruction instruction : instructions) {
            instruction.performInstruction(stacks, moveMultipleCratesAtOnce);
        }

        return stacks.keySet()
                // Sort stack names in correct order
                .stream()
                .mapToInt(Integer::intValue)
                .sorted()
                // Convert stack names to the stacks themselves
                .mapToObj(stacks::get)
                // Turn the contents of each top crate into a single string
                .map(SupplyStack::peekAtTop)
                .collect(Collectors.joining());
    }

    private static ExtendedMap<Integer, SupplyStack> readStacks(String stackPart) {
        ExtendedMap<Integer, SupplyStack> stacks = new ExtendedHashMap<>();

        Scanner scanner = new Scanner(stackPart);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!scanner.hasNextLine()) {
                // Last line is just names of the stacks, which are already known -> stop parsing
                break;
            }
            // Save the values in each stack
            for (int i = 0; true; i++) {
                int position = 1 + (i * 4);
                if (position >= line.length()) {
                    break;
                }

                String value = line.substring(position, position + 1);
                int stackName = 1 + i;
                // We want this statement outside the if, in case any stack starts completely empty
                SupplyStack stack = stacks.getOrStoreDefault(stackName, SupplyStack::new);
                if (!value.isBlank()) {
                    stack.addToBottom(value);
                }
            }
        }
        return stacks;
    }

    private static List<Instruction> readInstructions(String movePart) {
        List<Instruction> instructions = new ArrayList<>();
        Matcher matcher = INSTRUCTION_PATTERN.matcher(movePart);
        while (matcher.find()) {
            MatchResult result = matcher.toMatchResult();
            instructions.add(new Instruction(result.group(1), result.group(2), result.group(3)));
        }
        return instructions;
    }


    private record Instruction(int amount, int from, int to) {

        public Instruction(String amount, String fromStack, String toStack) {
            this(Integer.parseInt(amount), Integer.parseInt(fromStack), Integer.parseInt(toStack));
        }

        private void performInstruction(Map<Integer, SupplyStack> stacks, boolean moveMultipleCratesAtOnce) {
            SupplyStack fromStack = stacks.get(from);
            SupplyStack toStack = stacks.get(to);
            toStack.addToTop(fromStack.lift(amount, moveMultipleCratesAtOnce));
        }

    }

    private record SupplyStack(Deque<String> stack) {

        public SupplyStack() {
            this(new ArrayDeque<>());
        }

        /**
         * @param amountOfCrates       the amount of crates to lift from the supply stack
         * @param multipleCratesAtOnce true means the crates are lifted all at once, false means crates lifted one by
         *                             one.
         * @return a list of lifted crates. The top crate is first if multiple crates are lifted at once, otherwise it
         * is last.
         * @throws NoSuchElementException if not enough crates available in the supply stack
         */
        public List<String> lift(int amountOfCrates, boolean multipleCratesAtOnce) {
            List<String> liftedCrates = new ArrayList<>();
            for (int i = 0; i < amountOfCrates; i++) {
                liftedCrates.add(stack.removeLast());
            }
            if (multipleCratesAtOnce) {
                Collections.reverse(liftedCrates);
            }
            return liftedCrates;
        }

        public String peekAtTop() {
            return stack.peekLast();
        }

        public void addToBottom(String value) {
            stack.addFirst(value);
        }

        public void addToTop(List<String> liftedCrates) {
            stack.addAll(liftedCrates);
        }
    }
}

package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Utils;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

class Day11 implements ISolvableDay<Long> {

    @Override
    public Long partOneSolver(String input) {
        return solve(input, true);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, false);
    }

    private static Long solve(String input, boolean partOne) {
        List<Monkey> monkeys = parseInput(input);

        long totalFactorOfTestability = monkeys.stream()
                .mapToLong(Monkey::divisibleByTestValue)
                .reduce(1L, Math::multiplyExact);

        long divideByAfterInspect = partOne ? 3 : totalFactorOfTestability;

        int amountOfRounds = partOne ? 20 : 10000;
        for (int round = 0; round < amountOfRounds; round++) {
            for (Monkey monkey : monkeys) {
                monkey.performRound(partOne, divideByAfterInspect);
            }
        }

        return monkeys.stream()
                .map(Monkey::inspectedItems)
                .map(AtomicLong::get)
                .sorted(Collections.reverseOrder())
                .limit(2)
                .reduce(1L, Math::multiplyExact);
    }

    private static List<Monkey> parseInput(String input) {
        String[] monkeyStrings = input.split("\n\n");

        List<Monkey> monkeys = new ArrayList<>();
        for (String monkey : monkeyStrings) {
            //index of list is same as name of Monkey
            monkeys.add(Monkey.parseInput(monkey, monkeys));
        }
        return monkeys;
    }

    private record Monkey(Deque<Long> items,
                          Operation operation,
                          long divisibleByTestValue,
                          int testTrueDestination,
                          int testFalseDestination,
                          List<Monkey> allMonkeys,
                          AtomicLong inspectedItems) {

        public Monkey(Deque<Long> items,
                      Operation operation,
                      long divisibleByTestValue,
                      int testTrueDestination,
                      int testFalseDestination,
                      List<Monkey> allMonkeys
        ) {
            this(items, operation, divisibleByTestValue, testTrueDestination, testFalseDestination, allMonkeys,
                    new AtomicLong(0));
        }

        public void performRound(boolean partOne, long divideWorryLevel) {
            while (!items.isEmpty()) {
                long worryLevel = items.removeFirst();
                long newWorryLevel = inspect(worryLevel);
                if (partOne) {
                    newWorryLevel /= divideWorryLevel;
                } else {
                    newWorryLevel %= divideWorryLevel;
                }
                int destination = test(newWorryLevel);
                allMonkeys.get(destination).items().addLast(newWorryLevel);
            }
        }

        private long inspect(long worryLevel) {
            inspectedItems.incrementAndGet();
            return operation.operate(worryLevel);
        }

        private int test(long worryLevel) {
            return worryLevel % divisibleByTestValue == 0 ? testTrueDestination : testFalseDestination;
        }


        public static Monkey parseInput(String monkeyString, List<Monkey> monkeys) {
            Scanner scanner = new Scanner(monkeyString);
            scanner.nextLine(); //ignore "Monkey <n>:"

            //parse starting items
            String startingItemsString = scanner.nextLine();
            Deque<Long> startingItems = new ArrayDeque<>(
                    Utils.populateListWithCommaSeparatedLongs(startingItemsString.split(": ")[1])
            );

            //parse operation
            String[] operationStrings =
                    scanner.nextLine().substring("  Operation: new = old ".length()).split(" ");
            Operator operator = switch (operationStrings[0]) {
                case "*" -> Operator.MULTIPLY;
                case "+" -> Operator.ADD;
                default -> throw new IllegalArgumentException();
            };
            OperateOn operateOn = operationStrings[1].equals("old") ? OperateOn.OLD : OperateOn.VALUE;
            long operationValue = 0L;
            if (operateOn == OperateOn.VALUE) {
                operationValue = Long.parseLong(operationStrings[1]);
            }
            Operation operation = new Operation(operateOn, operator, operationValue);

            //parse test
            long divisibleBy = Long.parseLong(scanner.nextLine().substring("  Test: divisible by ".length()));
            int trueDestination =
                    Integer.parseInt(scanner.nextLine().substring("    If true: throw to monkey ".length()));
            int falseDestination =
                    Integer.parseInt(scanner.nextLine().substring("    If false: throw to monkey ".length()));

            return new Monkey(
                    startingItems,
                    operation,
                    divisibleBy,
                    trueDestination,
                    falseDestination,
                    monkeys
            );
        }

        @Override
        public String toString() {
            return "Monkey{" +
                   "items=" + items +
                   ", operation=" + operation +
                   ", divisibleByTestValue=" + divisibleByTestValue +
                   ", testTrueDestination=" + testTrueDestination +
                   ", testFalseDestination=" + testFalseDestination +
                   ", inspectedItems=" + inspectedItems +
                   '}';
        }
    }

    private record Operation(OperateOn operateOn, Operator operator, long value) {

        public long operate(long old) {
            return switch (operateOn) {
                case VALUE -> operate(old, value);
                case OLD -> operate(old, old);
            };
        }

        private long operate(long old, long value) {
            return switch (operator) {
                case ADD -> Math.addExact(old, value);
                case MULTIPLY -> Math.multiplyExact(old, value);
            };
        }

    }

    private enum OperateOn {
        VALUE,
        OLD
    }

    private enum Operator {
        ADD,
        MULTIPLY
    }


}

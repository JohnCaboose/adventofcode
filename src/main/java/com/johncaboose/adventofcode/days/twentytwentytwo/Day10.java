package com.johncaboose.adventofcode.days.twentytwentytwo;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

class Day10 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day10.class);

    private static final String LIT_PIXEL = "#";
    private static final String DARK_PIXEL = ".";

    @Override
    public Long partOneSolver(String input) {
        CPU cpu = new CPU();

        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            cpu.queueOperation(Operation.parseInput(scanner.nextLine()));
        }

        long value = 0;
        for (int i = 1; i <= 220; i++) {
            if (i == 20 || (i - 20) % 40 == 0) {
                value += i * cpu.getX();
            }
            cpu.tick();
        }
        return value;
    }

    @Override
    public Long partTwoSolver(String input) {
        CPU cpu = new CPU();

        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            cpu.queueOperation(Operation.parseInput(scanner.nextLine()));
        }

        for (int i = 1; i <= 240; i++) {
            cpu.tick();
        }

        String solution = cpu.getScreen().toString();
        logger.debug("Screen:\n{}", solution);
        return (long) solution.hashCode();
    }

    private enum Instruction {
        NOOP,
        ADDX
    }

    private record Operation(Instruction instruction, Long value) {
        public static Operation parseInput(String line) {
            if (line.startsWith("noop")) {
                return new Operation(Instruction.NOOP, 0L);
            }

            if (line.startsWith("addx")) {
                return new Operation(Instruction.ADDX, Long.parseLong(line.split(" ")[1]));
            }

            throw new UnsupportedOperationException();
        }
    }

    private static class Screen {

        private List<Boolean> pixels = new ArrayList<>();

        public void drawPixel(long cycle, long spriteStartPosition) {
            // Thanks to ResetEra member Tony B for the manipulation needed to adjust cycle correctly, fixing my bug
            long adjustedCycle = ((cycle - 1) % 40) + 1;
            boolean lit = adjustedCycle >= spriteStartPosition && adjustedCycle <= spriteStartPosition + 2;
            pixels.add(lit);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < pixels.size(); i++) {
                if (i > 0 && i % 40 == 0) {
                    sb.append(System.lineSeparator());
                }
                sb.append(pixels.get(i) ? LIT_PIXEL : DARK_PIXEL);
            }
            return sb.toString();
        }
    }

    private static class CPU {
        private long x = 1;
        private final Deque<Operation> operations = new ArrayDeque<>();

        private Operation runningOperation = null;
        private long runningOperationRemainingCycles = 0;

        private long startedCycles = 0;
        private long finishedCycles = 0;

        private final Screen screen = new Screen();

        public void queueOperation(Operation operation) {
            operations.addLast(operation);
        }

        public void tick() {
            initiateCycle();
            screen.drawPixel(startedCycles, x);
            endCycle();
        }

        private void initiateCycle() {
            startedCycles++;
            if (runningOperation == null) {
                runningOperation = operations.removeFirst();
                runningOperationRemainingCycles = cyclesToFinishOperation(runningOperation);
            }
        }

        private void endCycle() {
            finishedCycles++;
            if (--runningOperationRemainingCycles == 0) {
                finishCurrentOperation();
            }
        }

        private void finishCurrentOperation() {
            Operation operation = runningOperation;
            switch (operation.instruction()) {
                case ADDX -> x += operation.value();
                case NOOP -> {
                }
            }
            runningOperation = null;
            runningOperationRemainingCycles = 0;
        }

        private long cyclesToFinishOperation(Operation operation) {
            return switch (operation.instruction()) {
                case NOOP -> 1L;
                case ADDX -> 2L;
            };
        }

        public long getX() {
            return x;
        }

        public Screen getScreen() {
            return screen;
        }

    }

}

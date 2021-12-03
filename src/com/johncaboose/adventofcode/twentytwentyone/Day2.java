package com.johncaboose.adventofcode.twentytwentyone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2 implements ISolvableDay {
    @Override
    public String solutionPartOne() {
        List<MovementStep> movementSteps = populateList(ProblemInput.DAY_2_INPUT);

        int horizontalPosition = 0;
        int verticalDepth = 0;

        for (MovementStep step : movementSteps) {
            if (step.axis.equals(Axis.HORIZONTAL)) {
                horizontalPosition += step.stepSize;
            } else if (step.axis.equals(Axis.VERTICAL)) {
                //Use - instead of + as it is depth, not altitude that is wanted
                verticalDepth -= step.stepSize;
            }

        }

        int product = horizontalPosition * verticalDepth;

        return String.valueOf(product);
    }

    @Override
    public String solutionPartTwo() {
        List<MovementStep> movementSteps = populateList(ProblemInput.DAY_2_INPUT);

        int horizontalPosition = 0;
        int verticalDepth = 0;
        int aim = 0;

        for (MovementStep step : movementSteps) {
            if (step.axis.equals(Axis.HORIZONTAL)) {
                horizontalPosition += step.stepSize;
                verticalDepth += aim * step.stepSize;
            } else if (step.axis.equals(Axis.VERTICAL)) {
                //change aim
                //Use - instead of + as it is depth, not altitude that is wanted
                aim -= step.stepSize;
            }

        }

        int product = horizontalPosition * verticalDepth;

        return String.valueOf(product);
    }

    private enum Axis {
        VERTICAL,
        HORIZONTAL
    }

    private record MovementStep(Axis axis, int stepSize) {
    }

    private static List<MovementStep> populateList(String input) {
        List<MovementStep> list = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            String direction = scanner.next("[a-z]*");
            int step = scanner.nextInt();
            Axis axis;
            // Find direction
            if (direction.equals("forward")) {
                axis = Axis.HORIZONTAL;
            } else {
                axis = Axis.VERTICAL;
            }

            if (direction.equals("down")) {
                step = -step;
            }
            list.add(new MovementStep(axis, step));
        }
        return list;
    }


}

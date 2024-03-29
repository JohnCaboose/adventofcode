package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Day2 implements ISolvableDay<Long> {

    @Override
    public Long partOneSolver(String input) {
        List<MovementStep> movementSteps = populateList(input);

        long horizontalPosition = 0;
        long verticalDepth = 0;

        for (MovementStep step : movementSteps) {
            if (step.axis.equals(Axis.HORIZONTAL)) {
                horizontalPosition += step.stepSize;
            } else if (step.axis.equals(Axis.VERTICAL)) {
                //Use - instead of + as it is depth, not altitude that is wanted
                verticalDepth -= step.stepSize;
            }

        }

        return horizontalPosition * verticalDepth;
    }

    @Override
    public Long partTwoSolver(String input) {
        List<MovementStep> movementSteps = populateList(input);

        long horizontalPosition = 0;
        long verticalDepth = 0;
        long aim = 0;

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

        return horizontalPosition * verticalDepth;
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

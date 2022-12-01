package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Day24 implements ISolvableDay {

    public static final int AMOUNT_OF_CONSTANTS = 14;

    @Override
    public long partOneSolver(String input) {
        return solve(input, false);
    }

    @Override
    public long partTwoSolver(String input) {
        return solve(input, true);
    }

    private static long solve(String input, boolean findSmallest) {
        List<Integer> constant0List = new ArrayList<>();
        List<Integer> constant1List = new ArrayList<>();
        List<Integer> constant2List = new ArrayList<>();

        readConstantsFromInput(input, constant0List, constant1List, constant2List);

        if (constant0List.size() != AMOUNT_OF_CONSTANTS ||
            constant1List.size() != AMOUNT_OF_CONSTANTS ||
            constant2List.size() != AMOUNT_OF_CONSTANTS) {
            throw new RuntimeException("Wrong amount of constants.");
        }

        long first = findSmallest ? 11111111111111L : 99999999999999L;
        long last = findSmallest ? 99999999999999L : 11111111111111L;
        long iterateStep = findSmallest ? 1 : -1;

        for (long currentNum = first; findSmallest ? currentNum <= last : currentNum >= last; currentNum += iterateStep) {
            String currentAsString = String.valueOf(currentNum);
            if (currentAsString.contains("0")) {
                //Invalid, skip all next known invalid numbers
                int firstZeroIndex = currentAsString.indexOf("0");
                if (findSmallest) {
                    String nextNumberAsString = currentAsString.substring(0, firstZeroIndex);
                    nextNumberAsString += "1".repeat(AMOUNT_OF_CONSTANTS - (firstZeroIndex));
                    currentNum = Long.parseLong(nextNumberAsString) - 1;
                } else {
                    String nextNumberAsString = currentAsString.substring(0, firstZeroIndex + 1);
                    nextNumberAsString += "0".repeat(AMOUNT_OF_CONSTANTS - (firstZeroIndex + 1));
                    currentNum = Long.parseLong(nextNumberAsString);
                }
                continue;
            }

            int z = 0;
            for (int i = 0; i < AMOUNT_OF_CONSTANTS; i++) {
                int digit = Character.getNumericValue(currentAsString.charAt(i));
                int const0 = constant0List.get(i);
                int const1 = constant1List.get(i);
                int const2 = constant2List.get(i);

                int x = neq((z % 26) + const1, digit);

                if (const0 == 26 && x != 0) {
                    // invalid, skip all next known invalid numbers
                    String nextNumberAsString = currentAsString.substring(0, Math.min(i + 1, AMOUNT_OF_CONSTANTS));
                    if (findSmallest) {
                        nextNumberAsString += "9".repeat(AMOUNT_OF_CONSTANTS - (i + 1));
                    } else {
                        nextNumberAsString += "0".repeat(AMOUNT_OF_CONSTANTS - (i + 1));
                    }
                    currentNum = Long.parseLong(nextNumberAsString);
                    break;
                }

                z = ((z / const0) * ((25 * x) + 1)) + ((digit + const2) * x);

            }

            if (z == 0) {
                //Found solution
                return currentNum;
            }


        }

        //Nothing was valid
        return 0L;
    }


    private static void readConstantsFromInput(String input, List<Integer> constant0List, List<Integer> constant1List, List<Integer> constant2List) {
        readConstantsWithPattern(input, constant0List, Pattern.compile("div z ([0-9]+)"));
        readConstantsWithPattern(input, constant1List, Pattern.compile("add x (-?[0-9]+)"));
        readConstantsWithPattern(input, constant2List, Pattern.compile("add y w\nadd y (-?[0-9]+)"));
    }

    private static void readConstantsWithPattern(String input, List<Integer> constantList, Pattern pattern) {
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            constantList.add(Integer.parseInt(matcher.group(1)));
        }
    }


    private static int neq(int a, int b) {
        return a != b ? 1 : 0;
    }

}

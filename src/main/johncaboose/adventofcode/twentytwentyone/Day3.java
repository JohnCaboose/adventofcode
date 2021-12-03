package johncaboose.adventofcode.twentytwentyone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day3 implements ISolvableDay {


    @Override
    public long partOneSolver(String input) {
        List<Long> numbers = Utils.populateListWithLongs(input, 2);
        if (numbers.size() == 0) {
            return 0;
        }

        Map<Integer, Integer> amountOfOnesMinusZeroesPerBitPlacement = new HashMap<>();

        //We don't know the length, but we know they're all the same
        Scanner scanner = new Scanner(input);
        int amountOfBitsInUse = scanner.nextLine().length();

        for (long number : numbers) {
            for (int position = 0; position < amountOfBitsInUse; position++) {
                // Check if least significant bit is set or not
                int alterCurrentValueBy = (number & 1) != 0 ? 1 : -1;

                int currentValue = amountOfOnesMinusZeroesPerBitPlacement.getOrDefault(position, 0);
                amountOfOnesMinusZeroesPerBitPlacement.put(position, currentValue + alterCurrentValueBy);

                // bit-shift right one for next iteration
                number >>>= 1;
            }
            int x = 0; //Remove, only for debugging breakpoint purposes
        }

        long gammaRate = 0;
        long epsilonRate = 0;
        for (int position : amountOfOnesMinusZeroesPerBitPlacement.keySet()) {
            // Problem does not define what to do in the case of == 0, so we do nothing
            if (amountOfOnesMinusZeroesPerBitPlacement.get(position) > 0) {
                gammaRate = gammaRate | (1L << position);
            } else if (amountOfOnesMinusZeroesPerBitPlacement.get(position) < 0) {
                epsilonRate = epsilonRate | (1L << position);
            }
        }

        return epsilonRate * gammaRate;
    }

    @Override
    public long partTwoSolver(String input) {
        return 0;
    }
}

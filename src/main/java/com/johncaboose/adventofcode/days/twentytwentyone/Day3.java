package com.johncaboose.adventofcode.days.twentytwentyone;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Utils;

import java.util.*;

class Day3 implements ISolvableDay<Long> {


    @Override
    public Long partOneSolver(String input) {
        List<Long> numbers = Utils.populateListWithLongs(input, 2);
        if (numbers.size() == 0) {
            return 0L;
        }

        Map<Integer, Integer> amountOfOnesMinusZeroesPerBitPlacement = new HashMap<>();

        int amountOfBitsInUse = getAmountOfBitsInUse(input);

        for (long number : numbers) {
            for (int position = 0; position < amountOfBitsInUse; position++) {
                // Check if least significant bit is set or not
                int alterCurrentValueBy = (number & 1) != 0 ? 1 : -1;

                int currentValue = amountOfOnesMinusZeroesPerBitPlacement.getOrDefault(position, 0);
                amountOfOnesMinusZeroesPerBitPlacement.put(position, currentValue + alterCurrentValueBy);

                // bit-shift right one for next iteration
                number >>>= 1;
            }
        }


        long gammaRate = 0;
        for (int position : amountOfOnesMinusZeroesPerBitPlacement.keySet()) {
            // Problem does not define what to do in the case of == 0, so we do nothing
            if (amountOfOnesMinusZeroesPerBitPlacement.get(position) > 0) {
                gammaRate = gammaRate | (1L << position);
            }
        }

        long bitMask = getBitMask(amountOfBitsInUse);
        long epsilonRate = (~gammaRate) & bitMask;

        return gammaRate * epsilonRate; // power consumption
    }


    @Override
    public Long partTwoSolver(String input) {
        List<Long> numbers = Utils.populateListWithLongs(input, 2);
        if (numbers.size() == 0) {
            return 0L;
        }

        int amountOfBitsInUse = getAmountOfBitsInUse(input);
        //The first position
        int startingPosition = amountOfBitsInUse - 1;
        long oxygenGeneratorRating = findRating(new ArrayList<>(numbers), startingPosition, true, true);
        long co2ScrubberRating = findRating(new ArrayList<>(numbers), startingPosition, false, false);
        return oxygenGeneratorRating * co2ScrubberRating;
    }

    /**
     * Recursive method that finds the rating. The rating depends on a few rules which are customizable. The algorithm
     * looks at the bits at the position for each number and evaluates which candidates should be used and discarded.
     *
     * @param candidates               the list of candidate ratings, which will be whittled down to one.
     * @param position                 the bit position to evaluate
     * @param useMostCommonBit         uses the most common bit if true, uses the least common bit if false
     * @param prioritizeOnesOverZeroes uses the numbers with a One at the position if zero and one occur the same amount
     *                                 of times when true
     * @return the rating found from candidates, or -1 if failed
     */
    private long findRating(List<Long> candidates, int position, boolean useMostCommonBit, boolean prioritizeOnesOverZeroes) {
        if (candidates.size() == 1) {
            //Success
            return candidates.get(0);
        }

        if (candidates.size() == 0) {
            //Failure
            return -1;
        }

        List<Long> numbersWithOnesAtPosition = new ArrayList<>();
        List<Long> numbersWithZeroesAtPosition = new ArrayList<>();
        for (long candidate : candidates) {
            if (((candidate >>> position) & 1L) == 1) {
                numbersWithOnesAtPosition.add(candidate);
            } else {
                numbersWithZeroesAtPosition.add(candidate);
            }
        }

        if (numbersWithOnesAtPosition.size() > numbersWithZeroesAtPosition.size()) {
            candidates = useMostCommonBit ? numbersWithOnesAtPosition : numbersWithZeroesAtPosition;
        } else if (numbersWithZeroesAtPosition.size() > numbersWithOnesAtPosition.size()) {
            candidates = useMostCommonBit ? numbersWithZeroesAtPosition : numbersWithOnesAtPosition;
        } else {
            //Same amount left -> use priority
            candidates = prioritizeOnesOverZeroes ? numbersWithOnesAtPosition : numbersWithZeroesAtPosition;
        }
        // Go one level deeper
        return findRating(candidates, position - 1, useMostCommonBit, prioritizeOnesOverZeroes);
    }

    /**
     * Find the amount of bits in use, assuming problem input only uses numbers of the same length. For example if the
     * inputs first row is "01000" then we know the amount of bits in use is 5.
     *
     * @param input the problem input
     * @return amount of bits in use
     */
    private int getAmountOfBitsInUse(String input) {
        //We don't know the length, but we know they're all the same
        try (Scanner scanner = new Scanner(input)) {

            return scanner.nextLine().length();
        }
    }

    /**
     * Creates a bit mask that can be used to zero unused bits in a long, for example if amountOfBits is 5 then this
     * will return 11111b.
     *
     * @param amountOfBitsInUse amount of ones in the bitmask
     * @return the bitmask
     */
    private long getBitMask(int amountOfBitsInUse) {
        return Long.parseLong("1".repeat(amountOfBitsInUse), 2);
    }
}

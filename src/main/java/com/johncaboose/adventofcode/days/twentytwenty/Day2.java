package com.johncaboose.adventofcode.days.twentytwenty;

import com.johncaboose.adventofcode.shared.ISolvableDay;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

class Day2 implements ISolvableDay<Long> {
    @Override
    public Long partOneSolver(String input) {
        return solve(input, false);
    }

    @Override
    public Long partTwoSolver(String input) {
        return solve(input, true);
    }

    private long solve(String input, boolean partTwo) {
        AtomicLong validPasswords = new AtomicLong(0);
        Collection<String> lines = List.of(input.split(System.lineSeparator()));

        lines.forEach(line -> {
            if (passwordValid(line, partTwo)) {
                validPasswords.incrementAndGet();
            }
        });

        return validPasswords.get();
    }

    private boolean passwordValid(String line, boolean partTwo) {
        int spaceIndex = line.indexOf(' ');
        String[] limitString = line.substring(0, spaceIndex).split("-");
        int lowerBound = Integer.parseInt(limitString[0]);
        int upperBound = Integer.parseInt(limitString[1]);

        String characterToFind = line.substring(spaceIndex + 1, spaceIndex + 2);
        String password = line.substring(spaceIndex + 4);

        if (partTwo) {
            lowerBound--;
            upperBound--;

            boolean firstEquals = characterToFind.equals(password.substring(lowerBound, lowerBound + 1));
            boolean secondEquals = characterToFind.equals(password.substring(upperBound, upperBound + 1));
            return firstEquals != secondEquals;

        } else {
            int characterAmountInPassword = password.length() - password.replaceAll(characterToFind, "").length();

            return characterAmountInPassword >= lowerBound && characterAmountInPassword <= upperBound;

        }
    }


}

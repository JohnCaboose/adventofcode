package com.johncaboose.adventofcode.days.twentytwenty;

import com.johncaboose.adventofcode.shared.ISolvableDay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

class Day4 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day4.class);

    @Override
    public Long partOneSolver(String input) {
        List<Passport> passports = parseInput(input);
        return passports.stream()
                .filter(Passport::isValid)
                .count();
    }

    @Override
    public Long partTwoSolver(String input) {
        return null;
    }

    private static List<Passport> parseInput(String input) {
        Scanner scanner = new Scanner(input);
        List<Passport> passports = new ArrayList<>();

        Map<PassportField, String> currentPassport = new EnumMap<>(PassportField.class);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isBlank()) {
                //end of passport
                passports.add(new Passport(currentPassport));
                currentPassport = new EnumMap<>(PassportField.class);
                continue;
            }

            String[] splitLine = line.split(" ");

            for (String keyValue : splitLine) {
                String[] keyAndValue = keyValue.split(":");
                String key = keyAndValue[0];
                String value = keyAndValue[1];
                currentPassport.put(PassportField.of(key), value);
            }

        }

        //end of passport
        passports.add(new Passport(currentPassport));

        return passports;
    }


    private enum PassportField {
        BIRTH_YEAR("byr"),
        ISSUE_YEAR("iyr"),
        EXPIRATION_YEAR("eyr"),
        HEIGHT("hgt"),
        HAIR_COLOR("hcl"),
        EYE_COLOR("ecl"),
        PASSPORT_ID("pid"),
        COUNTRY_ID("cid");

        private final String tag;

        PassportField(String tag) {
            this.tag = tag;
        }

        public static PassportField of(String tag) {
            for (var field : PassportField.values()) {
                if (field.tag.equals(tag)) {
                    return field;
                }
            }
            throw new IllegalArgumentException();
        }

    }

    private record Passport(Map<PassportField, String> passportFields) {

        private static final Set<PassportField> REQUIRED_FIELDS = Set.of(
                PassportField.BIRTH_YEAR,
                PassportField.ISSUE_YEAR,
                PassportField.EXPIRATION_YEAR,
                PassportField.HEIGHT,
                PassportField.HAIR_COLOR,
                PassportField.EYE_COLOR,
                PassportField.PASSPORT_ID
        );

        public boolean isValid() {
            return passportFields.keySet().containsAll(REQUIRED_FIELDS);
        }

        @Override
        public String toString() {
            return "Passport{" +
                    "valid=" + isValid() +
                    ", passportFields=" + passportFields +
                    '}';
        }
    }
}

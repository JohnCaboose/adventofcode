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
                .filter(Passport::containsRequiredFields)
                .count();
    }

    @Override
    public Long partTwoSolver(String input) {
        List<Passport> passports = parseInput(input);
        return passports.stream()
                .filter(Passport::containsRequiredFields)
                .filter(Passport::fieldsContainValidData)
                .count();
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

        private static final Set<String> VALID_EYE_COLORS = Set.of(
                "amb", "blu", "brn", "gry", "grn", "hzl", "oth"
        );
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

        public boolean validData(String data) {
            try {

                switch (this) {
                    case BIRTH_YEAR -> {
                        int parsed = Integer.parseInt(data);
                        return parsed >= 1920 && parsed <= 2002;
                    }
                    case ISSUE_YEAR -> {
                        int parsed = Integer.parseInt(data);
                        return parsed >= 2010 && parsed <= 2020;
                    }
                    case EXPIRATION_YEAR -> {
                        int parsed = Integer.parseInt(data);
                        return parsed >= 2020 && parsed <= 2030;
                    }
                    case HEIGHT -> {
                        if (data.contains("cm")) {
                            var parsed = Integer.parseInt(data.split("cm")[0]);
                            return parsed >= 150 && parsed <= 193;
                        }

                        if (data.contains("in")) {
                            var parsed = Integer.parseInt(data.split("in")[0]);
                            return parsed >= 59 && parsed <= 76;
                        }

                        return false;
                    }
                    case HAIR_COLOR -> {
                        return data.matches("#[0-9a-f]{6}");
                    }
                    case EYE_COLOR -> {
                        return VALID_EYE_COLORS.contains(data);
                    }
                    case PASSPORT_ID -> {
                        Integer.parseInt(data);
                        return data.length() == 9;
                    }
                    case COUNTRY_ID -> {
                        return true;
                    }
                }
            } catch (RuntimeException e) {
                logger.trace("Caught exception when checking data validity, Field: {}, Data: {}", this, data, e);
            }
            return false;
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

        public boolean containsRequiredFields() {
            return passportFields.keySet().containsAll(REQUIRED_FIELDS);
        }

        public boolean fieldsContainValidData() {
            return passportFields.entrySet().stream()
                    .allMatch(entry -> entry.getKey().validData(entry.getValue()));
        }

        @Override
        public String toString() {
            return "Passport{" +
                    "passportFields=" + passportFields +
                    '}';
        }
    }
}

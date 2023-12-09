package com.johncaboose.adventofcode.days.twentytwentythree;

import com.johncaboose.adventofcode.exceptions.ParseException;
import com.johncaboose.adventofcode.exceptions.SolutionNotFoundException;
import com.johncaboose.adventofcode.shared.ISolvableDay;
import com.johncaboose.adventofcode.shared.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

class Day5 implements ISolvableDay<Long> {

    private static final Logger logger = LogManager.getLogger(Day5.class);

    @Override
    public Long partOneSolver(String input) {
        List<Long> seeds = parseSeeds(input);
        Almanac almanac = parseAlmanac(input);

        return seeds.stream()
                .mapToLong(almanac::seedToLocation)
                .min()
                .orElseThrow(SolutionNotFoundException::new);
    }

    @Override
    public Long partTwoSolver(String input) {
        //TODO this takes way too long (6 minutes) and needs to be optimized
        List<LongStream> seedRanges = parseSeedRanges(input);
        Almanac almanac = parseAlmanac(input);
        long smallestFound = Long.MAX_VALUE;
        for (LongStream stream : seedRanges) {
            long found = stream.map(almanac::seedToLocation)
                    .min()
                    .orElseThrow(SolutionNotFoundException::new);
            logger.info("Smallest found in current range: {}", found);
            if (found < smallestFound) {
                smallestFound = found;
            }
        }

        if (smallestFound == Long.MAX_VALUE) {
            throw new SolutionNotFoundException();
        }

        return smallestFound;
    }

    private record Almanac(
            AlmanacMap seedToSoil,
            AlmanacMap soilToFertilizer,
            AlmanacMap fertilizerToWater,
            AlmanacMap waterToLight,
            AlmanacMap lightToTemperature,
            AlmanacMap temperatureToHumidity,
            AlmanacMap humidityToLocation
    ) {

        public Long seedToLocation(Long seed) {
            long soil = seedToSoil.correspondsTo(seed);
            long fertilizer = soilToFertilizer.correspondsTo(soil);
            long water = fertilizerToWater.correspondsTo(fertilizer);
            long light = waterToLight.correspondsTo(water);
            long temperature = lightToTemperature.correspondsTo(light);
            long humidity = temperatureToHumidity.correspondsTo(temperature);
            long location = humidityToLocation.correspondsTo(humidity);

            logger.trace("Seed {}, soil {}, fertilizer {}, water {}, light {}, temperature {}, humidity {}, location {}.", seed, soil, fertilizer, water, light, temperature, humidity, location);

            return location;
        }

    }

    private record AlmanacMap(List<AlmanacMapEntry> entries) {

        public long correspondsTo(long number) {
            for (AlmanacMapEntry entry : entries) {
                if (entry.inRange(number)) {
                    return entry.correspondsTo(number);
                }
            }
            return number;
        }

    }

    private record AlmanacMapEntry(long destination, long source, long range) {

        public boolean inRange(long number) {
            return number >= source &&
                    number <= source + range - 1; //-1 as the first one is source itself
        }

        public long correspondsTo(long number) {
            if (!inRange(number)) {
                throw new IllegalArgumentException("Must be in range!!");
            }
            return destination + (number - source);
        }

    }

    private static List<Long> parseSeeds(String input) {
        Scanner scanner = new Scanner(input);
        String line = scanner.nextLine();
        String numbers = line.substring("seeds: ".length() - 1);
        return Utils.populateListWithLongs(numbers);
    }

    private static List<LongStream> parseSeedRanges(String input) {
        List<Long> numbers = parseSeeds(input);
        List<LongStream> seedRanges = new ArrayList<>();

        if (numbers.size() % 2 != 0) {
            throw new ParseException("uneven amount of seed numbers");
        }

        for (int i = 0; i < numbers.size(); i = i + 2) {
            long start = numbers.get(i);
            long count = numbers.get(i + 1);
            LongStream seedRange = LongStream.range(start, start + count);
            seedRanges.add(seedRange);
        }

        return seedRanges;
    }

    private static Almanac parseAlmanac(String input) {
        Scanner scanner = new Scanner(input);

        scanner.nextLine(); //seeds
        scanner.nextLine(); //empty line
        List<AlmanacMap> maps = new ArrayList<>();
        while (scanner.hasNextLine()) {
            AlmanacMap map = parseMap(scanner);
            maps.add(map);
        }

        if (maps.size() != 7) {
            throw new ParseException("Wrong amount of maps");
        }

        return new Almanac(
                maps.get(0),
                maps.get(1),
                maps.get(2),
                maps.get(3),
                maps.get(4),
                maps.get(5),
                maps.get(6)
        );
    }

    private static AlmanacMap parseMap(Scanner scanner) {
        scanner.nextLine(); // map name
        List<AlmanacMapEntry> entries = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String entryLine = scanner.nextLine();
            if (entryLine.isBlank()) {
                //map is over
                break;
            }

            AlmanacMapEntry entry = parseEntry(entryLine);
            entries.add(entry);
        }
        return new AlmanacMap(entries);
    }

    private static AlmanacMapEntry parseEntry(String entryLine) {
        List<Long> longs = Utils.populateListWithLongs(entryLine);
        if (longs.size() != 3) {
            throw new ParseException("Wrong amount of numbers in map entry");
        }
        return new AlmanacMapEntry(longs.get(0), longs.get(1), longs.get(2));
    }
}

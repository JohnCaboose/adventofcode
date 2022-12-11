package com.johncaboose.adventofcode.shared;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Utils {

    public static List<Long> populateListWithLongs(String input) {
        return populateListWithLongs(input, 10);
    }

    public static List<Long> populateListWithLongs(String input, int radix) {
        List<Long> list = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLong()) {
            list.add(scanner.nextLong(radix));
        }
        return list;
    }

    public static List<Long> populateListWithCommaSeparatedLongs(String input) {
        return populateListWithCommaSeparatedLongs(input, 10);
    }

    public static List<Long> populateListWithCommaSeparatedLongs(String input, int radix) {
        List<Long> list = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter("\\s?,\\s?");
        while (scanner.hasNextLong()) {
            list.add(scanner.nextLong(radix));
        }
        return list;
    }


    public static <T> List<T> reversedShallowCopy(List<T> list) {
        var copy = new ArrayList<>(list);
        Collections.reverse(copy);
        return copy;
    }

    public static <T> List<T> concatLists(List<T> first, List<T> second) {
        return Stream.concat(first.stream(), second.stream()).toList();
    }
}

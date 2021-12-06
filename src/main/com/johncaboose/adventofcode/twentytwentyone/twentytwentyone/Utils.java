package com.johncaboose.adventofcode.twentytwentyone.twentytwentyone;

import java.util.*;

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
        scanner.useDelimiter(",");
        while (scanner.hasNextLong()) {
            list.add(scanner.nextLong(radix));
        }
        return list;
    }


    public interface ExtendedMap<K, V> extends Map<K, V> {

        /**
         * Same as {@link #getOrDefault(Object, Object)} except the default value is also stored in the underlying Map.
         *
         * @param key
         * @param defaultValue
         * @return
         */
        default V getOrStoreDefault(Object key, V defaultValue) {
            V returnValue = Map.super.getOrDefault(key, defaultValue);
            if (get(key) == null) {
                this.put((K) key, returnValue);
            }
            return returnValue;
        }
    }

    public static class ExtendedHashMap<K, V> extends HashMap<K, V> implements ExtendedMap<K, V> {

    }
}

package com.johncaboose.adventofcode.shared;

import java.util.Map;

public interface ExtendedMap<K, V> extends Map<K, V> {

    /**
     * Same as {@link #getOrDefault(Object, Object)} except the default value is also stored in the underlying Map.
     *
     * @param key
     * @param defaultValue
     * @return
     */
    default V getOrStoreDefault(K key, V defaultValue) {
        V returnValue = Map.super.getOrDefault(key, defaultValue);
        if (get(key) == null) {
            this.put(key, returnValue);
        }
        return returnValue;
    }
}
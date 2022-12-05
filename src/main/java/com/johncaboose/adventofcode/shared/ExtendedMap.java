package com.johncaboose.adventofcode.shared;

import java.util.Map;
import java.util.function.Supplier;

public interface ExtendedMap<K, V> extends Map<K, V> {

    /**
     * Same as {@link #getOrDefault(Object, Object)} except the default value is also stored in the underlying Map.
     *
     * @param key          the key whose associated value is to be returned
     * @param defaultValue the default mapping of the key
     * @return the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the
     * key.
     */
    default V getOrStoreDefault(K key, V defaultValue) {
        V returnValue = Map.super.getOrDefault(key, defaultValue);
        if (get(key) == null) {
            this.put(key, returnValue);
        }
        return returnValue;
    }

    /**
     * Same as {@link #getOrDefault(Object, Object)} except the supplier-provided value is also stored in the underlying
     * Map.
     *
     * @param key      the key whose associated value is to be returned
     * @param supplier a supplier for the default value, for example String::new
     * @return the value to which the specified key is mapped, or the value from {@link Supplier#get()} if this map
     * contains no mapping for the key.
     */
    default V getOrStoreDefault(K key, Supplier<V> supplier) {
        V currentValue = get(key);
        return currentValue != null ? currentValue : getOrStoreDefault(key, supplier.get());
    }
}
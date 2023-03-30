/*
 * Copyright (c) 2017 Ian Clement.  All rights reserved.
 */

package collections.map;

/**
 * Stores a key-value entry in the map.
 */
public class Entry<K, V> {

    private K key;
    private V value;

    /**
     * Create an entry with a key only.
     * @param key
     */
    public Entry(K key) {
        this.key = key;
    }

    /**
     * Create an entry with a key and value.
     * @param key
     * @param value
     */
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Get key.
     * @return
     */
    public K getKey() {
        return key;
    }

    /**
     * Get value.
     * @return
     */
    public V getValue() {
        return value;
    }

    /**
     * Set value.
     * @param value
     */
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s => %s", key, value);
    }
}

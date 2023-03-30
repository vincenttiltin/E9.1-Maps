package collections.set;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * A simple, but inefficient, (partial) implementation of the set.
 * Use TreeSet or HashSet in real applications.
 * @param <T>
 */
public class SimpleSet<T> implements Set<T> {

    private T[] elements;
    private int size;
    private int cursor;

    public SimpleSet(int capacity) {
        elements = (T[]) new Object[capacity];
        size = 0;
    }

    public SimpleSet(T[] elements) {
        this.elements = Arrays.copyOf(elements, elements.length);  // TODO: check duplicates.
        size = elements.length;
    }

    @Override
    public boolean contains(T elem) {
        for (int i = 0; i < size; i++)
            if(elements[i].equals(elem))
                return true;
        return false;
    }

    @Override
    public boolean containsAll(Set<T> rhs) {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public boolean add(T elem) {
        if(isFull())
            throw new FullSetException();
        if(contains(elem))
            return false;
        elements[size++] = elem;
        return true;
    }

    @Override
    public boolean remove(T elem) {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == elements.length;
    }

    @Override
    public void reset() {
        cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < size;
    }

    @Override
    public T next() {
        return elements[cursor++];
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < size; i++)
            joiner.add(elements[i].toString());
        return "{" + joiner.toString() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Set<T> rhs = (Set<T>) o;

        if(rhs.size() != this.size)
            return false;

        for (int i = 0; i < size; i++) {
            if(!rhs.contains(elements[i]))
                return false;
        }
        return true;
    }

    public int getCapacity() {
        return elements.length;
    }
}

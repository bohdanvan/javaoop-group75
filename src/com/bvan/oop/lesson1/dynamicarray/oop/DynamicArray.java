package com.bvan.oop.lesson1.dynamicarray.oop;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    // fields, properties (data)
    int size = 0;
    int[] elems = new int[4];

    // interface +

    public void addLast(int n) {
        // implementation
        if (size == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        // implementation
        return Arrays.toString(Arrays.copyOf(elems, size));
    }
}

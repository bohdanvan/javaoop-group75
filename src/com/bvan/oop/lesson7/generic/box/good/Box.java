package com.bvan.oop.lesson7.generic.box.good;

import com.bvan.oop.lesson5.format.oop.Formatter;
import com.bvan.oop.lesson7.generic.box.Cat;

/**
 * @author bvanchuhov
 */
public class Box<T> {

    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}

package com.bvan.oop.lesson7.generic.formatter;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public interface Formatter<T> {

    String format(T value);
}

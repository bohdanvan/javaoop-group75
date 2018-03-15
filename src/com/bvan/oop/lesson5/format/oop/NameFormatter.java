package com.bvan.oop.lesson5.format.oop;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public class NameFormatter implements Formatter {
    @Override
    public String format(Product product) {
        return product.getName();
    }
}

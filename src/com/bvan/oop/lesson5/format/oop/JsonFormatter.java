package com.bvan.oop.lesson5.format.oop;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public class JsonFormatter implements Formatter {
    @Override
    public String format(Product product) {
        return "{\"name\": \"" + product.getName() + "\", \"price\": " + product.getPrice() + "}";
    }
}

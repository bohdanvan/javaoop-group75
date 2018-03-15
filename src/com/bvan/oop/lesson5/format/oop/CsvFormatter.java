package com.bvan.oop.lesson5.format.oop;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public class CsvFormatter implements Formatter {

    private final String delimiter;

    public CsvFormatter() {
        this(",");
    }

    public CsvFormatter(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String format(Product product) {
        return product.getName() + delimiter + product.getPrice();
    }
}

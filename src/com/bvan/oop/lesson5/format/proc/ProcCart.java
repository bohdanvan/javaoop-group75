package com.bvan.oop.lesson5.format.proc;

import com.bvan.oop.lesson5.format.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProcCart {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(String formatType) {
        for (Product product : products) {
            String s = format(product, formatType);
            System.out.println(s);
        }
    }

    private String format(Product product, String formatType) {
        switch (formatType) {
            case "name":
                return product.getName();
            case "csv":
                return product.getName() + "," + product.getPrice();
            case "json":
                return "{\"name\": \"" + product.getName() + "\", \"price\": " + product.getPrice() + "}";
            default:
                throw new IllegalArgumentException("illegal format: " + formatType);
        }
    }
}

package com.bvan.oop.lesson5.format.oop;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public class PriceFormatter implements Formatter {
    @Override
    public String format(Product product) {
        long price = product.getPrice();
        return String.valueOf(price);
    }
}

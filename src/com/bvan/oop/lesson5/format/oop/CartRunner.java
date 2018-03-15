package com.bvan.oop.lesson5.format.oop;

import com.bvan.oop.lesson5.format.Product;

/**
 * @author bvanchuhov
 */
public class CartRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("MacBook", 2000));
        cart.add(new Product("Lenovo", 1500));
        cart.add(new Product("Asus", 1700));

//        cart.print(new PriceFormatter());
//        System.out.println();

        cart.print(new CsvFormatter());
        System.out.println();

        cart.print(new NameFormatter());
        System.out.println();

        Formatter formatter = toStringFormatter();
        cart.print(formatter);
    }

    public static Formatter jsonFormatter() {
        return new JsonFormatter();
    }

    public static Formatter toStringFormatter() {
        // anonymous class
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.toString();
            }
        };
    }
}

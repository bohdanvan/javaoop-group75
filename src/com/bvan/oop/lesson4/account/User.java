package com.bvan.oop.lesson4.account;

/**
 * @author bvanchuhov
 */
public class User {

    private final String name;
    private final Account account;

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public boolean payForProduct(Product product) {
        return account.withdraw(product.getPrice());
    }
}

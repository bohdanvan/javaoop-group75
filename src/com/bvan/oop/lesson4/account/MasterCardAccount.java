package com.bvan.oop.lesson4.account;

/**
 * @author bvanchuhov
 */
public class MasterCardAccount implements Account {

    private final String credentials;

    public MasterCardAccount(String credentials) {
        this.credentials = credentials;
    }

    @Override
    public boolean withdraw(long money) {
        System.out.println("Visa withdraw");
        return true;
    }

    @Override
    public boolean debit(long money) {
        System.out.println("Visa debit");
        return true;
    }
}

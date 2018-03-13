package com.bvan.oop.lesson4.account;

/**
 * @author bvanchuhov
 */
public interface Account {
    boolean withdraw(long money); // public by default
    boolean debit(long money);
}

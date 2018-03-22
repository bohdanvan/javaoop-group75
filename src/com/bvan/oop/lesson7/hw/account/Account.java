package com.bvan.oop.lesson7.hw.account;

import com.bvan.oop.lesson7.hw.account.exception.AccountException;

/**
 * @author bvanchuhov
 */
public interface Account {

    void withdraw(long money) throws AccountException;
}

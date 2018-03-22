package com.bvan.oop.lesson7.hw.account;

import com.bvan.oop.lesson7.hw.account.exception.AccountException;
import com.bvan.oop.lesson7.hw.account.exception.NotEnoughFundsException;

/**
 * @author bvanchuhov
 */
public class FakeAccount implements Account {

    private long money;

    public FakeAccount(long money) {
        this.money = money;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        if (this.money > money) {
            this.money -= money;
        } else {
            throw new NotEnoughFundsException(money);
        }
    }
}

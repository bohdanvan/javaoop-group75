package com.bvan.oop.lesson7.hw.account;

import com.bvan.oop.lesson7.hw.account.exception.AccountConnectionException;
import com.bvan.oop.lesson7.hw.account.exception.AccountException;

/**
 * @author bvanchuhov
 */
public class RetryConnectionAccount implements Account {

    private final Account account;

    public RetryConnectionAccount(Account account) {
        this.account = account;
    }

    @Override
    public void withdraw(long money) throws AccountException {
        try {
            account.withdraw(money);
        } catch (AccountConnectionException e) {
            try {
                account.withdraw(money);
            } catch (AccountConnectionException e2) {
                account.withdraw(money);
            }
        }
    }
}

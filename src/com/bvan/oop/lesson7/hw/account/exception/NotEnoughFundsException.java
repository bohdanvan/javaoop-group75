package com.bvan.oop.lesson7.hw.account.exception;

/**
 * @author bvanchuhov
 */
public class NotEnoughFundsException extends AccountException {

    public NotEnoughFundsException(long money) {
        super("Not enough funds: " + money);
    }
}

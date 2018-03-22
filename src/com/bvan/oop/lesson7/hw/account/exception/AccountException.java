package com.bvan.oop.lesson7.hw.account.exception;

/**
 * @author bvanchuhov
 */
public class AccountException extends Exception {

    public AccountException(String message) {
        super(message);
    }

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }
}

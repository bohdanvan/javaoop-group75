package com.bvan.oop.lesson7.hw.account.exception;

/**
 * @author bvanchuhov
 */
public class AccountConnectionException extends AccountException {
    public AccountConnectionException(String message) {
        super(message);
    }

    public AccountConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}

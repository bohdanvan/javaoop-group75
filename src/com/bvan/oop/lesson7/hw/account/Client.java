package com.bvan.oop.lesson7.hw.account;

import com.bvan.oop.lesson7.hw.account.exception.AccountConnectionException;
import com.bvan.oop.lesson7.hw.account.exception.AccountException;
import com.bvan.oop.lesson7.hw.account.exception.NotEnoughFundsException;

/**
 * @author bvanchuhov
 */
public class Client {

    public static void main(String[] args) {
        Account account = new FakeAccount(10000);

        try {
            account.withdraw(2000);
        } catch (NotEnoughFundsException e) {
            // no money
        } catch (AccountConnectionException e) {
            // no connection
        } catch (AccountException e) {
            // other exceptions
        }
    }
}

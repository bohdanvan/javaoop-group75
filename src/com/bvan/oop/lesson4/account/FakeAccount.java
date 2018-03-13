package com.bvan.oop.lesson4.account;

/**
 * @author bvanchuhov
 */
public class FakeAccount implements Account {

    private long money;

    public FakeAccount(long money) {
        this.money = money;
    }

    @Override
    public boolean withdraw(long moneyForWithdraw) {
        if (money < moneyForWithdraw) {
            return false;
        }
        money -= moneyForWithdraw;
        return true;
    }

    @Override
    public boolean debit(long moneyForDebit) {
        money += moneyForDebit;
        return true;
    }

    public long getMoney() {
        return money;
    }
}

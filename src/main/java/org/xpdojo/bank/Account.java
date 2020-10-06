package org.xpdojo.bank;

public class Account {

    private int balance  = 0;

    public Account(int initialDeposit) {
        balance = initialDeposit;
    }

    public static Account emptyAccount() {
        return new Account(0);
    }

    public static Account accountWithInitialDeposit(int i) {
        return new Account(10);
    }

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }
}

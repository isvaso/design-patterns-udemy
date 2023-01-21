package com.isvaso.nullobject.nullobject;

public class BankAccount {

    private Log log;
    private int balance;

    public BankAccount(Log log) {
        this.log = log;
    }

    public void deposit(int amount) {
        balance += amount;

        log.info("Depositet " + amount);
    }
}

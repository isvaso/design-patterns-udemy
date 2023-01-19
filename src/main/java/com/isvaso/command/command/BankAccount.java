package com.isvaso.command.command;

public class BankAccount {

    private int balance;
    private int overdraftLimit = -500;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", balance is now " + balance);
    }

    public void withdraw(int amount) {
        if (balance - amount >= overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", balance is now " + balance);
        } else {
            System.out.println("Can't withdraw "
                    + amount + ", insufficient funds on balance " + balance);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}

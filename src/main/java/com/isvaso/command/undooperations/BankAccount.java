package com.isvaso.command.undooperations;

public class BankAccount {

    private int balance;
    private int overdraftLimit = -500;

    public boolean deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", balance is now " + balance);
        return true;
    }

    public boolean withdraw(int amount) {
        if (balance - amount >= overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", balance is now " + balance);
            return true;
        } else {
            System.out.println("Can't withdraw "
                    + amount + ", insufficient funds on balance " + balance);
            return false;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}

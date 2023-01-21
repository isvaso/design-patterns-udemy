package com.isvaso.memento.memento;

public class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public Memento saveState() {
        return new Memento(balance);
    }

    public Memento deposit(int amount) {
        balance += amount;
        return saveState();
    }

    public void restore(Memento m) {
        balance = m.balance;
    }

    @Override
    public String toString() {
        return "BankAccaount{" +
                "balance=" + balance +
                '}';
    }
}

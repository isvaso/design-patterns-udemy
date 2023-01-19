package com.isvaso.command.commandcodingexercise;

class Command
{
    enum Action
    {
        DEPOSIT, WITHDRAW
    }

    public Action action;
    public int amount;
    public boolean success;

    public Command(Action action, int amount)
    {
        this.action = action;
        this.amount = amount;
    }
}

class Account
{
    public int balance;
    public int overdraftLimit = 0;

    public void process(Command c)
    {
        switch (c.action) {
            case DEPOSIT:
                c.success = deposit(c.amount);
                break;
            case WITHDRAW:
                c.success = withdraw(c.amount);
                break;
        }
    }

    public boolean deposit(int amount) {
        balance += amount;
        return true;
    }

    public boolean withdraw(int amount) {
        if (balance - amount >= overdraftLimit) {
            balance -= amount;
            return true;
        } else
            return false;
    }
}

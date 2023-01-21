package com.isvaso.nullobject.nullobject;

public class Main {

    public static void main(String[] args) {
        // Use NullLog if you don't want any behavior of Log
        Log log = new NullLog();
        BankAccount account1 = new BankAccount(log);

        ConsoleLog consoleLog = new ConsoleLog();
        BankAccount account2 = new BankAccount(consoleLog);

        account1.deposit(100);
        account2.deposit(100);
    }
}

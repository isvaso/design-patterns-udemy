package com.isvaso.memento.memento;


public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);

        Memento m1 = bankAccount.saveState();
        Memento m2 = bankAccount.deposit(50);
        Memento m3 = bankAccount.deposit(25);

        System.out.println(bankAccount + System.lineSeparator());

        // restore to m1
        bankAccount.restore(m1);
        System.out.println(bankAccount);

        //restore to m3
        bankAccount.restore(m3);
        System.out.println(bankAccount);

        // restore to m2
        bankAccount.restore(m2);
        System.out.println(bankAccount);
    }
}

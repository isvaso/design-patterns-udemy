package com.isvaso.command.command;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba + System.lineSeparator());

        List<BankAccountCommand> commands = List.of(
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1000),
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 222),
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 666),
                new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1),
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 777)
        );

        commands.forEach(n -> {
                        n.call();
                        System.out.println(ba + System.lineSeparator());
                        sleep(1111);
                });
    }

    private static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

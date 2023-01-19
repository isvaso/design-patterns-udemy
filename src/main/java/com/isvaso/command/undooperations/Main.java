package com.isvaso.command.undooperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba + System.lineSeparator());

        List<BankAccountCommand> commands = new ArrayList<>(List.of(
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1000),
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 222),
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 666),
                new BankAccountCommand(ba, BankAccountCommand.Action.WITHDRAW, 1),
                new BankAccountCommand(ba, BankAccountCommand.Action.DEPOSIT, 777)
        ));
        commands.forEach(n -> {
                        n.call();
                        System.out.println(ba + System.lineSeparator());
                        sleep(600);
                });

        Collections.reverse(commands);
        commands.forEach(n -> {
            n.undo();
            System.out.println(ba + System.lineSeparator());
            sleep(200);
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

package com.isvaso.chainofresponsibility.methodchainmy;

import java.util.List;
import java.util.Random;

public class BattleOfTwo {

    public boolean battle(Character ch1, Character ch2) {
        Random random = new Random();

        System.out.println(ch1.name + " attacks!");
        System.out.println(
                ch1.name + " attacks with power:" + ch1.power
                + System.lineSeparator()
                + ch2.name + " defence:" + ch2.defence
                + System.lineSeparator());

        if (ch1.power >= ch2.defence) {
            System.out.println(ch2.name + " is dead.");
            return false;
        }

        System.out.println(
                ch2.name + " attacks with power:" + ch2.power
                        + System.lineSeparator()
                        + ch1.name + " defence:" + ch1.defence
                        + System.lineSeparator());

        if (ch2.power >= ch1.defence) {
            System.out.println(ch1.name + " is dead.");
            return true;
        }

        return false;
    }
}

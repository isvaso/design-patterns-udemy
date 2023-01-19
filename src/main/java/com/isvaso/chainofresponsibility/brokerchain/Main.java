package com.isvaso.chainofresponsibility.brokerchain;

/**
 * Modifiers works when those creates through "new"
 * and cancels when "AutoClose" try (AutoCloseable) {} runs.
 */

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Creature goblin = new Creature(game, "Strong Goblin", 2, 2);

        System.out.println(goblin);

        IncreaseDefenceModifier icm = new IncreaseDefenceModifier(game, goblin);

        System.out.println(goblin);

        DoubleAttackModifier dam = new DoubleAttackModifier(game, goblin);



        System.out.println(goblin);
        System.out.println(goblin);
        System.out.println(goblin);
        System.out.println(goblin);
    }
}

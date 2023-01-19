package com.isvaso.chainofresponsibility.methodchainmy;

public class Main {

    public static void main(String[] args) {
        Character human = new Character("Human", 2, 2);
        Character orc = new Character("Orc", 8, 5);
        Character frog = new Character("Frog", 1, 1);
        BattleOfTwo battle = new BattleOfTwo();
        CharacterModifier chmHuman = new CharacterModifier(human);
        CharacterModifier chmOrc = new CharacterModifier(orc);

        // Imagine gameplay history
        System.out.format("Two heroes begins for a game:"
                + System.lineSeparator()
                + "1. %s"
                + System.lineSeparator()
                + "2. %s"
                + System.lineSeparator()
                + System.lineSeparator()
                ,human , orc);
        sleep(2000);

        System.out.println("Human goes to the Black Forest."
                + System.lineSeparator());

        sleep(1000);

        if (battle.battle(frog, human)) {
            chmHuman.add(new IncreaseAttackModifier(human));
            chmHuman.add(new IncreaseDefenceModifier(human));
            chmHuman.handle();
        }

        System.out.println("Orc goes to the Black Forest."
                + System.lineSeparator());

        sleep(1500);

        if (battle.battle(human, orc)) {
            chmOrc.add(new IncreaseAttackModifier(orc));
            chmOrc.add(new IncreaseDefenceModifier(orc));
            chmOrc.handle();
        }
    }

    private static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

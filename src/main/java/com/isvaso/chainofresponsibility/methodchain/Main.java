package com.isvaso.chainofresponsibility.methodchain;

public class Main {

    public static void main(String[] args) {
        Creature goblin = new Creature("Goblin", 2, 2);
        System.out.println(goblin + System.lineSeparator());

        CreatureModifier root = new CreatureModifier(goblin);

        // Let's double Goblin's attack
        root.add(new DoubleAttackModifier(goblin));

        // Let's no bonuses, and other modifiers don't work now
        root.add(new NoBonusesModifier(goblin));

        // Let's increase Goblin's defence
        root.add(new IncreaseDefenceModifier(goblin));

        root.handle();
        System.out.println(System.lineSeparator() + goblin);
    }
}

package com.isvaso.chainofresponsibility.methodchain;

public class IncreaseDefenceModifier extends CreatureModifier {

    public IncreaseDefenceModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle() {
        System.out.println("Increasing " + creature.name + "'s defence");
        creature.defence += 3;
        super.handle();
    }
}

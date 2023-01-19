package com.isvaso.chainofresponsibility.methodchainmy;

public class IncreaseAttackModifier extends CharacterModifier {

    public IncreaseAttackModifier(Character character) {
        super(character);
    }

    @Override
    public void handle() {
        System.out.println(character.name + ": Increase Attack!");
        character.power++;
        super.handle();
    }
}

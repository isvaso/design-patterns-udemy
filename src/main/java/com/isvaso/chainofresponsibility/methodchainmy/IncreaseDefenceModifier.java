package com.isvaso.chainofresponsibility.methodchainmy;

public class IncreaseDefenceModifier extends CharacterModifier {

    public IncreaseDefenceModifier(Character character) {
        super(character);
    }

    @Override
    public void handle() {
        System.out.println(character.name + ": Increase Defence!");
        character.defence++;
        super.handle();
    }
}

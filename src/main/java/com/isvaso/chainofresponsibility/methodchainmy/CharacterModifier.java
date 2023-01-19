package com.isvaso.chainofresponsibility.methodchainmy;

public class CharacterModifier {

    protected Character character;
    protected CharacterModifier next;

    public CharacterModifier(Character character) {
        this.character = character;
    }

    public void add(CharacterModifier cm) {
        if (next != null)
            next.add(cm);
        else next = cm;
    }

    public void handle() {
        if (next != null)
            next.handle();
    }
}

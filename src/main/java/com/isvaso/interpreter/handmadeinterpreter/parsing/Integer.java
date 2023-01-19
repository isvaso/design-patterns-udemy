package com.isvaso.interpreter.handmadeinterpreter.parsing;

public class Integer implements Element {

    private int value;

    public Integer(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }
}

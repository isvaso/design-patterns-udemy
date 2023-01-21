package com.isvaso.memento.mementocodingexercise;

import java.util.ArrayList;
import java.util.List;

class Token
{
    public int value = 0;
    public List<Memento> history = new ArrayList<>();

    public Token(int value)
    {
        this.value = value;
    }
}

class Memento
{
    public List<Token> tokens;

    public Memento(List<Token> tokens) {
        tokens = new ArrayList<>();
    }
}

class TokenMachine
{
    public List<Token> tokens = new ArrayList<>();

    public Memento addToken(int value)
    {
        tokens.add(new Token(value));
        return new Memento(makeNewTokenList(tokens));
    }

    public Memento addToken(Token token)
    {
        tokens.add(token);
        return new Memento(makeNewTokenList(tokens));
    }

    public void revert(Memento m)
    {
        tokens = m.tokens;
    }

    private List<Token> makeNewTokenList(List<Token> tokens) {
        List<Token> result = new ArrayList<>();
        tokens.forEach(t -> {
            result.add(new Token(t.value));
        });
        return result;
    }
}


package com.isvaso.chainofresponsibility.brokerchain;

public class Creature {

    private Game game;
    public String name;
    public int baseAttack, baseDefence;

    public Creature(Game game, String name,
                    int baseAttack, int baseDefence) {
        this.game = game;
        this.name = name;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
    }

    int getDefence() {
        Query q = new Query(name, Query.Argument.DEFENCE, baseDefence);
        game.queries.fire(q);
        return q.result;
    }

    int getAttack() {
        Query q = new Query(name, Query.Argument.ATTACK, baseAttack);
        game.queries.fire(q);
        return q.result;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", attack=" + getAttack() +
                ", defence=" + getDefence() +
                '}';
    }
}

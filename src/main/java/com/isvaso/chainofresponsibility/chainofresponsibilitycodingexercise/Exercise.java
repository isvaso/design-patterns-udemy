package com.isvaso.chainofresponsibilitycodingexercise;

import java.util.ArrayList;
import java.util.List;


abstract class Creature
{
    protected int attack, defence;
    protected Game game;
    protected String name;
    public abstract int getAttack();
    public abstract int getDefense();
}

class Goblin extends Creature
{

    public Goblin(Game game)
    {
        name = "Goblin";
        attack = 1;
        defence = 1;
        this.game = game;
    }

    @Override
    public int getAttack()
    {
        return game.creatures.stream()
                .filter(n -> n.name.equals("GoblinKing"))
                .toArray()
                .length
                + attack;
    }

    @Override
    public int getDefense()
    {
        return game.creatures.stream()
                .filter(n -> n.name.equals("Goblin") || n.name.equals("GoblinKing"))
                .toArray()
                .length
                - 1
                + defence;
    }
}

class GoblinKing extends Goblin
{
    public GoblinKing(Game game)
    {
        super(game);
        name = "GoblinKing";
        attack = 3;
        defence = 3;
        this.game = game;
    }

    @Override
    public int getAttack()
    {
        return game.creatures.stream()
                .filter(n -> n.name.equals("GoblinKing"))
                .toArray()
                .length
                + attack
                - 1;
    }

    @Override
    public int getDefense()
    {
        return game.creatures.stream()
                .filter(n -> n.name.equals("Goblin") || n.name.equals("GoblinKing"))
                .toArray()
                .length
                + defence
                - 1;
    }
}

class Game
{
    public List<Creature> creatures = new ArrayList<>();
}

class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Goblin goblin = new Goblin(game);
        GoblinKing goblinKing = new GoblinKing(game);

        game.creatures.add(goblin);
        game.creatures.add(goblin);
        game.creatures.add(goblinKing);
        game.creatures.add(goblinKing);

        System.out.println(goblinKing.getAttack());
        System.out.println(goblinKing.getDefense());
    }
}
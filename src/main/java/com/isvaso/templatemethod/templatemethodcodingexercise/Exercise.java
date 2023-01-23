package com.isvaso.templatemethod.templatemethodcodingexercise;

class Creature
{
    public int attack, health;

    public Creature(int attack, int health)
    {
        this.attack = attack;
        this.health = health;
    }
}

abstract class CardGame
{
    public Creature [] creatures;

    public CardGame(Creature[] creatures)
    {
        this.creatures = creatures;
    }

    // returns -1 if no clear winner (both alive or both dead)
    public int combat(int creature1, int creature2)
    {
        Creature first = creatures[creature1];
        Creature second = creatures[creature2];
        System.out.println("\nBattle: ");
        System.out.println("First: " + first.attack + "/" + first.health);
        System.out.println("Second: " + second.attack + "/" + second.health);
        hit(first, second);
        hit(second, first);

        System.out.println("\n" + "First HP: " + first.health
                + "\n"
                + "Second HP: " + second.health);

        return first.health <= 0
                ? (second.health <= 0 ? -1 : 1)
                : (second.health <= 0 ? 1 : -1);
    }

    // attacker hits other creature
    protected abstract void hit(Creature attacker, Creature other);
}

class TemporaryCardDamageGame extends CardGame
{
    public TemporaryCardDamageGame(Creature[] creatures) {
        super(creatures);
    }

    @Override
    protected void hit(Creature attacker, Creature other) {
        int startHealth = other.health;

        //if (attacker.health > 0)
            other.health -= attacker.attack;

        if (other.health > 0) other.health = startHealth;
    }
}

class PermanentCardDamageGame extends CardGame
{
    public PermanentCardDamageGame(Creature[] creatures) {
        super(creatures);
    }

    @Override
    protected void hit(Creature attacker, Creature other) {
        //if (attacker.health > 0)
            other.health -= attacker.attack;
    }
}

class Main {
    public static void main(String[] args) {
        Creature[] creaturesT = {new Creature(1, 2),
                new Creature(1, 3),
                new Creature(2, 2),
                new Creature(3, 3),
                new Creature(1, 3),
        };

        Creature[] creaturesP = {new Creature(1, 2),
                new Creature(1, 3),
                new Creature(2, 2),
                new Creature(3, 3),
                new Creature(1, 3),
        };

        TemporaryCardDamageGame tGame = new TemporaryCardDamageGame(creaturesT);
        System.out.println("Temporary. The winner is " + tGame.combat(0, 1));

        PermanentCardDamageGame pGame = new PermanentCardDamageGame(creaturesP);
        System.out.println("Permanent. The winner is " + pGame.combat(0, 1));


    }
}

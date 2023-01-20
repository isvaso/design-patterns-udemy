package com.isvaso.iterator.arraybackedproperties;

public class Main {

    public static void main(String[] args) {
        Creature creature = new Creature();
        creature.setAgility(7);
        creature.setIntelligence(3);
        creature.setStrength(22);

        System.out.format(
                "Creature has a max stat of %s, total stats = %s, average stat = %.2f",
                creature.max(), creature.sum(), creature.average()
        );
    }
}

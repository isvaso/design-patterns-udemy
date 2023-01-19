package com.isvaso.proxy.propertyproxy;

/**
 * So the idea of a property proxy is to simply
 * replace every single field that you store with a specialized
 * kind of construct, which allows you more control because a field
 * with its equals operator for assignment and its direct access
 * to the underlying memory. <br>
 *
 * It doesn't allow you much control in terms of things like logging
 * or controlling access or maybe even substituting different values.
 * And the probably proxy does. So that's one reason for you to use it.
 */
public class Main {

    public static void main(String[] args) {
        CreatureBad creatureBad = new CreatureBad();
        creatureBad.setAgility(10);

        Creature creature = new Creature();
        creature.setAgility(10);

        System.out.println(String.format(
                "Agility:"
                        + System.lineSeparator()
                        + " - CreatureBad: %s "
                        + System.lineSeparator()
                        + " - CreatureGood: %s"
                , creatureBad.getAgility()
                , creature.getAgility())
        );
    }
}

package com.isvaso.factories.abstractfactory;

/**
 * Well, the abstract factory is essentially a pattern which makes a correspondence between t
 * he hierarchy of objects that you have.
 */

public class  Main {

    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();

        IHotDrink drink = machine.makeDrink();
        drink.consume();
    }
}

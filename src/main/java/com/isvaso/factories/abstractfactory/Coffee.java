package com.isvaso.factories.abstractfactory;

public class Coffee implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is delicious.");
    }
}

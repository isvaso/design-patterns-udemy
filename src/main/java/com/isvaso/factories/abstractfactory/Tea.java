package com.isvaso.factories.abstractfactory;

public class Tea implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("This tea is delicious.");
    }
}

package com.isvaso.proxy.propertyproxy;

// See on Property<Integer> agility! Now it is not just int field.
public class Creature {

    private Property<Integer> agility = new Property<>(10);

    public void setAgility(int value) {
        agility.setValue(value);
    }

    public int getAgility() {
        return agility.getValue();
    }


}

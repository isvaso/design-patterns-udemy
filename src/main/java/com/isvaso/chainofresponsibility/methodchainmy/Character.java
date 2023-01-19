package com.isvaso.chainofresponsibility.methodchainmy;

public class Character {

    public String name;
    public int power, defence;

    public Character(String name, int power, int defence) {
        this.name = name;
        this.power = power;
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", defence=" + defence +
                '}';
    }
}

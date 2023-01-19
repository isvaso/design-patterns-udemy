package com.isvaso.builders.fbuilderinheritancewithrecursivegenerics;

public class Person {

    public String name;
    public String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

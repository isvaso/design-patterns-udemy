package com.isvaso.factories.factorycodingexercise;

class Person {
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class PersonFactory {

    private static int id;

    public Person createPerson(String name)
    {
        return new Person(id++, name);
    }
}

class Main {
    public static void main(String[] args) {

    }
}

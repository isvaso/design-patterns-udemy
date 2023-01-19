package com.isvaso.prototype.dontusecloneable;

/**
 * Marker class Cloneable doesn't recommended for use in Prototype. This is just for an example.
 */

public class Main {

    public static void main(String[] args) throws Exception {
        Person john = new Person(new String[]{"John", "Smith"},
                new Address("London Road", 12));

        Person jane = john.clone();
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;

        System.out.println(john);
        System.out.println(jane);
    }
}

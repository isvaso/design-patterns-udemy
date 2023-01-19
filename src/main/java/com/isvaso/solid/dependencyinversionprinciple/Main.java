package com.isvaso.solid.dependencyinversionprinciple;

/**
 * A. High-level modules should not depend on low-level modules.
 * <br> Both should depend on abstractions.
 * <br>
 * <br> B. Abstractions should not depend on details.
 * <br> Details should not depend on abstractions.
 */

public class Main {

    public static void main(String[] args) {
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);

        new Research(relationships);
    }
}

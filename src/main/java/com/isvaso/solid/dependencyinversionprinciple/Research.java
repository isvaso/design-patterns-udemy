package com.isvaso.solid.dependencyinversionprinciple;

import org.javatuples.Triplet;

import java.util.List;

public class Research { // high-level

    // BAD
//    public Research(Relationships relationships) {
//        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
//
//        relations.stream()
//                .filter(x -> x.getValue0().name.equals("John")
//                && x.getValue1() == Relationship.PARENT)
//                .forEach(ch -> System.out.println(
//                        "John has a child called " + ch.getValue2().name));
//    }

    public Research(RelationshipBrowser browser) {
        List<Person> children = browser.findAllChildrenOf("John");
        children.forEach(n -> System.out.println("John has child called " + n.name));
    }
}

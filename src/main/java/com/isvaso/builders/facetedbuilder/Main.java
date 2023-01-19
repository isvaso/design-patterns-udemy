package com.isvaso.builders.facetedbuilder;

/**
 * Sometimes your object, the object that you're building up is so complicated that a single builder even
 * isn't sufficient and you need more than one builder. <br>
 * So in this demo, we're going to take a look at how you can use multiple builders working in tandem
 * to provide functionality for actually building up a particular object.
 */

public class Main {

    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();

        Person person = pb
                .lives()
                .at("Panfilova, 304")
                .in("Bishkek")
                .withPostcode("720033")
                .works()
                .asA("Student")
                .at("Home")
                .earning(120000)
                .build();

        System.out.println(person);
    }
}

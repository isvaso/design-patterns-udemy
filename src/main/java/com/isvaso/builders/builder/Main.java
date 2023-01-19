package com.isvaso.builders.builder;

/**
 * Builder is a creational design pattern, which allows constructing complex objects step by step.
 * <br> Unlike other creational patterns, Builder doesn't require products to have a common interface.
 * That makes it possible to produce different products using the same construction process.
 */

public class  Main {

    public static void main(String[] args) {
        Director director = new Director();
        System.out.println(director.createStandardHead());

        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "Hello");
        builder.addChild("li", "World!");
        System.out.println(builder);
    }
}

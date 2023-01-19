package com.isvaso.builders.fluentbuilder;

/**
 * Flurent Builder to allow you to write very long chains, which are particularly useful for building.
 * <br>
 * Example: StringBuilder sb = new StringBuilder(); sb.append("a").append("b");
 */

public class Main {

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder
                .addChild("li", "Hello")
                .addChild("li", "World!");
        System.out.println(builder);
    }
}

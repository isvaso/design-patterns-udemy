package com.isvaso.builders.fluentbuilder;

public class Director {

    private HtmlBuilder builder;

    public Director() {}

    public String createStandardHead() {
        StringBuilder result = new StringBuilder();
        result.append("<!DOCTYPE HTML>\n");
        result.append("<html>\n");

        builder = new HtmlBuilder("head");
        builder.addChild("title", "Example page");

        result.append(builder);
        builder.clear();

        builder = new HtmlBuilder("body");
        builder.addChild("p", "Body text of the web page would be here");
        result.append(builder);

        result.append("</html>\n");

        return result.toString();
    }
}

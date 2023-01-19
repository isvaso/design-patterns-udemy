package com.isvaso.builders.buildercodingexercise;

import java.util.ArrayList;

class CodeBuilder {
    private StringBuilder sb = new StringBuilder();
    private String className;
    private ArrayList<String> fileds = new ArrayList<>();
    private final String newLine = System.lineSeparator();

    public CodeBuilder(String className)
    {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type) {
        fileds.add(type + " " + name + ";");
        return this;
    }

    @Override
    public String toString() {
        sb
                .append("public class ")
                .append(className)
                .append(newLine)
                .append("{")
                .append(newLine);

        for (String f : fileds)
            sb
                    .append("  public ")
                    .append(f)
                    .append(newLine);

        sb
                .append("}")
                .append(newLine);

        return sb.toString();
    }
}
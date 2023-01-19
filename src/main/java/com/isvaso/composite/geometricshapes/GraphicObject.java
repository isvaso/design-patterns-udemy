package com.isvaso.composite.geometricshapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// It's a Composite!
public class GraphicObject {

    protected String name = "Group";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GraphicObject() {

    }

    public String color;
    public List<GraphicObject> children = new ArrayList<>();

    private void print(StringBuilder stringBuilder, int depth) {
        stringBuilder.append(String.join("", Collections.nCopies(depth, "*")))
                .append(depth > 0 ? " " : "")
                .append((color == null || color.isEmpty()) ? "" : color + " ")
                .append(getName())
                .append(System.lineSeparator());
        for (GraphicObject child : children)
            child.print(stringBuilder, depth + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, 1);
        return sb.toString();
    }
}

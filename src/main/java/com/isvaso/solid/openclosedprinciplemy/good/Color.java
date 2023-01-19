package com.isvaso.solid.openclosedprinciplemy.good;

public enum Color {
    RED("Red"),
    BLACK("Black"),
    WHITE("White"),
    YELLOW("Yellow"),
    GRAY("Gray"),
    BLUE("Blue"),
    PINK("Pink"),
    GREEN("Green");

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}

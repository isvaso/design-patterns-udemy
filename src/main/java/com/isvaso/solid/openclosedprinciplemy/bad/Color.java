package com.isvaso.solid.openclosedprinciplemy.bad;

enum Color {
    RED("Red"),
    BLACK("Black"),
    WHITE("White"),
    YELLOW("Yellow"),
    GRAY("Gray"),
    BLUE("Blue");

    private final String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}

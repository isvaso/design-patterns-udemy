package com.isvaso.solid.openclosedprinciplemy.good;

public class Car {

    private static int carsCount;
    private int index;
    private Brand brand;
    private Color color;

    public Car(Brand brand, Color color) {
        this.brand = brand;
        this.color = color;
        this.index = ++carsCount;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "" + index + ". "
                + brand.getBrandName() + ": "
                + color.getColorName();
    }
}

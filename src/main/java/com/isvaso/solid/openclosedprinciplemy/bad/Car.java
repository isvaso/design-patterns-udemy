package com.isvaso.solid.openclosedprinciplemy.bad;

class Car {

    private Brand brand;
    private Color color;

    public Car(Brand brand, Color color) {
        this.brand = brand;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }
}

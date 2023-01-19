package com.isvaso.decorator.staticdecorator;

public class Square implements Shape {

    private float side;

    public Square() {}

    public Square(float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A squire with side " + side;
    }
}

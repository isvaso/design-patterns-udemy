package com.isvaso.decorator.dynamicdecoratorcomposition;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape sh1 = new ColoredShape(new Square(20), "blue");
        System.out.println(sh1.info());

        TransparentShape ts1 = new TransparentShape(
                new ColoredShape(
                        new Circle(5), "green"
                ), 50
        );
        System.out.println(ts1.info());
    }
}


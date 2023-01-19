package com.isvaso.decorator.staticdecorator;

/**
 * Static Decorator... I'm not sure about this option.
 */

public class Main {

    public static void main(String[] args) {
        ColoredShape<Square> blueSquare
                = new ColoredShape<>(
                () -> new Square(20),
                "blue"
        );
        System.out.println(blueSquare.info());


        TransparentShape<ColoredShape<Circle>> myCircle =
                new TransparentShape<>(
                        () -> new ColoredShape<>(
                                () -> new Circle(5),
                                "green"),
                        50);
        System.out.println(myCircle.info());

    }
}


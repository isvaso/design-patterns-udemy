package com.isvaso.solid.liskovsubstitutionprinciple;

/**
 * The idea of the risk of substitution principle is you should be able to substitute a subclass for a base class.
 * So if you have some API, which takes a base class, you should be able to stick a subclass in there
 * without the things breaking in any way.
 */

public class Main {

    static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println(
                "Expected area of " + (width * 10) +
                        ", got " + r.getArea()
        );
    }

    public static void main(String[] args) {
        Rectangle rc = RectangleFactory.newRectangle(2, 3);
        useIt(rc);

        Rectangle sq = RectangleFactory.newSquare(5);
        useIt(sq);
    }
}

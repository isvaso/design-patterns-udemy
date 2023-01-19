package com.isvaso.prototype.protitypecodingexercise;

public class Main {

    public static void main(String[] args) {
        Line l1 = new Line(new Point(0 ,0),
                new Point(10, 5));
        Line l2 = l1.deepCopy();
        l2.end.x = 100;

        System.out.println(l1.end.x);
        System.out.println(l2.end.x);
    }
}

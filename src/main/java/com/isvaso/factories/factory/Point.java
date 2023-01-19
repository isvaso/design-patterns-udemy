package com.isvaso.factories.factory;

import com.isvaso.factories.factorymethod.PointGood;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public String toString() {
        return "PointGood { " +
                "x = " + x +
                ", y = " + y +
                " }";
    }
}

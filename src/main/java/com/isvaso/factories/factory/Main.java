package com.isvaso.factories.factory;

public class Main {

    public static void main(String[] args) {
        Point point = PointFactory.newPolarPoint(4, 5);

        System.out.println(point);
    }
}

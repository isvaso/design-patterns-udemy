package com.isvaso.factories.factorymethod;

public class Main {

    public static void main(String[] args) {
        PointGood point = PointGood.newPolarPoint(2, 3);

        System.out.println(point);
    }
}

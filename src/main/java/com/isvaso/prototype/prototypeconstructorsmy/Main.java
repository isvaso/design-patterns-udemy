package com.isvaso.prototype.prototypeconstructorsmy;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("VW", EnginePower.D, WheelsSize.SIZE3);

        Car c2 = c1.copy();
        c2.setName("Toyota");

        System.out.println(c1);
        System.out.println(c2);
    }
}

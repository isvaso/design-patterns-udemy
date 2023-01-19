package com.isvaso.proxy.protectionproxy;

public class Main {

    public static void main(String[] args) {
        //Car car = new Car(new Driver(12));
        Car car = new CarProxy(new Driver(12));
        car.drive();
    }
}

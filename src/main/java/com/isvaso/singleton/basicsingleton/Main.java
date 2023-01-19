package com.isvaso.singleton.basicsingleton;

public class Main {

    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(12);
        System.out.println(singleton.getValue());
    }
}

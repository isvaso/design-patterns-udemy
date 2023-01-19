package com.isvaso.singleton.staticblocksingleton;

public class Main {

    public static void main(String[] args) {
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

        System.out.println(staticBlockSingleton.getIndex());
    }
}

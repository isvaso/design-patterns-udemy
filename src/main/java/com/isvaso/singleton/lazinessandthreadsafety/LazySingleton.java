package com.isvaso.singleton.lazinessandthreadsafety;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Init a lazy singleton");
    }

    // you could end up in the situation
    // where you have threads in different states.
    // Therefore synchronized.
//    public static synchronized LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    // double-checked locking
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

package com.isvaso.singleton.singletonecodingexercise;

import java.util.function.Supplier;

/**
 * Since implementing a singleton is easy, you have a different challenge:
 * write a method called isSingleton(). This method takes a factory method
 * that returns an object and it's up to you to determine whether or not
 * that object is a singleton instance.
 */

public class SingletonTester {

    public static boolean isSingleton(Supplier<Object> func)
    {
        return func.get() == func.get();
    }
}

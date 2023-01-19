package com.isvaso.proxy.dynamicproxyforlogging;

// And we're going to try and build a dynamic proxy which takes
// an existing object of type person and counts
// the number of methods inside the person that have actually been called.
// So we need to build a dynamic proxy object.

public class Person implements Human {

    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void talk() {
        System.out.println("I am talking");
    }
}

package com.isvaso.proxy.dynamicproxyforlogging;

import java.lang.reflect.Proxy;

/**
 * Dynamic proxy it's a proxy which is constructed at runtime
 * as opposed to compile time.
 */

public class Main {

    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[] { itf },
                new LoggingHandler(target)
        );
    }

    public static void main(String[] args) {
        Person person = new Person();
        Human logged = withLogging(person, Human.class);
        logged.talk();
        logged.walk();
        logged.walk();
        System.out.println(logged);
    }
}

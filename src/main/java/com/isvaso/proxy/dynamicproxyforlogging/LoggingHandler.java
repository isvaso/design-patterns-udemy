package com.isvaso.proxy.dynamicproxyforlogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class LoggingHandler implements InvocationHandler {

    private final Object target;
    private Map<String, Integer> calls = new HashMap<>();

    public LoggingHandler(Object target) {
        this.target = target;
    }

    // So the invoke method is basically the idea that you get to invoke
    // a particular method, which is this method "Method method"
    // with this particular set of arguments "Object[] args".
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();

        if (name.contains("toString")) {
            return calls.toString();
        }
        calls.merge(name, 1, Integer::sum);

        return method.invoke(target, args);
    }
}

package com.isvaso.nullobject.dynamicnullobject;

import java.lang.reflect.Proxy;


public class Main {

    @SuppressWarnings("unceched")
    public static <T> T noOp(Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[] { itf },
                ((proxy, method, args) -> {
                    if (method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                })
        );
    }

    public static void main(String[] args) {
        Log log = noOp(Log.class);
        BankAccount account1 = new BankAccount(log);
        account1.deposit(100);
    }
}

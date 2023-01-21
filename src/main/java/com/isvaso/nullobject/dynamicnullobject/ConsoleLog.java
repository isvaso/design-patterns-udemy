package com.isvaso.nullobject.dynamicnullobject;

public class ConsoleLog implements Log {
    @Override
    public void info(String msg) {
        System.out.println(msg);
    }

    @Override
    public void warn(String msg) {
        System.out.println("WARNING: " + msg);
    }
}

package com.isvaso.decorator.dynamicdecoratorcompositionmy;

public class AlertSender implements ISender {

    private String name = "AlertSender";

    public String send(String message) {
        return name + ": " + message;
    }
}

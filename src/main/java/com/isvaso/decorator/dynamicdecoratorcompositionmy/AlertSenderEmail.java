package com.isvaso.decorator.dynamicdecoratorcompositionmy;

public class AlertSenderEmail implements ISender {

    private ISender iSender;
    private String name = "EmailAlertSender";

    public AlertSenderEmail(ISender iSender) {
        this.iSender = iSender;
    }

    @Override
    public String send(String message) {
        return iSender.send(message)
                + System.lineSeparator()
                + name + ": " + message;
    }
}

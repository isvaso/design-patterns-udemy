package com.isvaso.decorator.dynamicdecoratorcompositionmy;

public class AlertSenderSms implements ISender {

    private ISender iSender;
    private String name = "SmsAlertSender";

    public AlertSenderSms(ISender iSender) {
        this.iSender = iSender;
    }

    @Override
    public String send(String message) {
        return iSender.send(message)
                + System.lineSeparator()
                + name + ": " + message;
    }
}

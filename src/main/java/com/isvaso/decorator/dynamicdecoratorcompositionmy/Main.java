package com.isvaso.decorator.dynamicdecoratorcompositionmy;

/**
 * Dynamic Decorator because new Decorator(new Decorator(new Decorator));
 */

public class Main {

    public static void main(String[] args) {
        AlertSender as = new AlertSender();
        System.out.println(as.send("Alarm!") + System.lineSeparator());

        AlertSenderSms asSms = new AlertSenderSms(
                new AlertSender());
        System.out.println(asSms.send("Alarm!") + System.lineSeparator());

        AlertSenderEmail asEmail = new AlertSenderEmail(
                new AlertSenderSms(
                        new AlertSender()
                )
        );
        System.out.println(asEmail.send("Alarm!") + System.lineSeparator());
    }
}

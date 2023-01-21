package com.isvaso.observer.aneventclass;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Event<PropertyChangedEventArgs>
                .Subscription subscription =
                person
                        .propertyChanged
                        .addHandler(x -> {
                            System.out.println("Person's"
                                    + x.propertyName + " has changed");
                        });
        person.setAge(17);
        person.setAge(22);
        try {
            subscription.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        person.setAge(19);
    }
}

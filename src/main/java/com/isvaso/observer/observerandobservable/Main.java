package com.isvaso.observer.observerandobservable;

public class Main implements Observer<Person> {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Person person = new Person();
        person.subscribe(this);
        for (int i = 20; i < 24; ++i) {
            person.setAge(i);
        }
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println("Person's " + args.propertyName
        + " has changed to " + args.newValue);
    }
}

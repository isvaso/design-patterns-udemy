package com.isvaso.flyweight.repeatingusernames;

public class Main {

    public static void main(String[] args) {
        User user = new User("John Smith");
        User user2 = new User("Adam Smith");

        // With Flyweight
        User2 user21 = new User2("John Smith");
        User2 user22 = new User2("Adam Smith");

        System.out.println(user22.getNames());
    }
}

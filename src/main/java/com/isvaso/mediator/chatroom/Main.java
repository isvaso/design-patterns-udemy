package com.isvaso.mediator.chatroom;

public class Main {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Person john = new Person("John");
        Person jane = new Person("Jane");
        Person misha = new Person("Misha");

        chatRoom.join(john);
        chatRoom.join(jane);
        chatRoom.join(misha);

        john.say("Hi room!");
        jane.say("Oh, hi!");
        misha.say("Hello!");

        Person fred = new Person("Fred");
        chatRoom.join(fred);
        fred.say("hi everyone");

        jane.privateMessage("John", "Yo man!");

    }
}

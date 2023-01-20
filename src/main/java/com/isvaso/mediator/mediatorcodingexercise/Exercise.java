package com.isvaso.mediator.mediatorcodingexercise;

import java.util.ArrayList;
import java.util.List;

class Participant
{
    int value = 0;
    String name;
    Mediator mediator;

    public Participant(Mediator mediator)
    {
        this.name = name;
        mediator.join(this);
    }

    public void say(int n)
    {
        mediator.message(this, n);
    }
}

class Mediator
{
    private List<Participant> clients = new ArrayList<>();

    public void join(Participant p) {
        p.mediator = this;
        clients.add(p);
    }

    public void message(Participant source, int value) {
        clients.stream()
                .filter(p -> p != source)
                .forEach(p -> p.value += value);
    }
}

class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Participant p1 = new Participant(mediator);
        Participant p2 = new Participant(mediator);
        Participant p3 = new Participant(mediator);

        p2.say(11);

        System.out.println(p1.value + " " + p2.value + " " + p3.value);
    }
}

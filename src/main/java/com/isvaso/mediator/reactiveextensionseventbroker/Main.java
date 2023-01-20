package com.isvaso.mediator.reactiveextensionseventbroker;

public class Main {

    public static void main(String[] args) {
        EventBroker eventBroker = new EventBroker();
        FootballPlayer player = new FootballPlayer(eventBroker, "Jones");
        FootballCoach coach = new FootballCoach(eventBroker);

        player.score();
        player.score();
        player.score();

    }
}

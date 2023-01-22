package com.isvaso.state.handmadestatemachine;

import org.javatuples.Pair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static Map<State, List<Pair<Trigger, State>>>
            rules = new HashMap<>();

    // So here's how you define the rules.

    // So basically, here's what I'm saying up above.
    // I'm saying that if I'm currently in the off hook state,
    // then the kind of things I can do is I can dial a call, in which
    // case I'll move into the connecting state or I can stop using the phone,
    // in which case I'll place the phone on the hook.

    // And the same goes for the other states as well.
    // So when I'm connecting, for example, I can hang up, in which case
    // the phone will be off the hook or I can be connected to wherever
    // I'm dialing, in which case the state moves to connect it.

    // So this is a very simple state, a set of rules effectively
    // for what can happen.
    static {
        rules.put(State.OFF_HOOK, List.of(
                new Pair<>(Trigger.CALL_DIALED, State.CONNECTING),
                new Pair<>(Trigger.STOP_USING_PHONE, State.ON_HOOK)
        ));
        rules.put(State.CONNECTING, List.of(
                new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK),
                new Pair<>(Trigger.CALL_CONNECTED, State.CONNECTED)
        ));
        rules.put(State.CONNECTED, List.of(
                new Pair<>(Trigger.LEFT_MESSAGE, State.OFF_HOOK),
                new Pair<>(Trigger.PLACED_ON_HOLD, State.ON_HOLD)
        ));
        rules.put(State.ON_HOLD, List.of(
                new Pair<>(Trigger.TAKEN_OFF_HOLD, State.CONNECTED),
                new Pair<>(Trigger.HUNG_UP, State.OFF_HOOK)
        ));
    }

    private static State currentState = State.OFF_HOOK; // start state
    private static State exitState = State.ON_HOOK; // end state

    public static void main(String[] args) {
        BufferedReader console
                = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("The phone is currently " + currentState);
            System.out.println("Select a trigger:");

            for (int i = 0; i < rules.get(currentState).size(); i++) {
                Trigger trigger = rules.get(currentState).get(i).getValue0();
                System.out.println("" + i + ". " + trigger);
            }

            boolean parseOK;
            int choice = 0;
            do {
                try {
                    System.out.println("Please enter your choice:");
                    choice = Integer.parseInt(console.readLine());
                    parseOK = choice >= 0
                            && choice < rules.get(currentState).size();
                } catch (Exception e) {
                    parseOK = false;
                }
            } while (!parseOK);

            currentState = rules.get(currentState).get(choice).getValue1();

            if (currentState == exitState) break;
        }
        System.out.println("And we are done!");
    }
}

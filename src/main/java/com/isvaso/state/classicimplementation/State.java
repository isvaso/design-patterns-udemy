package com.isvaso.state.classicimplementation;

public class State {

    void on(LightSwitch ls) {
        System.out.println("Light is already on");
    }

    void off(LightSwitch ls) {
        System.out.println("Light is already off");
    }
}

package com.isvaso.state.classicimplementation;

public class LightSwitch {

    private State state; // OnState, OddState

    public LightSwitch() {
        state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    void on() {
        state.on(this);
    }

    void off() {
        state.off(this);
    }
}

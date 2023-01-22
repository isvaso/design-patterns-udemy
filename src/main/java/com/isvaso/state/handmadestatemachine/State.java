package com.isvaso.state.handmadestatemachine;

public enum State {
    OFF_HOOK,     // starting
    ON_HOOK,      // terminal
    CONNECTING,
    CONNECTED,
    ON_HOLD
}

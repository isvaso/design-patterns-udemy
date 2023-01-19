package com.isvaso.chainofresponsibility.brokerchain;

import java.util.*;
import java.util.function.Consumer;

// CQS
public class Event<Args> {

    private int index = 0;
    private Map<Integer, Consumer<Args>> handlers = new HashMap<>();

    public int subscribe(Consumer<Args> handler) {
        int i = index;
        handlers.put(index++, handler);
        return i;
    }

    public void unsubscribe(int key) {
        handlers.remove(key);
    }

    public void fire(Args args) {
        for (Consumer<Args> handler : handlers.values())
            handler.accept(args);
    }
}

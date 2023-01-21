package com.isvaso.observer.aneventclass;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<T> {

    private int count = 0;
    private Map<Integer, Consumer<T>> handlers = new HashMap<>();

    public Subscription addHandler(Consumer<T> handler) {
        int i = count;
        handlers.put(count++, handler);
        return new Subscription(this, i);
    }

    public void fire(T args) {
        for (Consumer<T> handler : handlers.values())
            handler.accept(args);
    }

    public class Subscription implements AutoCloseable {

        private Event<T> event;
        private int id;

        public Subscription(Event<T> event, int id) {
            this.event = event;
            this.id = id;
        }

        @Override
        public void close() throws Exception {
            event.handlers.remove(id);
        }
    }
}

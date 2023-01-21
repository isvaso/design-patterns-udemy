package com.isvaso.observer.observerandobservable;

public interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}

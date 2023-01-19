package com.isvaso.solid.openclosedprinciplemy.good;

public interface Specifier<T> {

    boolean isSpecified(T item);
}

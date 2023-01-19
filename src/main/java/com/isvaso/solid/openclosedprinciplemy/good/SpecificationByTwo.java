package com.isvaso.solid.openclosedprinciplemy.good;

public class SpecificationByTwo<T> implements Specifier<T> {

    private Specifier<T> first;
    private Specifier<T> second;

    public SpecificationByTwo(Specifier<T> first, Specifier<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSpecified(T item) {
        return first.isSpecified(item) && second.isSpecified(item);
    }
}

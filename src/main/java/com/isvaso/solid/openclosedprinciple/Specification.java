package com.isvaso.solid.openclosedprinciple;

public interface Specification<T> {
    boolean isSatisfied(T product);
}

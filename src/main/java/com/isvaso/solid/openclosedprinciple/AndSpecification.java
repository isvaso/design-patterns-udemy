package com.isvaso.solid.openclosedprinciple;

public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T product) {
        return first.isSatisfied(product) && second.isSatisfied(product);
    }
}

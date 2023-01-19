package com.isvaso.solid.openclosedprinciplemy.good;

import java.util.Collection;
import java.util.stream.Stream;

public class CarsFilter implements Filter<Car> {
    @Override
    public Stream<Car> filter(Collection<Car> collection, Specifier<Car> specifier) {
        return collection.stream()
                .filter(specifier::isSpecified);
    }
}

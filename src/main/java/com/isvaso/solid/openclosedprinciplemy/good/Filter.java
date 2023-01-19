package com.isvaso.solid.openclosedprinciplemy.good;

import java.util.Collection;
import java.util.stream.Stream;

public interface Filter<T> {

    Stream<T> filter(Collection<T> collection,
                           Specifier<T> specifier);
}

package com.isvaso.solid.openclosedprinciple;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilterBad {

    public Stream<Product> filterByColor(List<Product> products,
                                         Color color) {
        return products.stream().filter(n -> n.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products,
                                         Size size) {
        return products.stream().filter(n -> n.size == size);
    }

    public Stream<Product> filterBySizeAndColor(List<Product> products,
                                                Size size,
                                                Color color) {
        return products.stream().filter(n -> n.size == size && n.color == color);
    }
}

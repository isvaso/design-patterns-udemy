package com.isvaso.solid.openclosedprinciple;

import java.util.List;

/**
 * The whole point of the open closed principle is to be open for extension,
 * but closed for modification.
 */

public class Main {

    public static void main(String[] args) {

        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);

        ///BAD code
        ProductFilterBad pfb = new ProductFilterBad();
        System.out.println("Green products (BAD):");
        pfb.filterByColor(products, Color.GREEN)
                .forEach(n -> System.out.println(" - " + n.name));

        //GOOD code
        ProductFilter pf = new ProductFilter();
        System.out.println("\nGreen products (GOOD):");
        pf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(n -> System.out.println(" - " + n.name));

        System.out.println("\nLarge products (GOOD):");
        pf.filter(products, new SizeSpecification(Size.LARGE))
                .forEach(n -> System.out.println(" - " + n.name));

        System.out.println("\nBlue and Large products (GOOD):");
        pf.filter(products,
                new AndSpecification<>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.LARGE)
                ))
                .forEach(n -> System.out.println(" - " + n.name));
    }
}

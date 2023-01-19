package com.isvaso.solid.openclosedprinciplemy.good;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Car> carsList = CarListGenerator.generate(20);

        System.out.println("\nColor palette of Volkswagen:");
        new CarsFilter().filter(carsList, new SpecificationByBrand(Brand.VOLKSWAGEN))
                .map(n -> n.getColor().getColorName())
                .collect(Collectors.toSet())
                .forEach(n -> System.out.println(" - " + n));

        System.out.println("\nBrands with black car's color:");
        new CarsFilter().filter(carsList, new SpecificationByColor(Color.BLACK))
                .map(n -> n.getBrand().getBrandName())
                .collect(Collectors.toSet())
                .forEach(n -> System.out.println(" - " + n));

        System.out.println("\nDoes Renault have red cars?");
        List<Car> result = new CarsFilter().filter(carsList, new SpecificationByTwo<>(
                        new SpecificationByBrand(Brand.RENAULT),
                        new SpecificationByColor(Color.RED)))
                .collect(Collectors.toList());
        if (result.isEmpty())
            System.out.println(" - NO");
        else System.out.println(" - YES");
    }
}

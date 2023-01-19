package com.isvaso.solid.openclosedprinciplemy.bad;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> carsList = CarListGenerator.generate();

        CarsFilterWorker carsFilterBad = new CarsFilterWorker();

        System.out.println("\nColor palette of Volkswagen:");
        carsFilterBad.filterByBrand(carsList, Brand.VOLKSWAGEN)
                .forEach(n -> System.out.println(" - " + n.getColor().getColorName()));

        System.out.println("\nBrands with black car's color:");
        carsFilterBad.filterByColor(carsList, Color.BLACK)
                .forEach(n -> System.out.println(" - " + n.getBrand().getBrandName()));

        System.out.println("\nDoes Renault have red cars?: \n - " +
        carsFilterBad.checkColorInBrand(carsList, Brand.RENAULT, Color.RED));

    }
}

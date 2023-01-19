package com.isvaso.solid.openclosedprinciplemy.bad;

import java.util.List;
import java.util.stream.Stream;

public class CarsFilterWorker {

    public Stream<Car> filterByBrand(List<Car> cars,
                                     Brand brand) {
        return cars.stream()
                .filter(n ->
                        n.getBrand() == brand);
    }

    public Stream<Car> filterByColor(List<Car> cars,
                                     Color color) {
        return cars.stream()
                .filter(n ->
                        n.getColor() == color);
    }

    public String checkColorInBrand(List<Car> cars,
                                         Brand brand,
                                         Color color) {
        boolean result = cars.stream()
                .anyMatch(n ->
                        n.getBrand() == brand
                                && n.getColor() == color);

        if (result)
            return "Yes";
        else
            return "No";
    }
}

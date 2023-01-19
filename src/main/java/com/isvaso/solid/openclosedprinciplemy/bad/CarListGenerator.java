package com.isvaso.solid.openclosedprinciplemy.bad;

import java.util.ArrayList;
import java.util.List;

public class CarListGenerator {

    public static List<Car> generate() {
        List<Car> carsList = new ArrayList<>();

        carsList.add(new Car(Brand.AUDI, Color.RED));
        carsList.add(new Car(Brand.AUDI, Color.BLACK));
        carsList.add(new Car(Brand.AUDI, Color.WHITE));
        carsList.add(new Car(Brand.LAMBORGHINI, Color.YELLOW));
        carsList.add(new Car(Brand.VOLKSWAGEN, Color.BLUE));
        carsList.add(new Car(Brand.VOLKSWAGEN, Color.GRAY));
        carsList.add(new Car(Brand.VOLKSWAGEN, Color.BLACK));
        carsList.add(new Car(Brand.VOLKSWAGEN, Color.WHITE));
        carsList.add(new Car(Brand.RENAULT, Color.BLACK));
        carsList.add(new Car(Brand.RENAULT, Color.WHITE));
        carsList.add(new Car(Brand.PORSCHE, Color.RED));
        carsList.add(new Car(Brand.PORSCHE, Color.RED));

        return carsList;
    }
}

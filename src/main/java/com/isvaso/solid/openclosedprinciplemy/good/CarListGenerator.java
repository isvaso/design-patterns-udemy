package com.isvaso.solid.openclosedprinciplemy.good;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarListGenerator {

    static List<Car> generate(Integer count) {
        Random random = new Random();

        List<Car> carList = new ArrayList<>();

        int brandCount = Brand.values().length;
        int colorCount = Color.values().length;

        for (int i = 0; i < count; i++)
            carList.add(new Car(
                    Brand.values()[random.nextInt(brandCount)],
                    Color.values()[random.nextInt(colorCount)]
            ));

//        System.out.println("Generated Car's list: ");
//        carList.forEach(System.out::println);

        return carList;


    }
}

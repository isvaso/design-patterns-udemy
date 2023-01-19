package com.isvaso.factories.abstractfactory;

import org.javatuples.Pair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {

    private List<Pair<String, IHotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {

        // Doesn't work =(
        /*Set<Class<? extends IHotDrinkFactory>> types = new Reflections("")
                .getSubTypesOf(IHotDrinkFactory.class);

        for (Class<? extends IHotDrinkFactory> type : types) {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }*/

        namedFactories.add(new Pair("Tea", new TeaFactory()));
        namedFactories.add(new Pair("Coffee", new CoffeeFactory()));

    }

    public IHotDrink makeDrink() throws Exception {
        System.out.println("Available drinks: ");

        for (int i = 0; i < namedFactories.size(); ++i) {
            Pair<String, IHotDrinkFactory> item = namedFactories.get(i);
            System.out.println("" + (i + 1) + ": " + item.getValue0());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null
            && !s.isEmpty()
            && (i = Integer.parseInt(s)) >= 1
            && i < namedFactories.size() + 1) {
                System.out.println("Specify amount:");
                s = reader.readLine();
                if (s != null && (amount = Integer.parseInt(s)) > 0) {
                    return namedFactories.get(i - 1).getValue1().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }
}

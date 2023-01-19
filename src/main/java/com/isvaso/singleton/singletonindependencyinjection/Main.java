package com.isvaso.singleton.singletonindependencyinjection;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Database db = SingletonDatabase.getInstance();
        System.out.println(db.getPopulation("New York"));

        SingletonRecordFinder srf = new SingletonRecordFinder();
        List<String> names = List.of("Manila", "New York");
        int tp = srf.getTotalPopulation(names);
        System.out.println(tp);

    }
}

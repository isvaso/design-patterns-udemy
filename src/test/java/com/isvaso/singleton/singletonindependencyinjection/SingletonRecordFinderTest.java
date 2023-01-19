package com.isvaso.singleton.singletonindependencyinjection;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SingletonRecordFinderTest {

    @Test // not unit test! this in an integration test!
    public void getTotalPopulation() {
        SingletonRecordFinder srf = new SingletonRecordFinder();
        List<String> names = List.of("Manila", "New York");
        int tp = srf.getTotalPopulation(names);
        assertEquals(14750000 + 17800000, tp);
    }

    @Test
    public void dependentPopulationTest() {
        DummyDatabase db = new DummyDatabase();
        ConfigurableRecordFinder fr = new ConfigurableRecordFinder(db);
        assertEquals(4, fr.getTotalPopulation(List.of("alpha", "gamma")));
    }
}
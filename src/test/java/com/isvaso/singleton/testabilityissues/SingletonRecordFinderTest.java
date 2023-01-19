package com.isvaso.singleton.testabilityissues;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SingletonRecordFinderTest {

    @Test
    public void getTotalPopulation() {
        SingletonRecordFinder srf = new SingletonRecordFinder();
        List<String> names = List.of("Manila", "New York");
        int tp = srf.getTotalPopulation(names);
        assertEquals(14750000 + 17800000, tp);
    }
}
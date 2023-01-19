package com.isvaso.singleton.testabilityissues;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonDatabaseTest {

    @Test
    public void getPopulation() {
        SingletonDatabase database = SingletonDatabase.getInstance();
        assertEquals(14750000, database.getPopulation("Manila"));
    }
}
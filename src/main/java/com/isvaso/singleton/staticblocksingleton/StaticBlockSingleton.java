package com.isvaso.singleton.staticblocksingleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private int index = 1110;

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing");
        //File.createTempFile(".", ".");
    }

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            System.err.println("failed to create singleton");
        }
    }

    public int getIndex() {
        return index;
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

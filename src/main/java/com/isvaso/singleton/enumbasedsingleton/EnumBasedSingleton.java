package com.isvaso.singleton.enumbasedsingleton;

// serializable by default
// field values are always current, not from a file
public enum EnumBasedSingleton {

    INSTANCE;

    EnumBasedSingleton() {
        value = 42;
    }

    private int value;

    EnumBasedSingleton(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

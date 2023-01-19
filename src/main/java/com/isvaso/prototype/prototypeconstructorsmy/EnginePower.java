package com.isvaso.prototype.prototypeconstructorsmy;

public enum EnginePower {

    A("60 hp"),
    B("85 hp"),
    C("105 hp"),
    D("140 hp"),
    E("210 hp");

    private String power;

    EnginePower(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }
}

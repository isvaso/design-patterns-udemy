package com.isvaso.solid.openclosedprinciplemy.good;

public enum Brand {
    VOLKSWAGEN("Volkswagen"),
    AUDI("Audi"),
    PORSCHE("Porsche"),
    LAMBORGHINI("Lamborghini"),
    RENAULT("Renault"),
    MERCEDES("Mercedes-Benz"),
    LAND_ROVER("Land Rover"),
    HONDA("Honda"),
    TOYOTA("Toyota"),
    MAZDA("Mazda");

    private final String brandName;

    Brand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}

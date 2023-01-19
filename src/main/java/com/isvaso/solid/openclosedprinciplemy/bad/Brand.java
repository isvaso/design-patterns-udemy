package com.isvaso.solid.openclosedprinciplemy.bad;

enum Brand {
    VOLKSWAGEN("Volkswagen"),
    AUDI("Audi"),
    PORSCHE("Porsche"),
    LAMBORGHINI("Lamborghini"),
    RENAULT("Renault");


    private final String brandName;

    Brand(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
}

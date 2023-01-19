package com.isvaso.solid.openclosedprinciplemy.good;

public class SpecificationByBrand implements Specifier<Car> {

    private Brand brand;

    public SpecificationByBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public boolean isSpecified(Car item) {
        return item.getBrand() == brand;
    }
}

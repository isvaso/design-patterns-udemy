package com.isvaso.solid.openclosedprinciplemy.good;

public class SpecificationByColor implements Specifier<Car>{

    private Color color;

    public SpecificationByColor(Color color) {
        this.color = color;
    }


    @Override
    public boolean isSpecified(Car item) {
        return item.getColor() == color;
    }
}

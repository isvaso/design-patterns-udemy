package com.isvaso.factories.factorymethod;

public class PointBad {

    private double x, y;

    /**
     * Bad version of the Point class constructor
     * @param a is x if cartesian or rho if polar
     * @param b is y if cartesian or theta if polar
     * @param cs CoordinateSystem selector
     */
    public PointBad(double a, double b, CoordinateSystem cs) {
        switch (cs) {
            case CARTESIAN:
                this.x = a;
                this.y = b;
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);
        }
    }
}

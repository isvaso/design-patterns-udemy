package com.isvaso.factories.factorymethod;

public class PointGood {

    private double x, y;

    private PointGood(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Good version of the Point class constructor for cartesian coordinate system
     * by Factory Method Pattern.
     * @param x
     * @param y
     * @return new PointGood object
     */
    public static PointGood newCartesianPoint(double x, double y) {
        return new PointGood(x ,y);
    }

    /**
     * Good version of the Point class constructor for polar coordinate system
     * by Factory Method Pattern.
     * @param rho
     * @param theta
     * @return new PointGood object
     */
    public static PointGood newPolarPoint(double rho, double theta) {
        return new PointGood(rho * Math.cos(theta), rho * Math.sin(theta));
    }

    @Override
    public String toString() {
        return "PointGood { " +
                "x = " + x +
                ", y = " + y +
                " }";
    }
}

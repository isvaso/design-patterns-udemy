package com.isvaso.factories.factory;

public class PointFactory {

    /**
     * Good version of the Point class constructor for cartesian coordinate system
     * by Factory Pattern.
     * @param x
     * @param y
     * @return new PointGood object
     */
    public static Point newCartesianPoint(double x, double y) {
        return new Point(x ,y);
    }

    /**
     * Good version of the Point class constructor for polar coordinate system
     * by Factory Pattern.
     * @param rho
     * @param theta
     * @return new PointGood object
     */
    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }
}

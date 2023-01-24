package com.isvaso.adapter.adaptercaching;

import com.isvaso.logger.ProjectLogger;

import java.util.logging.Level;

public class Point {

    public int x,y;

    private final ProjectLogger LOGGER
            = ProjectLogger.getLogger(this.getClass().getName());

    public Point(int x, int y) {
        LOGGER.log(Level.INFO, "Constructor");

        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        LOGGER.log(Level.INFO, "equals()");

        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Point point = (Point) obj;

        if (x != point.x)
            return false;

        return y == point.y;
    }

    @Override
    public int hashCode() {
        LOGGER.log(Level.INFO, "hashCode()" +
                "");
        int result = x;
        result = 31 * result + y;
        return  result;
    }

    @Override
    public String toString() {
        LOGGER.log(Level.INFO, "toString");

        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

package com.isvaso.adapter.adaptercaching;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Point {

    private static final Logger logger = LogManager.getLogger();
    public int x,y;

    public Point(int x, int y) {
        logger.info("Point {} {}", x, y);
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        logger.info("Point equals: {}", obj);
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
        int result = x;
        result = 31 * result + y;
        return  result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

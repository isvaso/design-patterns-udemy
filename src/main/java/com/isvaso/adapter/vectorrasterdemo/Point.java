package com.isvaso.adapter.vectorrasterdemo;

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
    public String toString() {
        LOGGER.log(Level.INFO, "toString()");

        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

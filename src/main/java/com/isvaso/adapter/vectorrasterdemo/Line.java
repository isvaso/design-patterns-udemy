package com.isvaso.adapter.vectorrasterdemo;

import com.isvaso.logger.ProjectLogger;

import java.util.logging.Level;

public class Line {

    public Point start, end;

    private final ProjectLogger LOGGER
            = ProjectLogger.getLogger(this.getClass().getName());

    public Line(Point start, Point end) {
        LOGGER.log(Level.INFO, "Constructor");

        this.start = start;
        this.end = end;
    }
}

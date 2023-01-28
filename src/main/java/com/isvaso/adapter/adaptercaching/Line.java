package com.isvaso.adapter.adaptercaching;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Line {

    private static final Logger logger = LogManager.getLogger();
    public Point start, end;

    public Line(Point start, Point end) {
        logger.info("Line start:{} end:{}", start, end);
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

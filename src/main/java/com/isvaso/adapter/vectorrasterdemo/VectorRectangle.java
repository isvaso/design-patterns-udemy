package com.isvaso.adapter.vectorrasterdemo;

import com.isvaso.logger.ProjectLogger;

import java.util.logging.Level;

public class VectorRectangle extends VectorObject {

    private final ProjectLogger LOGGER
            = ProjectLogger.getLogger(this.getClass().getName());

    public VectorRectangle(int x, int y, int width, int height) {
        LOGGER.log(Level.INFO, "VectorRectangle()");

        add(new Line(
                new Point(x ,y),
                new Point(x + width, y)
        ));
        add(new Line(
                new Point(x + width, y),
                new Point(x + width, y + height)
        ));
        add(new Line(
                new Point(x, y),
                new Point(x, y + height)
        ));
        add(new Line(
                new Point(x, y + height),
                new Point(x + width, y + height)
        ));

    }
}

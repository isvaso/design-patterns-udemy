package com.isvaso.adapter.adaptercaching;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VectorRectangle extends VectorObject {

    private static final Logger logger = LogManager.getLogger();

    public VectorRectangle(int x, int y, int width, int height) {
        logger.info("VectorRectangle x: {} y: {} width: {} height: {}",
                x, y, width, height);
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

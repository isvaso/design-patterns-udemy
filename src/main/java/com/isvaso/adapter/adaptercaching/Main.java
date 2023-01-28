package com.isvaso.adapter.adaptercaching;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    static {

    }

    private final static List<VectorObject> vectorObjects
            = new ArrayList<>(Arrays.asList(
            new VectorRectangle(1, 1, 10, 10),
            new VectorRectangle(3, 3, 6, 6)
    ));

    public static void drawPoint(Point p) {
        logger.info("drawPoint {}", p);
        System.out.println(".");
    }

    private static void draw() {
        for (VectorObject vo : vectorObjects) {
            for (Line line : vo) {
                logger.info("draw {}", line.toString());
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(Main::drawPoint);
            }
        }
    }

    public static void main(String[] args) {
        draw();
        draw();
        draw();
    }
}

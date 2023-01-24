package com.isvaso.adapter.vectorrasterdemo;

import com.isvaso.logger.ProjectLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

public class Main {

    private final static List<VectorObject> vectorObjects = new ArrayList<>(Arrays.asList(
            new VectorRectangle(1, 1, 10, 10),
            new VectorRectangle(3, 3, 6, 6)
    ));

    private static final ProjectLogger LOGGER
            = ProjectLogger.getLogger(Main.class.getName());

    public static void drawPoint(Point p) {
        LOGGER.log(Level.INFO, "drawPoint()");

        System.out.println(".");
    }

    private static void draw() {
        LOGGER.log(Level.INFO, "draw()");

        for (VectorObject vo : vectorObjects) {
            for (Line line : vo) {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(Main::drawPoint);
            }
        }
    }

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "main()");

        draw();
    }
}

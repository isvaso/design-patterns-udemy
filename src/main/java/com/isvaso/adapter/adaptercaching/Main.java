package com.isvaso.adapter.adaptercaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private final static List<VectorObject> vectorObjects = new ArrayList<>(Arrays.asList(
            new VectorRectangle(1, 1, 10, 10),
            new VectorRectangle(3, 3, 6, 6)
    ));

    public static void drawPoint(Point p) {
        System.out.println(".");
    }

    private static void draw() {
        for (VectorObject vo : vectorObjects) {
            for (Line line : vo) {
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

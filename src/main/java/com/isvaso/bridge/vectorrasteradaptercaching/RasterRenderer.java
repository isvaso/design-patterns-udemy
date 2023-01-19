package com.isvaso.bridge.vectorrasteradaptercaching;

public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels of a circle of radius " + radius);
    }
}

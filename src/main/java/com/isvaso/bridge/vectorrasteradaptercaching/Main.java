package com.isvaso.bridge.vectorrasteradaptercaching;

public class Main {

    // todo: Google Guice
    public static void main(String[] args) {
        // too many complications!!!
//        Injector injector = Guice.createInjector(new ShapeModule());
//        Circle instance = injector.getInstance(Circle.class);
//        instance.radius = 3;
//        instance.draw();
//        instance.resize(2);
//        instance.draw();

        Circle c1 = new Circle(new RasterRenderer(), 10);
        Circle c2 = new Circle(new VectorRenderer(), 10);

        c1.draw();
        c2.draw();

        c1.resize(1.25F);
        c2.resize(.32F);

        c1.draw();
        c2.draw();
    }
}

package com.isvaso.bridge.bridgecodingexercise;

abstract class Shape
{
    protected Renderer renderer;
    protected String name;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String getName();
}

class Triangle extends Shape
{

    public Triangle(Renderer renderer) {
        super(renderer);
        name = "Triangle";
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), renderer.whatToRenderAs());
    }
}

class Square extends Shape
{

    public Square(Renderer renderer) {
        super(renderer);
        this.name = "Square";
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", getName(), renderer.whatToRenderAs());
    }
}

interface Renderer {
    public String whatToRenderAs();
}

class VectorRenderer implements Renderer
{
    @Override
    public String whatToRenderAs() {
        return "lines";
    }
}

class RasterRenderer implements Renderer
{
    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}


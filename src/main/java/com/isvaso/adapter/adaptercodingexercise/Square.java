package com.isvaso.adapter.adaptercodingexercise;

/**
 * Here's a very synthetic example for you to try.
 * <br><br>
 * You are given a Rectangle  interface and an extension method on it.
 * Try to define a SquareToRectangleAdapter  that adapts the Square  to the IRectangle  interface.
 */

class Square
{
    public int side;

    public Square(int side)
    {
        this.side = side;
    }
}

interface Rectangle
{
    int getWidth();
    int getHeight();

    default int getArea()
    {
        return getWidth() * getHeight();
    }
}

class SquareToRectangleAdapter implements Rectangle
{
    private int width, height;

    public SquareToRectangleAdapter(Square square)
    {
        this.width = square.side;
        this.height = square.side;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return getWidth() * getHeight();
    }
}

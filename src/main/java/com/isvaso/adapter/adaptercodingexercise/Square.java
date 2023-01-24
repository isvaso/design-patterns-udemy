package com.isvaso.adapter.adaptercodingexercise;

import com.isvaso.logger.ProjectLogger;

import java.util.logging.Level;

/**
 * Here's a very synthetic example for you to try.
 * <br><br>
 * You are given a Rectangle  interface and an extension method on it.
 * Try to define a SquareToRectangleAdapter  that adapts the Square  to the IRectangle  interface.
 */

class Square
{
    public int side;

    private final ProjectLogger LOGGER
            = ProjectLogger.getLogger(this.getClass().getName());

    public Square(int side)
    {
        LOGGER.log(Level.INFO, "Constructor");

        this.side = side;
    }
}

interface Rectangle
{
    int getWidth();
    int getHeight();

    default int getArea()
    {
        ProjectLogger LOGGER
                = ProjectLogger.getLogger(this.getClass().getName());

        LOGGER.log(Level.INFO, "default getArea()");

        return getWidth() * getHeight();
    }
}

class SquareToRectangleAdapter implements Rectangle
{
    private int width, height;

    private final ProjectLogger LOGGER
            = ProjectLogger.getLogger(this.getClass().getName());

    public SquareToRectangleAdapter(Square square)
    {
        LOGGER.log(Level.INFO, "SquareToRectangleAdapter()");

        this.width = square.side;
        this.height = square.side;
    }

    @Override
    public int getWidth() {
        LOGGER.log(Level.INFO, "getWidth()");
        return width;
    }

    @Override
    public int getHeight() {
        LOGGER.log(Level.INFO, "getHeight()");
        return height;
    }

    @Override
    public int getArea() {
        LOGGER.log(Level.INFO, "getArea()");
        return getWidth() * getHeight();
    }
}

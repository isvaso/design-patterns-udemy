package com.isvaso.prototype.protitypecodingexercise;

import java.util.List;

/**
 * Given the following class definitions, you are asked to implement Line.deepCopy()
 * to perform a deep copy of the current Line object.
 */

class Point {
    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // copy constructor
    public Point(Point other) {
        this(other.x, other.y);
    }
}

class Line {
    public Point start, end;

    public Line(Point start, Point end)
    {
        this.start = start;
        this.end = end;
    }

    public Line(Line other) {
        this.start = new Point(other.start);
        this.end = new Point(other.end);
    }

    public Line deepCopy()
    {
        return new Line(this);
    }
}





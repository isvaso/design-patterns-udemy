package com.isvaso.command.commandmy;

public class Square implements Shape{

    private float x, y;
    private float side;

    public Square(float x, float y, float side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public void move(float newX, float newY) {
        System.out.format(
                "Square old position:"
                        + "x :%s  y: %s" , x, y
                        + System.lineSeparator());

        this.x = newX;
        this.y = newY;

        System.out.format(
                "Square new position:"
                        + "x :%s  y: %s", x, y
                        + System.lineSeparator());
    }

    @Override
    public void scale(float percent) {
        System.out.format(
                "Square old dimensions:"
                        + "width :%s  height: %s" , side, side
                        + System.lineSeparator());

        this.side = side/100 * Math.abs(percent);

        System.out.format(
                "Square new dimension:"
                        + "width :%s  height: %s" , side, side
                        + System.lineSeparator());
    }
}

package com.isvaso.command.commandmy;

public class ShapeCommand implements Command {

    public enum Action {
        MOVE, SCALE
    }

    private final Shape shape;
    private final Action action;
    private float value1 = 0;
    private float value2 = 0;

    public ShapeCommand(Shape shape, Action action, float value) {
        this.shape = shape;
        this.action = action;
        this.value1 = value;
    }

    public ShapeCommand(Shape shape, Action action, float value1, float value2) {
        this.shape = shape;
        this.action = action;
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public void execute() {
        switch (action) {
            case MOVE:
                shape.move(value1, value2);
                break;
            case SCALE:
                shape.scale(value1);
                break;
        }
    }
}

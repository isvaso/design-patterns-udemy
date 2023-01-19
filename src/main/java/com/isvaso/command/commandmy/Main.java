package com.isvaso.command.commandmy;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square(0, 0, 100);

        Deque<Command> commands = new ArrayDeque<>();

        commands.add(new ShapeCommand(square, ShapeCommand.Action.MOVE, 200, 100));
        commands.add(new ShapeCommand(square, ShapeCommand.Action.MOVE, 15));
        commands.add(new ShapeCommand(square, ShapeCommand.Action.SCALE, 50));
        commands.add(new ShapeCommand(square, ShapeCommand.Action.SCALE, 120, 111));

        commands.forEach(Command::execute);
    }
}

package com.isvaso.command.undooperations;

public interface Command {

    void call();
    void undo();
}

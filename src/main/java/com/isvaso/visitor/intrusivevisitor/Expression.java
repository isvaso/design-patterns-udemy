package com.isvaso.visitor.intrusivevisitor;

abstract class Expression {

    // BAD Intrusive Visitor
    public abstract void print(StringBuilder sb);
}

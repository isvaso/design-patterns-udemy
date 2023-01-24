package com.isvaso.visitor.classicvisitordoubledispatch;

abstract class Expression {
    // Classic Visitor
    public abstract void accept(ExpressionVisitor visitor);
}

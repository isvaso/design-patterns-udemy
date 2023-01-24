package com.isvaso.visitor.classicvisitordoubledispatch;

// Classic Visitor
public interface ExpressionVisitor {
    void visit(DoubleExpression e);
    void visit(AdditionExpression e);
}

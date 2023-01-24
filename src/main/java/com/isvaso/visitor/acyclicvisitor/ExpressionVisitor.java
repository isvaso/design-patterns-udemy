package com.isvaso.visitor.acyclicvisitor;

public interface ExpressionVisitor extends Visitor {
    void visit(Expression obj);
}

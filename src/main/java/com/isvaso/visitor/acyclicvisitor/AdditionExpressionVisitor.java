package com.isvaso.visitor.acyclicvisitor;

interface AdditionExpressionVisitor extends Visitor {
    void visit(AdditionExpression obj);
}

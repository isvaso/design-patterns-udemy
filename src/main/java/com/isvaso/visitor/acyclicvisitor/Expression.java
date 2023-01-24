package com.isvaso.visitor.acyclicvisitor;

abstract class Expression {
    // optional
    public void accept(Visitor visitor) {
        if (visitor instanceof ExpressionVisitor)
            ((ExpressionVisitor)visitor).visit(this);
    }
}

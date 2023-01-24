package com.isvaso.visitor.classicvisitordoubledispatch;

public class AdditionExpression extends Expression {

    public Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // Classic Visitor
    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}

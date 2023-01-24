package com.isvaso.visitor.classicvisitordoubledispatch;

public class DoubleExpression extends Expression {

    public double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    // Classic Visitor
    @Override
    public void accept(ExpressionVisitor visitor) {
         visitor.visit(this);
    }

}

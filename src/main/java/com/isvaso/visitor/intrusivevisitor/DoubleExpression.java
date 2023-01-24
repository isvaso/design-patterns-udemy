package com.isvaso.visitor.intrusivevisitor;

public class DoubleExpression extends Expression {

    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    // BAD Intrusive Visitor
    @Override
    public void print(StringBuilder sb) {
        sb.append(value);
    }
}

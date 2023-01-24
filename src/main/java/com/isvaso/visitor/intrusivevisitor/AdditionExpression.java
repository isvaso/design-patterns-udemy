package com.isvaso.visitor.intrusivevisitor;

public class AdditionExpression extends Expression {

    private Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // BAD Intrusive Visitor
    @Override
    public void print(StringBuilder sb) {
        sb.append("(");
        left.print(sb);
        sb.append("+");
        right.print(sb);
        sb.append(")");
    }
}

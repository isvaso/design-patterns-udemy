package com.isvaso.visitor.acyclicvisitor;

public class ExpressionPrinter
         implements DoubleExpressionVisitor,
        AdditionExpressionVisitor {

    private StringBuilder sb = new StringBuilder();

    @Override
    public String toString() {
        return sb.toString();
    }

    @Override
    public void visit(AdditionExpression obj) {
        sb.append('(');
        obj.left.accept(this);
        sb.append('+');
        obj.right.accept(this);
        sb.append(')');
    }

    @Override
    public void visit(DoubleExpression obj) {
        sb.append(obj.value);
    }
}

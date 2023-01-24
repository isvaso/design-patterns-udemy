package com.isvaso.visitor.reflectivevisitor;

// Reflective Visitor. Its slow code... But by SRP and OCP.
class ExpressionPrinter {

    public static void print(Expression e, StringBuilder sb) {
        // Check DoubleExpression.class and append his value
        if (e.getClass() == DoubleExpression.class) {
            sb.append(((DoubleExpression)e).value);
            // Else check AdditionExpression.class
        } else if (e.getClass() == AdditionExpression.class) {
            AdditionExpression ae = (AdditionExpression) e;
            // and append his values
            sb.append("(");
            print(ae.left, sb);
            sb.append("+");
            print(ae.right, sb);
            sb.append(")");
        }
    }
}

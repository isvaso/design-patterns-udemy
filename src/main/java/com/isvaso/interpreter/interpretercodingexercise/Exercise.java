package com.isvaso.interpreter.interpretercodingexercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ExpressionProcessor
{
    public Map<Character, Integer> variables = new HashMap<>();

    private List<Token> lex(String text) {
        List<Token> result = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {

            switch (text.charAt(i)) {
                case '+':
                    result.add(new Token(Token.Type.PLUS, "+"));
                    break;

                case '-':
                    result.add(new Token(Token.Type.MINUS, "-"));
                    break;

                default:
                    if (Character.isAlphabetic(text.charAt(i))) {
                        result.add(new Token(Token.Type.VAR,
                                Character.toString(text.charAt(i))));
                        break;
                    }
                    if (Character.isDigit(text.charAt(i))) {
                        StringBuilder sb = new StringBuilder("" + text.charAt(i));

                        for (int j = i + 1; j < text.length(); j++) {
                            if (Character.isDigit(text.charAt(j))) {
                                sb.append(text.charAt(j));
                                i++;
                            }
                            else break;
                        }
                        result.add(new Token(Token.Type.INT, sb.toString()));
                    }
            }
        }
        return result;
    }

    private int parse(List<Token> tokens) {
        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false; // is left or right in BinaryOperation

        for (int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);

            switch (token.type) {

                case INT:
                    Int integer = new Int(Integer.parseInt(token.text));
                    if (!haveLHS) { //first digit
                        result.left = integer;
                        haveLHS = true;
                    } else {
                        result.right = integer;
                        result.left = new Int(result.eval());
                    }
                    break;
                case PLUS:
                    result.type = BinaryOperation.Type.PLUS;
                    break;
                case MINUS:
                    result.type = BinaryOperation.Type.MINUS;
                    break;
                case VAR:
                    if (i < tokens.size() - 1
                            && tokens.get(i + 1).type == Token.Type.VAR
                            || !variables.containsKey(token.text.charAt(0)))
                        return 0;
                    result.right = new Int(variables.get(token.text.charAt(0)));
                    result.left = new Int(result.eval());
                    break;
                default:
                    return 0;
            }
        }
        return result.left.eval(); // Result of BinaryOperation of "left + last right"
    }

    public int calculate(String expression)
    {
        List<Token> tokens = lex(expression);
        return parse(tokens);
    }

}

class Token {

    public enum Type {
        INT,
        PLUS,
        MINUS,
        VAR
    }

    public Type type;
    public String text;

    public Token(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "'" + text + "'";
    }
}

interface Element {

    int eval();
}

class Int implements Element {

    private int value;

    public Int(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }
}

class BinaryOperation implements Element {

    public enum Type {
        PLUS,
        MINUS
    }

    public Type type;
    Int left, right;

    @Override
    public int eval() {
        switch (type) {
            case PLUS:
                return left.eval() + right.eval();
            case MINUS:
                return left.eval() - right.eval();
            default:
                return 0;
        }
    }
}

class Main {

    public static void main(String[] args) {
        String input = "1+3+22+x";
        ExpressionProcessor ep = new ExpressionProcessor();
        ep.variables.put('x', -1);
        System.out.println(ep.calculate(input));
    }
}

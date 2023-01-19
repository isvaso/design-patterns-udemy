package com.isvaso.decorator.adapterdecorator;

public class Main {

    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder();
        msb.append("Hello").appendLine(" world");
        System.out.println(msb.concat("and this too"));

    }
}

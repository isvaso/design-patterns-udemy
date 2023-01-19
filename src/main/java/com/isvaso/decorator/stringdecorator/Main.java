package com.isvaso.decorator.stringdecorator;

public class Main {

    public static void main(String[] args) {
        MagicString s = new MagicString("Hello");
        System.out.println(s + " has " + s.getNumberOfWolves() + " vowels");
    }
}

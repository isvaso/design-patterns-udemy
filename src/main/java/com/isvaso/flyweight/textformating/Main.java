package com.isvaso.flyweight.textformating;

public class Main {

    public static void main(String[] args) {
        FormattedText ft = new FormattedText("This is a brave new world");
        ft.capitalize(10, 15);
        System.out.println(ft);

        BetterFormattedText bft = new BetterFormattedText("Make America great again");
        bft.getRange(13, 18).capitalize = true;
        System.out.println(bft);
    }
}

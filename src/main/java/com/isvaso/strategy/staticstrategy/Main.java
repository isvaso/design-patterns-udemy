package com.isvaso.strategy.staticstrategy;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TextProcessor<MarkdownListStrategy> tp
                = new TextProcessor<>(MarkdownListStrategy::new);
        tp.appendList(List.of("alpha", "beta", "gamma"));
        System.out.println(tp);

        TextProcessor<HtmlListStrategy> tp2
                = new TextProcessor<>(HtmlListStrategy::new);
        tp2.appendList(List.of("alpha", "beta", "gamma"));
        System.out.println(tp2);
    }
}

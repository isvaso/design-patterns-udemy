package com.isvaso.flyweight.flyweightcodingexercise;

import java.util.*;

class Sentence
{
    private String plaintText;
    private List<WordToken> wordTokens = new ArrayList<>();

    public Sentence(String plainText)
    {
        this.plaintText = plainText;
    }

    public WordToken getWord(int index)
    {
        WordToken wordToken = new WordToken(index);
        wordTokens.add(wordToken);
        return wordToken;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        int wordNumber = 0;

        for (int i = 0; i < plaintText.length(); i++) {
            char c = plaintText.charAt(i);

            if (c == ' ') wordNumber++;

            for (WordToken w : wordTokens) {
                if (w.index == wordNumber && w.capitalize)
                    c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    class WordToken
    {
        public int index;
        public boolean capitalize;

        public WordToken(int index) {
            this.index = index;
        }
    }
}

class Main {

    public static void main(String[] args) {
        Sentence s = new Sentence("hello world");
        s.getWord(1).capitalize = true;
        System.out.println(s);
    }
}

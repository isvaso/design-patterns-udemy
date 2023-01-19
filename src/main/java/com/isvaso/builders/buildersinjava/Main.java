package com.isvaso.builders.buildersinjava;

public class Main {

    public static void main(String[] args) {
        String hello = "hello";
        //System.out.println("<p>" + hello + "</p>");

        String[] words = {"hello", "world"};

        // BAD
        System.out.println("<ul>\n" + "<li>" + words[0]);
        System.out.println();

        // GOOD
        StringBuilder sb = new StringBuilder();
        sb.append("<ul>\n");
        for (String word : words) {
            sb.append(String.format("  <li>%s</li>\n", word));
        }
        sb.append("</ul>");
        System.out.println(sb);
    }
}

package com.isvaso.flyweight.repeatingusernames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class User2 {

    private static List<String> strings = new ArrayList<>();
    private int[] names;

    public User2(String fullName) {
        Function<String, Integer> getOrAdd = (String s) -> {
            int idx = strings.indexOf(s);
            if (idx != -1 ) return idx;
            else {
                strings.add(s);
                return strings.size() - 1;
            }
        };
        names = Arrays.stream(fullName.split(" "))
                .mapToInt(getOrAdd::apply)
                .toArray();
    }

    public String getNames() {
        if (names.length == 0) return "";

        StringBuilder sb = new StringBuilder();

        for (int name : names)
            sb.append(strings.get(name)).append(" ");
        return sb.toString().trim();
    }
}

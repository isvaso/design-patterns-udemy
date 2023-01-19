package com.isvaso.singleton.monostate;

// no private constructor but static fields. That's it!
public class ChefExecutiveOfficer {

    private static String name;
    private static int age;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ChefExecutiveOfficer.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        ChefExecutiveOfficer.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

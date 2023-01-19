package com.isvaso.prototype.copyconstructors;

public class Main {

    public static void main(String[] args) {
        Employee p1 = new Employee("Jonathan",
                new Address("Panfilova, 304",
                        "Bishkek",
                        "Kyrgyzstan"));
        Employee p2 = new Employee(p1);
        p2.setName("Lyla");

        System.out.println(p1);
        System.out.println(p2);
    }
}

package com.isvaso.builders.fbuilderinheritancewithrecursivegenerics;

public class Main {

    public static void main(String[] args) {


        EmployeeBuilder pb = new EmployeeBuilder();
        Person p1 = pb
                .withName("Ilya")
                .worksAt("Developer")
                .build();

        System.out.println(p1);
    }
}

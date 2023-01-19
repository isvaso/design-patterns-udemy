package com.isvaso.singleton.monostate;

public class Main {

    public static void main(String[] args) {
        ChefExecutiveOfficer ceo = new ChefExecutiveOfficer();
        ceo.setName("Adam Smith");
        ceo.setAge(55);

        ChefExecutiveOfficer ceo2 = new ChefExecutiveOfficer();
        ceo2.setName("Jeff Rawley");
        System.out.println(ceo);
        System.out.println(ceo2);
    }
}

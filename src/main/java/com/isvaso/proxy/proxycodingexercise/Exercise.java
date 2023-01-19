package com.isvaso.proxy.proxycodingexercise;

interface Humanized {

    public String drink();
    public String drive();
    public String drinkAndDrive();
}

class Person implements Humanized
{
    private int age;

    public Person(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String drink() {
        return "drinking";
    }
    public String drive() {
        return "driving";
    }
    public String drinkAndDrive() {
        return "driving while drunk";
    }
}

class ResponsiblePerson implements Humanized
{
    private Person person;

    public ResponsiblePerson(Person person)
    {
        this.person = person;
    }

    public int getAge()
    {
        return person.getAge();
    }

    public void setAge(int age)
    {
        person.setAge(age);
    }

    @Override
    public String drink() {

        if (person.getAge() < 18)
            return "too young";
        else
            return person.drink();
    }

    @Override
    public String drive() {
        System.out.println(person.getAge());
        if (person.getAge() < 16)
            return "too young";
        else
            return person.drive();
    }

    @Override
    public String drinkAndDrive() {
        return "dead";
    }
}

class Main {

    public static void main(String[] args) {
        Person p1 = new Person(1);
        ResponsiblePerson person = new ResponsiblePerson(p1);
        for (int i = 0; i < 20; i++) {
            person.setAge(1 + i);
            System.out.println(person.drink());
            System.out.println(person.drive());
            System.out.println(person.drinkAndDrive());
        }

    }
}

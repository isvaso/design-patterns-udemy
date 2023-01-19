package com.isvaso.decorator.decoratorcodingexercise;

class Bird implements IDragon
{
    public int age;

    public String fly()
    {
        return age < 10 ? "flying" : "too old";
    }
}

class Lizard implements IDragon
{
    public int age;

    public String crawl()
    {
        return (age > 1) ? "crawling" : "too young";
    }
}

interface IDragon {

}

class Dragon implements IDragon
{
    private int age;

    public void setAge(int age)
    {
        this.age = age;
    }

    public String fly()
    {
        return age < 10 ? "flying" : "too old";
    }
    public String crawl()
    {
        return (age > 1) ? "crawling" : "too young";
    }
}

class Main {

    public static void main(String[] args) {
        Dragon dragon = new Dragon();

    }
}

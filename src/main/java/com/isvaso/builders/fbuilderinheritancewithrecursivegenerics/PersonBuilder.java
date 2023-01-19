package com.isvaso.builders.fbuilderinheritancewithrecursivegenerics;

public class PersonBuilder<T extends PersonBuilder<T>> {
    protected Person person = new Person();

    public T withName(String name) {
        person.name = name;
        return self();
    }

    public Person build() {
        return person;
    }

    protected T self() {
        return (T) this;
    }
}

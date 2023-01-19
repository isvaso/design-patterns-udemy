package com.isvaso.prototype.copyconstructors;

public class Employee {

    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // copy constructor
    public Employee(Employee other) {
        name = other.name;
        address = new Address((other.address));
    }

    // fluent
    public Employee setName(String name) {
        this.name = name;
        return this;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

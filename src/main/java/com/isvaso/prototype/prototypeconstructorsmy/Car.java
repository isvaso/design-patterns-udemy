package com.isvaso.prototype.prototypeconstructorsmy;

public class Car {

    private String name;
    private EnginePower enginePower;
    private WheelsSize wheelsSize;

    public Car(String name, EnginePower enginePower, WheelsSize wheelsSize) {
        this.name = name;
        this.enginePower = enginePower;
        this.wheelsSize = wheelsSize;
    }

    // copy constructor
    public Car(Car other) {
        this(other.getName(),
                other.getEnginePower(),
                other.getWheelsSize());
    }

    public String getName() {
        return name;
    }

    public EnginePower getEnginePower() {
        return enginePower;
    }

    public WheelsSize getWheelsSize() {
        return wheelsSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnginePower(EnginePower enginePower) {
        this.enginePower = enginePower;
    }

    public void setWheelsSize(WheelsSize wheelsSize) {
        this.wheelsSize = wheelsSize;
    }

    public Car copy() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", enginePower=" + enginePower +
                ", wheelsSize=" + wheelsSize +
                '}';
    }
}

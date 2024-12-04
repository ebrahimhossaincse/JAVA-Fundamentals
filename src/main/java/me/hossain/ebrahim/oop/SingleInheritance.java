package me.hossain.ebrahim.oop;

class Vehicle {
    void drive() {
        System.out.println("This vehicle can be driven.");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("The car honks.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.honk();
    }
}

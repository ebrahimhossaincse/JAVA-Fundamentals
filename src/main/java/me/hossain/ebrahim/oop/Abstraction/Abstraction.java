package me.hossain.ebrahim.oop.Abstraction;

// Abstract class
abstract class Animals {
    // Abstract method
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("This animal is eating.");
    }
}

// Subclass
class Dogs extends Animals {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Usage
public class Abstraction {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.makeSound(); // Output: Bark
        dog.eat(); // Output: This animal is eating.
    }
}

package me.hossain.ebrahim.oop.Inheritance;

abstract class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    abstract void makeSound();
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Output: This animal eats food.
        dog.bark(); // Output: The dog barks.

        Cat cat = new Cat();
        cat.eat();  // Output: This animal eats food.
        cat.meow(); // Output: The cat meows.
    }
}

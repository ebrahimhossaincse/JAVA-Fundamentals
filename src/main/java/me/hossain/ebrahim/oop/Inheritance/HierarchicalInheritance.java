package me.hossain.ebrahim.oop.Inheritance;

class Animals {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cats extends Animals {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.eat();  // Output: This animal eats food.
        dog.bark(); // Output: The dog barks.

        Cats cat = new Cats();
        cat.eat();  // Output: This animal eats food.
        cat.meow(); // Output: The cat meows.
    }
}

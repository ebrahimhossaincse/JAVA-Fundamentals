package me.hossain.ebrahim.oop.Inheritance;

class Person {
    void introduce() {
        System.out.println("Hello, I am a person.");
    }
}

class Employee extends Person {
    void work() {
        System.out.println("I work at a company.");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("I manage a team of employees.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.introduce();  // Output: Hello, I am a person.
        manager.work();       // Output: I work at a company.
        manager.manage();     // Output: I manage a team of employees.
    }
}

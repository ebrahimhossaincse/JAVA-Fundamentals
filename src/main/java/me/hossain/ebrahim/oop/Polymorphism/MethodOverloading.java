package me.hossain.ebrahim.oop.Polymorphism;

public class MethodOverloading {
    public void print(String message) {
        System.out.println(message);
    }

    public void print(int number) {
        System.out.println(number);
    }

    public void print(double number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        MethodOverloading printer = new MethodOverloading();
        printer.print("Hello, World!");  // Output: Hello, World!
        printer.print(123);             // Output: 123
        printer.print(3.14);            // Output: 3.14
    }
}

package me.hossain.ebrahim.io;

import java.util.Scanner;

public class KeyboardInputExample {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Reading a String
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Reading an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Reading a double
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // Displaying the input values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);

        // Close the scanner
        scanner.close();
    }

}

package me.hossain.ebrahim.exceptionhandling;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10/0;  // Division by zero (ArithmeticException)
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
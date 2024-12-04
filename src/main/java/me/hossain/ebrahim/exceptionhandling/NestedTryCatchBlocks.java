package me.hossain.ebrahim.exceptionhandling;

public class NestedTryCatchBlocks {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};

            try {
                // Inner try block
                int result = 10 / 0; // Throws ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero.");
            }

            System.out.println(numbers[5]); // Throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

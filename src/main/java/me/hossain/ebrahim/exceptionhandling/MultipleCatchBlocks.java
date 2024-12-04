package me.hossain.ebrahim.exceptionhandling;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // Throws ArrayIndexOutOfBoundsException
            int result = 10/0;             // Throws ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}

# Exception Handling in Java

In Java, **exception handling** is a mechanism that allows you to handle runtime errors, ensuring the normal flow of the application. Exceptions are events that disrupt the normal flow of the program. Java provides a robust mechanism to handle exceptions and maintain program stability.

---

## Key Concepts in Exception Handling

- **Exception**: An abnormal condition that disrupts the normal flow of the program.
- **Error**: A severe problem that the application cannot handle.
- **Throwable**: The superclass of all errors and exceptions in Java.

---

## Types of Exceptions

1. **Checked Exceptions**: These exceptions are checked at compile-time. The programmer must handle them using a `try-catch` block or declare them using `throws`. Examples: `IOException`, `SQLException`.

2. **Unchecked Exceptions**: These exceptions occur at runtime. They are not checked during compilation and can be avoided by proper programming. Examples: `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`.

---

## Exception Handling Syntax

```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
} finally {
    // Code that will run regardless of whether an exception occurred or not
}
```
---
## Example: Basic Exception Handling

In this example, we demonstrate how to handle a runtime exception using a `try-catch` block.

```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // Division by zero (ArithmeticException)
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```
---
## Multiple Catch Blocks

Java allows the use of multiple `catch` blocks to handle different types of exceptions separately. Each `catch` block is executed if the specific exception it handles is thrown.

### Example: Multiple Catch Blocks
```java
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // Throws ArrayIndexOutOfBoundsException
            int result = 10 / 0;             // Throws ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}
```
---
## Nested Try-Catch Blocks

In Java, `try-catch` blocks can be nested to handle exceptions at multiple levels. This is useful when you want to manage specific exceptions in a localized way while having a broader exception handler for the rest of the code.

### Example: Nested Try-Catch Blocks
```java
public class NestedTryCatchExample {
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
```
---
## Throwing Exceptions in Java

In Java, exceptions can be explicitly thrown using the `throw` keyword. This is useful when you want to create custom error conditions or handle specific logic that requires an exception to be raised.

### Syntax:
```java
throw new ExceptionType("Error message");
```
---
## Declaring Exceptions with `throws`

In Java, the `throws` keyword is used to declare exceptions that a method can throw. This is helpful for checked exceptions that must either be handled using a `try-catch` block or declared in the method signature.

### Syntax:
```java
returnType methodName(parameters) throws ExceptionType {
    // Method body
}
```
---
## Custom Exceptions in Java

In Java, you can create your own exception classes to represent specific errors in your application. These are called **custom exceptions**. Custom exceptions are helpful when the standard Java exceptions do not adequately describe the problem in your program.

### Steps to Create a Custom Exception:
1. Create a class that extends the `Exception` class (for checked exceptions) or `RuntimeException` class (for unchecked exceptions).
2. Define constructors in the custom exception class to provide detailed error messages or other custom behavior.

### Syntax:
```java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
```
# Reading Values from the Keyboard in Java

In Java, you can read input from the keyboard using several classes, such as `Scanner`, `BufferedReader`, or `Console`. Among these, the `Scanner` class is the most commonly used method for reading input due to its simplicity and versatility.

---

## Using the `Scanner` Class

The `Scanner` class is part of the `java.util` package and allows you to read various data types like `int`, `double`, `String`, etc.

### Steps:
1. Import the `java.util.Scanner` package.
2. Create a `Scanner` object.
3. Use appropriate methods to read input.

### Example: Reading Different Data Types
```java
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

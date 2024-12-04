# Object-Oriented Programming in Java

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **"objects"**, which can contain **data** (fields/attributes) and **methods** (functions). Java is a fully object-oriented language, making it ideal for building modular, reusable, and scalable applications.

---

## Classes and Objects in Java

In Java, **classes** and **objects** are fundamental components of the object-oriented programming paradigm.

- A **class** is a blueprint or template for creating objects, defining properties (attributes) and behaviors (methods).
- An **object** is an instance of a class, representing a specific entity with values assigned to its properties.

---

## Defining a Class

A class in Java is defined using the `class` keyword, followed by the class name and a block containing its members (fields and methods).

**Syntax:**
```java
class ClassName {
    // Fields (attributes)
    dataType fieldName;

    // Methods (functions)
    returnType methodName(parameters) {
        // Method body
    }
}
```

## Create an Object in Java

In Java, creating an object means instantiating a class, which allows you to use its attributes and methods. Objects are created using the `new` keyword.

---

## Syntax for Creating an Object

```java
ClassName objectName = new ClassName();
```

## Core Principles of OOP

# **Encapsulation In JAVA**
Encapsulation involves bundling the data (attributes) and methods (functions) that operate on the data into a single unit, typically a class. It also involves restricting direct access to some components using **access modifiers** (e.g., `private`, `protected`).

**Example:**
```java
class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```
# Inheritance in Java

**Inheritance** is one of the key features of Object-Oriented Programming (OOP) in Java. It allows a class (called the **child class** or **subclass**) to acquire the properties and methods of another class (called the **parent class** or **superclass**). This promotes code reuse and establishes a hierarchical relationship between classes.

---

## Syntax of Inheritance

Inheritance is implemented using the `extends` keyword.

**Syntax:**
```java
class ParentClass {
    // Fields and methods
}

class ChildClass extends ParentClass {
    // Additional fields and methods
}
```

# Polymorphism in Java

**Polymorphism** is a core concept in Object-Oriented Programming (OOP) that allows objects to take on many forms. In Java, polymorphism enables a single method, class, or interface to behave differently based on the context.

---

## Types of Polymorphism in Java

1. **Compile-Time Polymorphism (Static Binding)**: Achieved through method overloading. The method to call is determined at compile time.
2. **Run-Time Polymorphism (Dynamic Binding)**: Achieved through method overriding. The method to call is determined at runtime.

---

## 1. Compile-Time Polymorphism (Method Overloading)

**Method Overloading** occurs when multiple methods have the same name but differ in:
- Number of parameters
- Type of parameters
- Sequence of parameters

### Example:
```java
class Calculator {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two numbers: " + calc.add(5, 10));
        System.out.println("Sum of three numbers: " + calc.add(5, 10, 15));
    }
}
```
# 2. Run-Time Polymorphism (Method Overriding)

Run-time polymorphism in Java is achieved through **method overriding**, where a subclass provides its own implementation of a method that is already defined in its superclass. The method to be called is determined at run-time based on the type of the object.

---

## Key Features of Run-Time Polymorphism
1. **Inheritance**: Method overriding requires a parent-child relationship.
2. **Dynamic Method Dispatch**: The method that gets executed is determined at run-time.
3. **Same Method Signature**: The method in the subclass must have the same name, return type, and parameters as in the superclass.

---

## Example: Method Overriding

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Parent class reference and object
        myAnimal.sound();

        Animal myDog = new Dog(); // Parent class reference, child class object
        myDog.sound();
    }
}
```

# Abstraction in Java

**Abstraction** is an Object-Oriented Programming (OOP) concept that focuses on hiding implementation details from the user and showing only the essential features of an object. In Java, abstraction can be achieved using **abstract classes** and **interfaces**.

---

## Key Features of Abstraction

1. **Hides Complexity**: The internal workings are hidden, and only functionality is exposed.
2. **Improves Code Maintainability**: By defining only essential details, the code becomes easier to modify.
3. **Promotes Reusability**: Abstract methods can be implemented differently in subclasses, promoting code reusability.

---

## Abstraction Using Abstract Classes

An **abstract class** is a class declared with the `abstract` keyword. It may contain abstract methods (methods without a body) and non-abstract methods (methods with a body).

### Example:

```java
abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Non-abstract method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
        myDog.eat();
    }
}
```

# Benefits of Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a paradigm that organizes code into objects, which represent real-world entities. Java, being an OOP language, provides several advantages that enhance code development, readability, and maintainability.

---

## Key Benefits of OOP in Java

### 1. **Modularity**
- OOP promotes the modular structure of code by encapsulating data and behavior into individual objects.
- This makes debugging and updating specific components easier without affecting the rest of the code.

### 2. **Code Reusability**
- Features like **inheritance** allow classes to reuse code from other classes.
- Reduces development time by enabling the use of existing code.

### 3. **Scalability**
- OOP makes it easier to scale applications as new functionality can be added with minimal impact on existing code.
- The modular design allows for better handling of complex systems.

### 4. **Data Hiding and Security**
- **Encapsulation** ensures sensitive data is hidden and can only be accessed through specified methods.
- Protects the integrity of data by controlling access through modifiers like `private` or `protected`.

### 5. **Maintainability**
- OOP promotes a clear structure, making code easier to understand and maintain.
- Well-organized objects and classes simplify identifying and fixing issues.

### 6. **Flexibility and Polymorphism**
- **Polymorphism** allows the same interface to represent different underlying forms, enabling dynamic behavior.
- Increases flexibility by enabling code to handle a wide range of object types.

### 7. **Real-World Modeling**
- OOP reflects real-world entities through objects, making the design intuitive and relatable.
- Simplifies problem-solving by mapping solutions to real-world scenarios.

### 8. **Abstraction**
- Focuses on the essential features of an object while hiding implementation details.
- Reduces complexity and improves code clarity.

### 9. **Improved Productivity**
- Features like reusability, modularity, and ease of debugging increase developer productivity.
- Faster application development cycle due to reduced code duplication.

### 10. **Rich Libraries and Frameworks**
- OOP concepts in Java enable robust libraries (e.g., Java Collections Framework) and frameworks (e.g., Spring, Hibernate).
- Simplifies the development process by providing pre-built components.

---

# Summary Table: OOP Principles in Java

The four fundamental principles of Object-Oriented Programming (OOP) in Java ensure better structure, maintainability, and scalability of code. Below is a summary table of these principles:

| **OOP Principle**   | **Description**                                                                                  | **Key Features**                                                                 |
|----------------------|--------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------|
| **Encapsulation**    | Wrapping data (variables) and methods into a single unit (class) and restricting access to them. | - Protects sensitive data. <br> - Controlled access through getter and setter methods. |
| **Inheritance**      | Allows one class (child) to inherit properties and behavior from another class (parent).         | - Promotes code reuse. <br> - Establishes "is-a" relationships.                 |
| **Polymorphism**     | Allows one interface to represent different underlying forms (data types or methods).            | - Achieved through method overloading and overriding. <br> - Enables dynamic behavior. |
| **Abstraction**      | Hides implementation details and only shows the essential features of an object.                | - Achieved using abstract classes and interfaces. <br> - Reduces complexity.    |

---
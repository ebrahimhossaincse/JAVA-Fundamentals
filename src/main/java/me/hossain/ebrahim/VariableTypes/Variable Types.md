# Variable Types in Java

In Java, variables are categorized based on their scope and usage into three types: **local variables**, **instance variables**, and **static variables**. Each type has its unique behavior and purpose.

---

## 1. **Local Variables**
Local variables are defined within methods, constructors, or blocks. They are created when the method is called and destroyed once it exits.

| Feature                  | Description                             |
|--------------------------|-----------------------------------------|
| **Scope**                | Limited to the block where declared.   |
| **Default Initialization** | No default value; must be initialized. |

#### Example:
```java
public class Main {
    public static void main(String[] args) {
        int localVar = 10; // Local variable
        System.out.println("Local Variable: " + localVar);
    }
}
```
## 2. **Instance Variables**

Instance variables are defined within a class but outside any method, constructor, or block. They are tied to a specific instance of a class and represent the state or properties of that object.

| Feature                  | Description                              |
|--------------------------|------------------------------------------|
| **Scope**                | Associated with the object instance.    |
| **Default Initialization** | Automatically initialized with default values based on the data type (e.g., `0` for integers, `null` for objects). |
| **Access**               | Accessed through an object of the class. |

---

### Characteristics:
1. **Belongs to an object**: Each object of the class has its copy of the instance variables.
2. **Lifetime**: Exists as long as the object exists.
3. **Default values**: Automatically initialized with default values if not explicitly assigned.

---

### Example:
```java
class Car {
    String brand; // Instance variable

    public void displayBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();       // Creating an object
        myCar.brand = "Toyota";      // Assigning value to the instance variable
        myCar.displayBrand();        // Output: Car Brand: Toyota
    }
}
```
## 3. **Static Variables**

Static variables are declared with the `static` keyword inside a class but outside any method, constructor, or block. These variables belong to the class itself rather than any specific instance, meaning they are shared among all objects of the class.

| Feature                  | Description                              |
|--------------------------|------------------------------------------|
| **Scope**                | Shared across all instances of the class. |
| **Default Initialization** | Automatically initialized with default values based on the data type. |
| **Access**               | Can be accessed using the class name or an object of the class. |

---

### Characteristics:
1. **Class-level variable**: Shared by all instances of the class.
2. **Lifetime**: Exists as long as the class is loaded into memory.
3. **Efficient memory use**: Since the variable is shared, only one copy is created regardless of the number of objects.

---

### Example:
```java
class Car {
    static int wheels = 4; // Static variable

    public static void displayWheels() {
        System.out.println("Number of wheels: " + wheels);
    }
}

public class Main {
    public static void main(String[] args) {
        Car.displayWheels(); // Accessing static variable directly through the class
        Car myCar = new Car();
        System.out.println("Wheels: " + myCar.wheels); // Accessing via object (not recommended)
    }
}
```
## Summary Table: Variable Types in Java

This table provides a concise overview of the three types of variables in Java: **local variables**, **instance variables**, and **static variables**.

| Variable Type       | Declared In                       | Default Value            | Scope                     | Lifetime                 | Example Usage            |
|---------------------|-----------------------------------|--------------------------|---------------------------|--------------------------|--------------------------|
| **Local Variable**  | Inside a method, constructor, or block | None (must be initialized) | Limited to the block where declared | Exists during method/block execution | `int x = 10;`            |
| **Instance Variable** | Inside a class but outside methods | Default values based on data type (e.g., `0`, `null`) | Associated with an object instance | Exists as long as the object exists | `String name;`           |
| **Static Variable** | Inside a class with the `static` keyword | Default values based on data type (e.g., `0`, `null`) | Shared across all instances of the class | Exists as long as the class is loaded into memory | `static int count;`      |

---

### Key Differences:

1. **Scope**:
    - Local: Limited to the block in which it is defined.
    - Instance: Tied to a specific object.
    - Static: Shared across all objects of the class.

2. **Default Initialization**:
    - Local: Must be explicitly initialized.
    - Instance: Automatically initialized with default values.
    - Static: Automatically initialized with default values.

3. **Access**:
    - Local: Directly within the block where defined.
    - Instance: Through an object of the class.
    - Static: Preferred via the class name, though objects can also access it.

---

### Example Comparison:
```java
class VariableTypes {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    public void demonstrateVariables() {
        int localVar = 30; // Local variable
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();
        obj.demonstrateVariables();

        // Access static variable directly
        System.out.println("Access Static Variable: " + VariableTypes.staticVar);
    }
}
```
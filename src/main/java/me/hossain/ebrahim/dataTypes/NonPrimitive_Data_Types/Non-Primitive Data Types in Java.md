# Non-Primitive Data Types in Java

In Java, **non-primitive data types** are more complex than primitive types and include objects and arrays. Unlike primitive types, these are **reference types**, meaning they store references to memory locations instead of actual values.

---

## Categories of Non-Primitive Data Types

### 1. **Strings**
Used to store sequences of characters. Strings are immutable, meaning their value cannot be changed once created.

| Type     | Example                     | Description                       |
|----------|-----------------------------|-----------------------------------|
| `String` | `String greeting = "Hello";` | Represents a sequence of characters. |

#### Example:
```java
String name = "Java";
System.out.println("Hello, " + name);
```

## 2. **Arrays**
Used to store multiple values of the same type in a single variable.

| Type  | Example                       | Description                   |
|-------|-------------------------------|-------------------------------|
| Array | `int[] numbers = {1, 2, 3, 4};` | A collection of similar data. |

#### Example:
```java
int[] numbers = {10, 20, 30};
System.out.println("First number: " + numbers[0]);
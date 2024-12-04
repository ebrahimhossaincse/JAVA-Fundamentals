# Loops in Java

Loops in Java are used to execute a block of code repeatedly as long as a specified condition is met. Java provides several types of loops:

---

## 1. **For Loop**
The **for loop** is used to repeat a block of code for a fixed number of iterations.

**Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // Code to execute
}
```

# 2. While Loop

The **while loop** in Java is used to repeatedly execute a block of code as long as a specified condition evaluates to `true`. It is particularly useful when the number of iterations is not known beforehand and depends on dynamic conditions.

---

## Syntax
```java
while (condition) {
    // Code to execute
}
```
# 3. Do-While Loop

The **do-while loop** in Java is a control flow statement that executes a block of code **at least once** before checking the condition. This is because the condition is evaluated after the block of code has executed.

---

## Syntax
```java
do {
    // Code to execute
} while (condition);
```

# 4. Enhanced For Loop (For-Each Loop)

The **Enhanced For Loop**, also known as the **For-Each Loop**, is a simplified version of the `for` loop in Java. It is primarily used to iterate over arrays or collections, making the code more readable and less error-prone.

---

## Syntax
```java
for (dataType element : arrayOrCollection) {
    // Code to execute for each element
}
```
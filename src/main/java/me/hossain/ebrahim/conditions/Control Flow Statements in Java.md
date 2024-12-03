# Decision-Making Statements
Used to execute a block of code conditionally.

#### **1.1. if Statement**
Executes a block of code if the condition evaluates to `true`.

**Syntax:**
```java
if (condition) {
    // Code to execute if condition is true
}
```

### 1.2. if-else Statement

The **if-else statement** allows you to execute one block of code if a condition evaluates to `true`, and another block if the condition evaluates to `false`.

---

**Syntax:**
```java
if (condition) {
    // Code to execute if condition is true
} else {
    // Code to execute if condition is false
}
```

### 1.3. if-else-if Ladder

The **if-else-if ladder** is used to test multiple conditions sequentially. If one condition is met, its corresponding block of code is executed, and the rest are skipped.

---

**Syntax:**
```java
if (condition1) {
    // Code to execute if condition1 is true
} else if (condition2) {
    // Code to execute if condition2 is true
} else if (condition3) {
    // Code to execute if condition3 is true
} else {
    // Code to execute if none of the above conditions are true
}
```
### 1.4. switch Statement

The **switch statement** is used to execute one block of code from multiple options based on the value of an expression.

---

**Syntax:**
```java
switch (expression) {
    case value1:
        // Code to execute if expression equals value1
        break;
    case value2:
        // Code to execute if expression equals value2
        break;
    // Additional cases can be added here
    default:
        // Code to execute if none of the cases match
}
```
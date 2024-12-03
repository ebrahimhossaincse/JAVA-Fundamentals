# Operators in Java

Operators in Java are special symbols or keywords that perform operations on variables and values. They are used to manipulate data and variables in various ways. Java operators can be categorized into several types based on their functionality.

---

## Categories of Operators in Java

### 1. **Arithmetic Operators**
These operators are used to perform mathematical operations like addition, subtraction, multiplication, division, and modulus.

| Operator | Description        | Example     |
|----------|--------------------|-------------|
| `+`      | Addition           | `a + b`     |
| `-`      | Subtraction        | `a - b`     |
| `*`      | Multiplication     | `a * b`     |
| `/`      | Division           | `a / b`     |
| `%`      | Modulus (Remainder)| `a % b`     |

## 2. Relational Operators

Relational operators are used to compare two values and return a boolean result: `true` or `false`. These operators are commonly used in conditional statements like `if` and `while` to check whether a condition is met.

---

### List of Relational Operators

| Operator | Description             | Example       |
|----------|-------------------------|---------------|
| `==`     | Equal to                | `a == b`      |
| `!=`     | Not equal to            | `a != b`      |
| `>`      | Greater than            | `a > b`       |
| `<`      | Less than               | `a < b`       |
| `>=`     | Greater than or equal to| `a >= b`      |
| `<=`     | Less than or equal to   | `a <= b`      |

---
## 3. Logical Operators

Logical operators are used to combine multiple boolean expressions or conditions. They help in performing logical operations such as checking whether multiple conditions are true or false. These operators return a boolean result (`true` or `false`).

---

### List of Logical Operators

| Operator | Description        | Example       |
|----------|--------------------|---------------|
| `&&`     | Logical AND        | `a && b`      |
| `||`     | Logical OR         | `a || b`      |
| `!`      | Logical NOT        | `!a`          |

---

## 4. Assignment Operators

Assignment operators are used to assign values to variables. The most common assignment operator is `=`, but there are several compound assignment operators that combine assignment with another operation.

---

### List of Assignment Operators

| Operator | Description                   | Example       |
|----------|-------------------------------|---------------|
| `=`      | Simple assignment             | `a = b`       |
| `+=`     | Add and assign                | `a += b`      |
| `-=`     | Subtract and assign           | `a -= b`      |
| `*=`     | Multiply and assign           | `a *= b`      |
| `/=`     | Divide and assign             | `a /= b`      |
| `%=`     | Modulo and assign             | `a %= b`      |

---

## 5. Unary Operators

Unary operators are used to perform operations on a single operand. These operators can modify the value of the operand or return a value based on the operand without requiring another value to operate on.

---

### List of Unary Operators

| Operator | Description                    | Example       |
|----------|--------------------------------|---------------|
| `+`      | Unary plus (indicates positive) | `+a`          |
| `-`      | Unary minus (negates value)    | `-a`          |
| `++`     | Increment (adds 1)             | `a++`         |
| `--`     | Decrement (subtracts 1)        | `a--`         |
| `!`      | Logical NOT                    | `!a`          |

---

## 6. Bitwise Operators

Bitwise operators are used to perform operations on individual bits of integer values. These operators work on binary representations of numbers and allow manipulation at the bit level.

---

### List of Bitwise Operators

| Operator | Description               | Example       |
|----------|---------------------------|---------------|
| `&`      | Bitwise AND               | `a & b`       |
| `|`      | Bitwise OR                | `a | b`       |
| `^`      | Bitwise XOR               | `a ^ b`       |
| `~`      | Bitwise NOT               | `~a`          |
| `<<`     | Left shift                | `a << 2`      |
| `>>`     | Right shift               | `a >> 2`      |
| `>>>`    | Unsigned right shift      | `a >>> 2`     |

---

## 7. Ternary Operator

The ternary operator is a shorthand for an `if-else` statement. It evaluates a boolean condition and returns one of two values based on whether the condition is true or false.

---

### Syntax:

```java
condition ? value_if_true : value_if_false;
```

## 8. Instanceof Operator

The `instanceof` operator is used to check whether an object is an instance of a specific class or implements an interface. It returns a boolean value (`true` or `false`) based on the type of the object.

---

### Syntax:

```java
object instanceof ClassName
```
# Primitive Data Types in Java

In Java, **primitive data types** are the building blocks for data manipulation. These are predefined by the language and are not objects, making them efficient and lightweight.

---

## Categories of Primitive Data Types

### 1. **Numeric Data Types**
Used for storing numbers, both integers and floating-point values.

| Type       | Size       | Range                                     | Default Value | Example Usage            |
|------------|------------|-------------------------------------------|---------------|--------------------------|
| `byte`     | 1 byte     | -128 to 127                               | `0`           | Memory-efficient counters|
| `short`    | 2 bytes    | -32,768 to 32,767                         | `0`           | Small integers           |
| `int`      | 4 bytes    | -2^31 to 2^31-1                           | `0`           | General-purpose numbers  |
| `long`     | 8 bytes    | -2^63 to 2^63-1                           | `0L`          | Large integers           |
| `float`    | 4 bytes    | ~3.4028235E38 to ~1.4E-45 (7 decimal digits) | `0.0f`       | Decimal precision (less) |
| `double`   | 8 bytes    | ~1.7976931348623157E308 to ~4.9E-324 (15 decimal digits) | `0.0d` | Decimal precision (high) |

---

### 2. **Character Data Type**
Used for storing single characters.

| Type       | Size       | Range                     | Default Value | Example Usage    |
|------------|------------|---------------------------|---------------|------------------|
| `char`     | 2 bytes    | 0 to 65,535 (Unicode)     | `\u0000`      | Single characters |

---

### 3. **Boolean Data Type**
Used for storing logical values: `true` or `false`.

| Type       | Size       | Possible Values | Default Value | Example Usage      |
|------------|------------|-----------------|---------------|--------------------|
| `boolean`  | 1 bit      | `true` or `false` | `false`     | Conditional checks |

---

## Key Points
1. **Default Values**: When primitive types are declared as instance variables but not initialized, they are assigned default values (e.g., `int` is `0`, `boolean` is `false`). Local variables must be explicitly initialized.
2. **Efficiency**: Primitive data types are faster and more memory-efficient compared to objects.
3. **Type Casting**:
    - Implicit casting is allowed when moving from a smaller type to a larger type (e.g., `int` to `long`).
    - Explicit casting is required when moving from a larger type to a smaller type (e.g., `double` to `int`).

---

## Example Code
```java
public class PrimitiveTypes {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 30000;
        int intValue = 123456;
        long longValue = 123456789L;
        float floatValue = 3.14f;
        double doubleValue = 3.14159265359;
        char charValue = 'A';
        boolean booleanValue = true;

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + booleanValue);
    }
}

# Vector in Java

A **Vector** is a dynamic array that grows as needed to accommodate new elements. It is similar to `ArrayList` but with a key difference: **`Vector` is synchronized**, meaning it is thread-safe. While `ArrayList` is generally preferred in most scenarios due to its better performance, `Vector` can be used in cases where thread-safety is required.

### **Key Features of Vector**
- **Thread-Safety**: `Vector` is synchronized, making it thread-safe for use in multi-threaded environments. However, this synchronization comes with performance overhead, making it slower than other list implementations like `ArrayList` in single-threaded environments.
- **Resizable Array**: Like `ArrayList`, `Vector` automatically resizes itself when the number of elements exceeds its current capacity.
- **Capacity and Growth**: The default capacity of a `Vector` is 10 elements. If the vector exceeds its capacity, it grows by doubling its size.
- **Allows Null Elements**: `Vector` allows the inclusion of null elements.

---

### **Vector Methods**

In addition to the common methods defined by the `List` interface, `Vector` includes some specific methods:
- **ensureCapacity(int minCapacity)**: Ensures that the `Vector` can hold at least `minCapacity` elements without resizing.
- **capacity()**: Returns the current capacity of the vector.
- **trimToSize()**: Reduces the size of the vector to the number of elements it contains, freeing up unused memory.
- **setSize(int newSize)**: Changes the size of the vector, truncating it or expanding it to the specified size.

---

### **Example of Vector Usage**

```java
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        List<String> fruits = new Vector<>();
        
        // Adding elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        // Ensuring capacity for at least 20 elements
        ((Vector<String>) fruits).ensureCapacity(20);
        
        // Getting the current capacity of the Vector
        System.out.println("Current capacity: " + ((Vector<String>) fruits).capacity());
        
        // Accessing elements by index
        System.out.println("First fruit: " + fruits.get(0));  // Output: Apple

        // Removing an element
        fruits.remove("Banana");  // Removes the first occurrence of "Banana"
        
        // Displaying the modified Vector
        System.out.println("Vector after removal: " + fruits);
        
        // Iterating over the Vector using a for-each loop
        System.out.println("Fruits in the Vector:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Trimming the size to fit the current elements
        ((Vector<String>) fruits).trimToSize();
        System.out.println("Vector after trimming size: " + fruits);
    }
}
```
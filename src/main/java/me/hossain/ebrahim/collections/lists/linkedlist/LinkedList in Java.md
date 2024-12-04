# LinkedList in Java

A **LinkedList** is a collection that implements the `List` interface and is based on a doubly linked list data structure. In a doubly linked list, each element (node) contains a reference to the next and previous elements, allowing for efficient insertion and removal of elements from both ends and the middle of the list.

### **Key Features of LinkedList**
- **Efficient Insertions/Removals**: LinkedList provides fast insertion and removal operations at both ends of the list (head and tail), and even in the middle, as it doesn't require shifting elements like `ArrayList`.
- **Slower Random Access**: Accessing elements by index is slower compared to `ArrayList` because it requires traversing the list from the beginning or end to reach the desired position.
- **Allows Null Elements**: Like other implementations of `List`, `LinkedList` allows null elements.

---

### **LinkedList Methods**

Apart from the common methods provided by the `List` interface, `LinkedList` also includes some additional methods that are specific to it, such as:
- **addFirst(E e)**: Adds the specified element at the beginning of the list.
- **addLast(E e)**: Adds the specified element at the end of the list.
- **removeFirst()**: Removes and returns the first element from the list.
- **removeLast()**: Removes and returns the last element from the list.
- **getFirst()**: Retrieves, but does not remove, the first element of the list.
- **getLast()**: Retrieves, but does not remove, the last element of the list.

---

### **Example of LinkedList Usage**

```java
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        
        // Adding elements to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Adding an element at the first and last position
        names.addFirst("Zoe");
        names.addLast("David");
        
        // Removing elements
        names.remove("Bob"); // Removes the first occurrence of "Bob"
        names.removeFirst();  // Removes the first element
        names.removeLast();   // Removes the last element
        
        // Display the modified list
        System.out.println("Modified LinkedList: " + names);
        
        // Accessing elements by index
        System.out.println("Element at index 1: " + names.get(1));
        
        // Iterating over the LinkedList using a for-each loop
        System.out.println("LinkedList elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
```
# Java Collections Framework (JCF)

The **Java Collections Framework (JCF)** is a set of classes and interfaces that implement commonly reusable data structures and algorithms in Java. It provides a unified architecture for storing and manipulating groups of objects.

---

## **Key Components of JCF**

### **1. Interfaces**
The core interfaces define the standard functionality of collections.

| Interface       | Description                                                                 |
|-----------------|-----------------------------------------------------------------------------|
| **Collection**  | Root interface for most collections.                                       |
| **List**        | Ordered collection (e.g., `ArrayList`, `LinkedList`).                     |
| **Set**         | Unordered collection with no duplicate elements (e.g., `HashSet`, `TreeSet`). |
| **Queue**       | Ordered collection designed for holding elements prior to processing (e.g., `PriorityQueue`, `LinkedList`). |
| **Map**         | Stores key-value pairs (e.g., `HashMap`, `TreeMap`).                      |

---

### **2. Classes**
The framework provides implementations of these interfaces.

| Class             | Implements      | Description                                   |
|-------------------|-----------------|-----------------------------------------------|
| **ArrayList**     | List            | Dynamic array-based list.                    |
| **LinkedList**    | List, Queue     | Doubly-linked list implementation.           |
| **HashSet**       | Set             | Hash table-based implementation of `Set`.    |
| **TreeSet**       | Set             | Sorted set implementation using a tree.      |
| **HashMap**       | Map             | Hash table-based key-value storage.          |
| **TreeMap**       | Map             | Sorted key-value storage using a tree.       |
| **PriorityQueue** | Queue           | Queue with elements ordered by priority.     |
| **Stack**         | List            | Last-In-First-Out (LIFO) stack.              |
| **Vector**        | List            | Synchronized dynamic array.                  |

---

### **3. Common Methods**
- **Add/Remove Elements**:
    - `add(E e)`, `remove(Object o)`, `clear()`.
- **Search Elements**:
    - `contains(Object o)`, `isEmpty()`, `size()`.
- **Traversal**:
    - Using **Iterator**, **for-each loop**, or **Stream API**.

---

### **4. Hierarchy of Collections Framework**

### **Explanation**
- **Collection**: The root interface for all collection types, divided into subtypes:
    - **List**: Maintains order and allows duplicates.
        - `ArrayList`: Resizable array implementation.
        - `LinkedList`: Implements a doubly-linked list.
        - `Vector`: Thread-safe implementation, rarely used in modern code.
            - `Stack`: Extends `Vector` to provide LIFO behavior.
    - **Set**: Does not allow duplicate elements.
        - `HashSet`: Unordered set implementation.
        - `LinkedHashSet`: Maintains insertion order.
        - **`SortedSet`**: Interface for sorted collections.
            - `TreeSet`: Maintains elements in a sorted order.
    - **Queue**: Follows FIFO (First-In-First-Out) or priority-based ordering.
        - `PriorityQueue`: Priority-based queue.
        - `LinkedList`: Can also act as a queue.
        - **Deque**: Interface for double-ended queues.
            - `ArrayDeque`: Implements a resizable array for deque functionality.

- **Map**: Stores key-value pairs, with various implementations:
    - `HashMap`: Unordered key-value mapping.
    - `LinkedHashMap`: Maintains insertion order.
    - `WeakHashMap`: Entries are garbage-collected when no strong references exist.
    - `IdentityHashMap`: Keys are compared using reference equality (`==`).
    - **`SortedMap`**: Interface for sorted key-value pairs.
        - `TreeMap`: Maintains keys in a sorted order.
    - `Hashtable`: Legacy thread-safe implementation.
        - `Properties`: Subclass of `Hashtable` for configuration key-value pairs.


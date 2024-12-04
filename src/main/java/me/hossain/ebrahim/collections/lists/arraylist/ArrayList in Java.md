# ArrayList in Java

- **Description**: Resizable array implementation of the `List` interface.
- **Features**:
    - Fast random access to elements.
    - Slower at adding/removing elements in the middle or start of the list, as it needs to shift elements.
- **Usage**: Ideal when the list will primarily be used for access to elements by index.
- **Example**:
  ```java
  import java.util.*;

  public class ArrayListExample {
      public static void main(String[] args) {
          List<String> names = new ArrayList<>();
          names.add("Alice");
          names.add("Bob");
          names.add("Charlie");
          
          System.out.println("ArrayList: " + names);
      }
  }
```
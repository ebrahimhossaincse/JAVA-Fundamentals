package me.hossain.ebrahim.collections.lists.arraylist;

import java.util.*;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana");

        // Access elements by index
        System.out.println("First fruit: " + fruits.get(0));  // Output: Apple

        // Find the index of an element
        System.out.println("Index of Banana: " + fruits.indexOf("Banana"));  // Output: 1

        // Remove an element
        fruits.remove("Banana");  // Removes first occurrence
        System.out.println("List after removal: " + fruits);

        // Get the size of the list
        System.out.println("Size of list: " + fruits.size());  // Output: 3

        // Check if the list contains an element
        System.out.println("Contains 'Cherry': " + fruits.contains("Cherry"));  // Output: true

        // Iterate through the list using for-each loop
        System.out.println("Fruits list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

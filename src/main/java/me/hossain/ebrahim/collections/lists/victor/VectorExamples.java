package me.hossain.ebrahim.collections.lists.victor;
import java.util.*;

public class VectorExamples {
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

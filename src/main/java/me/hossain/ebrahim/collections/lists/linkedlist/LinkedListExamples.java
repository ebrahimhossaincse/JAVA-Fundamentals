package me.hossain.ebrahim.collections.lists.linkedlist;

import java.util.*;

public class LinkedListExamples {
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
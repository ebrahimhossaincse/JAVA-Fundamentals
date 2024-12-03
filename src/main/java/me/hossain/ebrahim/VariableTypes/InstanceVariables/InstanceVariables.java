package me.hossain.ebrahim.VariableTypes.InstanceVariables;

public class InstanceVariables {

    String name; // Instance variable
    long number; // Instance variable

    public static void main(String[] args) {
        // Create an object of the class
        InstanceVariables instanceVariables = new InstanceVariables();

        // Assign values to the instance variables through the object
        instanceVariables.name = "Ebrahim Hossain";
        instanceVariables.number = 1234;

        // Print the values of instance variables
        System.out.println("Print Instance Variables");
        System.out.println("Name : " + instanceVariables.name);
        System.out.println("Number : " + instanceVariables.number);
    }
}


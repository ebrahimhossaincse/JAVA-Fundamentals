package me.hossain.ebrahim.operators;

public class InstanceofOperator {

    /*
     * Example of Instanceof Operator
     */
    public static void checkInstanceof() {
        String str = "Hello, World!";

        // Checking if str is an instance of String
        if (str instanceof String) {
            System.out.println("str is an instance of String");
        } else {
            System.out.println("str is not an instance of String");
        }

        // Checking if str is an instance of Object (all classes are derived from Object)
        if (str instanceof Object) {
            System.out.println("str is an instance of Object");
        }
    }

    public static void main(String[] args) {
        checkInstanceof();
    }
}

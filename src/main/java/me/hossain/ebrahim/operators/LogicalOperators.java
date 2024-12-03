package me.hossain.ebrahim.operators;

public class LogicalOperators {

    /*
     * Logical AND (&&)
     */
    public static void logicalANDExample() {
        boolean a = true, b = false;
        System.out.println("Logical AND (&&): " + (a && b));
    }

    /*
     * Logical OR (||)
     */
    public static void logicalORExample() {
        boolean a = true, b = false;
        System.out.println("Logical OR (||): " + (a || b));
    }

    /*
     * Logical NOT (!)
     */
    public static void logicalNOTExample() {
        boolean a = true;
        System.out.println("Logical NOT (!): " + (!a));
    }

    public static void main(String[] args) {
        logicalANDExample();
        logicalORExample();
        logicalNOTExample();
    }

}

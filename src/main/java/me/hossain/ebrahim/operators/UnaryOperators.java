package me.hossain.ebrahim.operators;

public class UnaryOperators {
    /*
     * Unary Minus
     */
    public static void unaryMinus() {
        int val1 = 10, val2 = 20, val3, val5;

        val3 = val1 + val2;
        val5 = -val3;
        System.out.println("Unary Minus Result: " + val5);
    }

    /*
     * Unary Not Operator (!)
     */
    public static void unaryNotOperator() {
        int val1 = 10, val2 = 20, val3, val5;

        val3 = val1 + val2;
        val5 = val3;
        System.out.println("Unary Not Operator Result: " + (!(val5 == val2)));
    }

    /*
     * Increment (++)
     */
    public static void increment() {
        int val1 = 10, val2 = 20, val3, val5;

        val3 = val1 + val2;
        val5 = val3;
        System.out.println("Increment Result: " + val5++);
    }

    /*
     * Pre-Increment Operator
     */
    public static void preIncrementOperator() {
        int val1 = 10, val2 = 20, val3, val5;

        val3 = val1 + val2;
        val5 = val3;
        System.out.println("Pre-Increment Operator Result: " + (++val5));
    }

    /*
     * Decrement (--)
     */
    public static void decrement() {
        int val1 = 10, val2 = 20, val3, val5;

        val3 = val1 + val2;
        val5 = val3;
        System.out.println("Decrement Result: " + (val5--));
    }

    /*
     * Pre-Decrement Operator
     */
    public static void preDecrementOperator() {
        int val1 = 10, val2 = 20, val3, val5;

        val3 = val1 + val2;
        val5 = val3;
        System.out.println("Pre-Decrement Operator: "+(--val5));
    }

    public static void main(String[] args) {
        unaryMinus();
        unaryNotOperator();
        increment();
        preIncrementOperator();
        decrement();
        preDecrementOperator();
    }
}

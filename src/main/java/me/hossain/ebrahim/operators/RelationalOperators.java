package me.hossain.ebrahim.operators;

public class RelationalOperators {
    /*
     * Equal Operator (==)
     */
    public static void equalOperatorExample() {
        int val1 = 10, val2 = 10;

        if (val1 == val2) {
            System.out.println("Equal Operator (==): True");
        } else {
            System.out.println("Equal Operator (==): False");
        }
    }

    /*
     * Not Equal Operator (!=)
     */
    public static void notEqualOperatorExample() {
        int val1 = 10, val2 = 20;

        if (val1 != val2) {
            System.out.println("Not Equal Operator (!=): True");
        } else {
            System.out.println("Not Equal Operator (!=): False");
        }
    }

    /*
     * Greater Than Operator (>)
     */
    public static void greaterThanExample() {
        int val1 = 10, val2 = 20;

        if (val2 > val1) {
            System.out.println("Greater Than Operator (>): True");
        } else {
            System.out.println("Greater Than Operator (>): False");
        }
    }

    /*
     * Lesser Than Operator (<)
     */
    public static void lessThanExample() {
        int val1 = 10, val2 = 20;

        if (val1 < val2) {
            System.out.println("Lesser Than Operator (<): True");
        } else {
            System.out.println("Lesser Than Operator (<): False");
        }
    }

    /*
     * Greater Than Or Equal Operator (>=)
     */
    public static void greaterThanOrEqualExample() {
        int val1 = 10, val2 = 20;

        if (val2 >= val1) {
            System.out.println("Greater Than or Equal Operator (>=): True");
        } else {
            System.out.println("Greater Than or Equal Operator (>=): False");
        }
    }


    /*
     * Lesser Than Or Equal To Relational Operator (<=)
     */
    public static void lessThanOrEqualExample() {
        int val1 = 10, val2 = 20;

        if (val1 <= val2) {
            System.out.println("Lesser Than or Equal To Operator (<=): True");
        } else {
            System.out.println("Lesser Than or Equal To Operator (<=): False");
        }
    }

    public static void main(String[] args) {
        equalOperatorExample();
        notEqualOperatorExample();
        greaterThanExample();
        lessThanExample();
        greaterThanOrEqualExample();
        lessThanOrEqualExample();
    }
}
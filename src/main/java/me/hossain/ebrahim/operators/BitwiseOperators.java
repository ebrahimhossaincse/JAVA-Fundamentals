package me.hossain.ebrahim.operators;

public class BitwiseOperators {

    /*
     * Bitwise AND (&)
     */
    public static void bitwiseAND() {
        int value1 = 15, value2 = 26, value5;
        value5 = value1 & value2;
        System.out.println("Bitwise AND (&) Output: " + value5);
    }

    /*
     * Bitwise OR (|)
     */
    public static void bitwiseOR() {
        int value1 = 15, value2 = 26, value5;
        value5 = value1 | value2;
        System.out.println("Bitwise OR (|) Output: " + value5);
    }

    /*
     * Bitwise XOR (^)
     */
    public static void bitwiseXOR() {
        int value1 = 15, value2 = 26, value5;
        value5 = value1 ^ value2;
        System.out.println("Bitwise XOR (^) Output: " + value5);
    }

    /*
     * Bitwise Complement (~)
     */
    public static void bitwiseComplement() {
        int value1 = 15, value5;
        value5 = ~value1;
        System.out.println("Bitwise Complement (~) Output: " + value5);
    }

    public static void main(String[] args) {
        bitwiseAND();
        bitwiseOR();
        bitwiseXOR();
        bitwiseComplement();
    }

}

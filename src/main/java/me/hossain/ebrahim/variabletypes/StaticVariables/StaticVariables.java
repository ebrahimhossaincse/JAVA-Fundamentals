package me.hossain.ebrahim.variabletypes.StaticVariables;

public class StaticVariables {

    static String name;
    static long number;

    public static void main(String[] args) {
        name = "Ebrahim Hossain";
        number = 1234;
        System.out.println("Print Static Variables");
        System.out.println("Name : " + name);
        System.out.println("Number : " + number);
    }
}

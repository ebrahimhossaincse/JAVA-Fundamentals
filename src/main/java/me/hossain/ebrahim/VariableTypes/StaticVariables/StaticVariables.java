package me.hossain.ebrahim.VariableTypes.StaticVariables;

public class StaticVariables {

    static String name_static;
    static long number;

    public static void main(String[] args) {
        name_static = "Ebrahim Hossain";
        number = 1234;
        System.out.println("Print Static Variables");
        System.out.println("Name : " + name_static);
        System.out.println("Number : " + number);
    }
}

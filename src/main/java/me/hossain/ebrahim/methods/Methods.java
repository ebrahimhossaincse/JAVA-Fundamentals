package me.hossain.ebrahim.methods;

public class Methods {
    /*
     * Static Method
     */
    public static void staticMethod() {
        System.out.println("Static Method");
    }

    /*
     * Non Static Method
     */
    public static void nonStaticMethod() {
        System.out.println("Non Static Method");
    }

    /*
     * Method with Parameter
     */
    public static void parameterizedMethod(String name) {
        System.out.println("Your name is "+name);
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        // Calling static method
        staticMethod();

        // calling non static method
        Methods methods = new Methods();
        methods.nonStaticMethod();

        parameterizedMethod("Ebrahim Hossain");
    }
}

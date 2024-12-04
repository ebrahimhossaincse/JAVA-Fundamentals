package me.hossain.ebrahim.oop.Polymorphism;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        Shape mySquare = new Square();

        myCircle.draw();
        mySquare.draw();
    }
}

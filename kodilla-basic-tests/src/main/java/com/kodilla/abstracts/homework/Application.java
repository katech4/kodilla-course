package com.kodilla.abstracts.homework;


public class Application {

    public static void main(String[] args) {
        Shape circle = new Circle(3);
        circle.giveArea();
        circle.giveCircumference();

        Shape square = new Square(3);
        square.giveArea();
        square.giveCircumference();

        Shape triangle = new Triangle(1,2,3, 2);
        triangle.giveArea();
        triangle.giveCircumference();

    }
}

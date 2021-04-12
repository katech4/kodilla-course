package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    private double pi = 3.14;
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void giveArea() {
        System.out.println("Pole:" + pi * r * r);
    }

    @Override
    public void giveCircumference() {
        System.out.println("Obwód:"+ 2*pi * r);

    }
}

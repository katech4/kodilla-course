package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int kol;

    public Shape(int kol) {
        this.kol = kol;
    }

    public abstract void giveArea();

    public abstract void giveCircumference();
}

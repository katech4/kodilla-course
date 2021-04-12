package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private int aa;
    private int bb;
    private int cc;
    private int h;

    public Triangle (int aa, int bb, int cc, int h){
        this.aa = aa;
        this.bb = bb;
        this.cc = cc;
        this.h = h;
    }

    @Override
    public void giveArea() {
        System.out.println("Pole:" + aa*(h/2) );
    }

    @Override
    public void giveCircumference() {
        System.out.println("Obwód:"+ aa+bb+cc);

    }


}

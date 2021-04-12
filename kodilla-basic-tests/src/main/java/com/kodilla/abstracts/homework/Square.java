package com.kodilla.abstracts.homework;

public class Square extends Shape{
       private int a;

       public Square (int a){
           this.a = a;
       }

    @Override
    public void giveArea() {
        System.out.println("Pole:" + a*a );
    }

    @Override
    public void giveCircumference() {
        System.out.println("Obwód:"+ 4*a);

    }
}

package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

import java.awt.*;

public class CarRace {
    public static void main(String[] args) {
        Citroen citroen = new Citroen(120, 1,1);
        doRace(citroen);

        Toyota toyota = new Toyota (220, 2,1);
        doRace(toyota);

        Mercedes mercedes = new Mercedes(230, 3, 2);
        doRace(mercedes);
    }

    private static void doRace(Car car) {
        System.out.println(car.getSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
    }
}

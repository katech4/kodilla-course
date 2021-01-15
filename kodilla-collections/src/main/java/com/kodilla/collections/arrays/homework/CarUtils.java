package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + getDescribeCar(car));
        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Car increasespeed: " + car.increaseSpeed());
        System.out.println("Car decreasespeed: " +car.decreaseSpeed() );
    }

    private static String getDescribeCar(Car car) {
        if (car instanceof Citroen)
            return "Citroen";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown car name";
    }
}

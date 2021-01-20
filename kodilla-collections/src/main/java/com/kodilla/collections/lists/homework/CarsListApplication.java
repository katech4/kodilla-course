package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> typeCar = new ArrayList<>();
        typeCar.add(new Mercedes(220, 1, 2));
        typeCar.add(new Toyota(220, 2, 2));
        typeCar.add(new Citroen(230, 3, 3));

        for (Car car : typeCar) {
            if (car.getSpeed() > 50 && car.increaseSpeed() > 50 && car.decreaseSpeed() >50)
                System.out.println(typeCar);
        }
    }
}
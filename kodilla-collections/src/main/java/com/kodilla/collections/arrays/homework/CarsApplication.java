package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Citroen;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        // draw a kind of the car
        int drawnCarKind = random.nextInt(3);
        int a = (int) (random.nextDouble() * 100 + 1);
        int b = (int) random.nextDouble() * 100 + 1;
        int c = (int) random.nextDouble() * 100 + 1;
        if (drawnCarKind == 0)
            return new Citroen(a,a,a);
        else if (drawnCarKind == 1)
            return new Toyota(a,a,a);
        else
            return new Mercedes(a, b, c);
    }
}

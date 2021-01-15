package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed;
    private int engine;
    private int brakes;

    public Toyota (int speed, int engine, int brakes){
        this.speed = speed;
        this.engine = engine;
        this.brakes = brakes;
    }

    public int getSpeed() {
        return speed;
    }

    public int increaseSpeed(){
        return speed + engine;
    }

    public int decreaseSpeed(){
        return speed + brakes;
    }
}

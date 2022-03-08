package com.company;

public class Activity1 {
    public static void main(String[] args) {
        Car car = new Car("Black","Manual", 2014);
        car.displayCharacteristics();
        car.accelarate();
        car.brake();
    }
}

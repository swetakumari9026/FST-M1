package com.company;

public class Car {

    private String color;
    private String transmission;
    private int make;
    private int tyres;
    private int doors;

    public Car(String color, String transmission, int make) {
        this.color = color;
        this.transmission = transmission;
        this.make = make;
        this.tyres = 4;
        this.doors = 4;
    }


    public void displayCharacteristics(){
        System.out.println("Color: " + this.color
                + ",Transmission:" + this.transmission
                + ",Make:" + this.make+
                ",Tyres:" +this.tyres+
                ",Doors:" + this.doors);
    }

    public void accelarate(){
        System.out.println("Car is moving forward.");
    }

    public void brake(){
        System.out.println("Car has stopped.");
    }
}

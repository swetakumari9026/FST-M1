package com.company;

interface BicycleParts{
    int gears = 0;
    int speed = 0;
}
interface BicycleOperations{
    int applyBrake(int decrement);
    int speedUp(int increment);
}

class Bicycle implements BicycleParts,BicycleOperations{

    int gears;
    int currentSpeed;

    public Bicycle(int gears,int currentSpeed) {
      this.gears=gears;
      this.currentSpeed = currentSpeed;
    }

    @Override
    public int applyBrake(int decrement) {
      return  this.currentSpeed - decrement;
    }

    @Override
    public int speedUp(int increment) {
        return this.currentSpeed+increment;
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

class  MountainBike extends Bicycle{
    private int seatHeight;

    public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears,currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {

        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}
public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}  

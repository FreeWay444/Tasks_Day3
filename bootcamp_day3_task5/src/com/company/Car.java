package com.company;

public class Car extends Vehicle {
    protected int gear;
    public Car(){
        gear=0;
    }

    public void changing_gears(int i){
        if (i>=1 && i<=6){
            gear=i;
            System.out.println("Gear is set to: "+gear);
        }else {
            System.out.println("Gear is not changed.");
        }
    }

}

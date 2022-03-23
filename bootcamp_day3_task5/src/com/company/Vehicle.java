package com.company;

public class Vehicle {
    protected int speed;
    Vehicle(){
        speed=0;
    }
    public void steering(String value){
        if (value =="right"){
            System.out.println("Turning right.");
        }else if (value =="left") {
            System.out.println("Turning left.");
        } else {
            System.out.println("No turning action.");
        }
    }
    public void drive (int i){
        speed=i;
    }
}

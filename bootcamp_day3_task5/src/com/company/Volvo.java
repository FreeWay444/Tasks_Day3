package com.company;

public class Volvo extends Car{
    private int size;
    private String color;
    private int wheels;
    public Volvo() {
        size=5;
        color="blue";
        wheels=4;
    }
    public void printDetails(){
        System.out.println("Current gear:"+gear);
        System.out.println("Current speed:"+speed);
        System.out.println("Current size:"+size);
        System.out.println("Current color:"+color);
        System.out.println("Current wheels:"+wheels);
    }
}

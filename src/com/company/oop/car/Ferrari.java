package com.company.oop.car;

public class Ferrari extends Car {

    private String color;
    private String model;

    public Ferrari(int numOfTires, String color, String model) {
        super(numOfTires); // stands for parent constructor
        this.color = color;
        this.model = model;
    }


    // Method overriding
    public void startEngine() {
        System.out.println("started");
    }

    public void openWindowDoors() {
        System.out.println("Window doors opened!");
    }

}

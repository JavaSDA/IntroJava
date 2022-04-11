package com.company.oop.car;

public class Bugatti extends Car {

    private String color;
    private String model;

    public Bugatti(int numOfTires, String color, String model) {
        super(numOfTires); // stands for parent constructor
        this.color = color;
        this.model = model;
    }


    // Method overriding
    public void startEngine(boolean key) {
        openWindowDoors();
    }

    public void openWindowDoors() {
        System.out.println("Window doors opened!");
    }

}

package com.company.oop.car;

public class Car {

    // Define the attributes of the object

    private int numOfTires = 4;
    private boolean engineOn = false;

    public Car(int numOfTires) {
        this.numOfTires = numOfTires;
    }

    // define their behaviours
    // start engine
    public void startEngine(boolean key) {
        if (key && !engineOn) {
            System.out.println("Engine Started");
            engineOn = true;
        } else {
            System.out.println("Key not in! Can't start");
        }
    }

    public void stopEngine() {
        if (engineOn) {
            System.out.println("Engine turned off!");
            engineOn = false;
        } else {
            System.out.println("Engine already off!");
        }
    }

}

package com.company;

public class OOPintro {

    // A class is a blueprint for describing an object
    // Car -> Attributes: color, model, numOfTires, numOfSeats. Behavoiour: startEngine, stopEngine, turnRight, turnLeft.

    // fields -> used to define attributes in a Class
    public static void main(String[] args) {
        Car benz = new Car();
        benz.startEngine(false);
        benz.stopEngine();
    }
}

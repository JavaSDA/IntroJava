package com.company.oop;


import com.company.person.Person;

import java.util.Scanner;

public class OOPintro {

    // OOP -> programming paradigm
    // paradigm -> a way of viewing things.

    // Encapsulation
    // This a concept of hiding data and methods from the outside world (Classes outside of the
    // one the data is defined in)
    // This allows us to control what data is given out or received.


    // A class is a blueprint for describing an object
    // Car -> Attributes: color, model, numOfTires, numOfSeats. Behaviour: startEngine, stopEngine, turnRight, turnLeft.
    // Another name for fields is global variable.

    // fields -> used to define attributes in a Class
    public static void main(String[] args) {
//        Car benz = new Car();
//        benz.startEngine(false);
//        benz.stopEngine();
//
//        System.out.println();
//
//        Car bmw = new Car();
//        bmw.startEngine(true);
//        bmw.stopEngine();
        Scanner scanner = new Scanner(System.in);

        Calculator calc = new Calculator();

        Person george = new Person("George", 28);
        Person victoria = new Person("Victoria", 29);


        System.out.println(george.getName());
        System.out.println(victoria.getName());

        victoria.changeAge();
        System.out.println(victoria.getAge());



//        System.out.println(Calculator.add(2, 4));
//        System.out.println(Calculator.divide(3, 8));

        // 20 mins.
        // For the person class we've written today. Write a method that
        // that allows you to find the BMI of a particular person, using what you've learnt
        // today. height should be in meters and the weight should be in kg.

    }
}

package com.company.oop;


import com.company.oop.animal.Bird;
import com.company.oop.car.Bugatti;
import com.company.oop.car.Ferrari;
import com.company.oop.company.Company;
import com.company.oop.company.Employee;
import com.company.person.Person;
import com.company.person.Persons;

import java.util.Scanner;

public class OOPintro {

    // OOP -> programming paradigm
    // paradigm -> a way of viewing things.

    // Encapsulation
    // This a concept of hiding data and methods from the outside world (Classes outside of the
    // one the data is defined in)
    // This allows us to control what data is given out or received.

    // Inheritance
    // This is a mechanism that allows us to share behaviour between classes
    // A class that inherits from another class is called the 'child' or 'sub' class. The class that
    // is inherited from is the 'parent' or 'super' class.

    // Polymorphism
    // The ability of an object to return different responses to the same method call.



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

        victoria.setHeight(1.52f);
        victoria.setWeight(60);


//        System.out.println(george.getName());
//        System.out.println(victoria.getName());
//
//        victoria.changeAge();
//        System.out.println(victoria.getAge());

//        System.out.println(victoria.getBMI());


//        System.out.println(Calculator.add(2, 4));
//        System.out.println(Calculator.divide(3, 8));

        // 20 mins.
        // For the person class we've written today. Write a method that
        // that allows you to find the BMI of a particular person, using what you've learnt
        // today. height should be in meters and the weight should be in kg.

        // 15 mins.
        // Create a new class called Rectangle and in that class, define two properties of a
        // rectangle which are the length and the breadth. Create a constructor to allow instantiation
        // of the rectangles at object creation and also write methods to find the perimeter and area
        // of the rectangle.

        // 25 mins.
        // Write a method that takes an array of 5 Persons as a parameter and then returns
        // the average age of the array of Persons as its output.

//        Person[] people = new Person[] {
//                new Person("George", 22),
//                new Person("Fred", 18),
//                new Person("David", 20),
//        };
//
//        // answer should be 20
////        Persons persons = new Persons(people);
//        System.out.println("Average age: " + getAverageAge(people));
//
//        Ferrari ferrari = new Ferrari(4, "red", "Turbo 3000");

//        ferrari.startEngine(true);
//        ferrari.openWindowDoors();

//        Bugatti bugatti = new Bugatti(4, "red", "Turbo 3000");
//        bugatti.startEngine(true);
//

        // Write two classes:
        // Animal class Fields -> String name, String number of legs,
        // Methods-> sounds it makes, Movement

        // Bird -> fields: color, doesitFly?
        // Methods -> fly(), sing()


        // solution
//        Bird penguin = new Bird("Penguin", 2, "Bleat", "Black and white", false);
//
//        penguin.sing();
//        penguin.fly();


        String google = "Google", microsoft = "Microsoft";

        Company goog = new Company(google);
        Company micro = new Company(microsoft);

        Employee[] googleWorkers = new Employee[] {
                new Employee("Fred", 33, goog),
                new Employee("Rachel", 30, goog),
        };

        Employee[] microsoftWorkers = new Employee[] {
                new Employee("George", 28, micro),
                new Employee("Victoria", 31, micro),
        };


        goog.setEmployees(googleWorkers);
        micro.setEmployees(microsoftWorkers);

        System.out.println(googleWorkers[0].getCompany().getCompanyName());

        System.out.println(googleWorkers[0].getCompany().getEmployees().length);


        System.out.println(goog.getAverageAge());
        System.out.println(micro.getAverageAge());


        // inheritance has a "is-a" relationship
        // composition is more of a "has-a" relationship

    }

    // Home Task. Create a class called Person(Parent class). They should have:
    //name, age.
    //Create a class called Employee(Child class). This class should inherit
    // the Person class. and should have the extra fields:
    //company id, company name.
    //Create a class called Company. This class should take in employees as
    //an array attribute,  and have a name.
    //In your main method, Populate a company’s employees attribute and find the average
    // age of the employees.

    public static float getAverageAge(Person[] people) {
        float sum = 0; // initialize the sum variable to zero
        // for-each loop
        for(Person person : people) {
            // person == person[i]
            sum += person.getAge();
        }

        return sum / people.length;
    }

}

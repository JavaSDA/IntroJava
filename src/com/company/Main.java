package com.company;

public class Main {

    public static void main(String[] args) {
	    // What is Java?
        // Java is an object-oriented programming language that allows us to model
        // real life functionality as objects in our code.

        // Features of Java
        // Java is a strictly-typed language
        // Java is also a compiled language, it is turned into 'bytecode'
        // Java is a high-level language.
        // Java is run on the JVM(Java Virtual Machine).
        // The JVM creates platform-independence for Java.

        // What is computer programming?
        // Computer Programming is a process of giving a computer or IT device a series of instructions
        // that tell it the order and process in which to carry out or execute a specific task or set of
        // tasks.

        // Concepts of programming in Java.
        // variables and data types
        // conditionals
        // loops
        // methods
        // classes

        // Variables and Datatypes
        // Numeric Primitive Types
        // byte
        // short
        // int
        // long
        // float // has a max of 7 decimal places
        // double // has a max of 15 decimal places.

        // Non-numeric primitives
        // char - characters.
        // boolean - true or false values

        // Complex Objects
        // Strings

        // Variable: Think of a variable like an empty box, where as soon as you create the box,
        // you decide what type of items you can put in the box and you cannot put a different type
        // of item later on.

        // P.S.: You cannot have a variable with the same name in the same scope in Java.

        // A variable declaration is simply giving your variable a name and a data type.
        // A variable initialization is the point where you finally give that variable a value to start with.

        float number; // variable declaration
        number = 4; // variable initialization

        float value = 6; // variable declaration and initialization in one line.
//        byte byteValue = 1;

//        char charValue = '9';
//        String text = "I am going to school";

//        long digits = 5L;
       // float decimalFloat = 3.683f;
       // double decimalDouble = 5.2323235353;


        // Arithmetic Operators include:
        // + - Addition
//        System.out.println("Addition of number and value is: " + (number + value));
        // - - Subtraction
//        System.out.println("Substraction of number and value is: " + (number - value));
        // / - Division
//        System.out.println("Division of number and value is: " + (number / value));
        // * - Multiplication
//        System.out.println("Multiplication of number and value is: " + (number * value));
        // % - Modulus (It divides the values and returns the remainder) e.g 2 % 2 -> 0
//        System.out.println("Modulus of number and value is: " + (number % value));

        // = Assignment

        // Short cut to comment a line of code: CTRL + /
        // A comment is a piece of text in your code that isn't executed by the computer.

        // Our first Java program
//        System.out.println("Hello World!");

        // Task 10 mins
        // Imagine you are writing a personal fitness program that stores the user's age,
        // gender, height (in feet or meters). and weight (to the nearest pound or kilogram).
        // Declare and initialize variables with the appropriate names and types to hold
        // the information.

        // Type conversion
        // Java allows you to IMPLICITLY convert from a smaller data type to a bigger one,
        // but not the other way round.
        // For you to convert from bigger to smaller you must do it EXPLICITLY. This is called
        // CASTING.
        // smaller -> bigger
/*
        int five = 5;
        long newValue = five;

        // bigger -> smaller
        long six = 6;
        int  intValue = (int)six;

        double deciNumber = 6.892323323;
        System.out.println("Double value: " + deciNumber);
        int truncatedValue = (int)deciNumber;
        System.out.println("Integer version: " + truncatedValue);
*/

        boolean bool = true;
        boolean loob = 8 > 5;

        // A boolean is simply a statement or expression that results in true or false.
        // Relational operators:
        // > - Greater than - If the value on the left is greater than the one on the right.
        // < - Less than - If the value on the left is less than the one on the right.
        // == - equals to - If the value on the left is equal to the one on the right.
        // != - Not equals to - If the value on the left is not equal to the one on the right.
        // >= - Greater than or equals to. - If the value on the left is greater than or equal to the one on the right.
        // <= - Less than or equals to. - If the value on the left is less than or equal to the one on the right.

        //System.out.println(5 == 9); // false
        //System.out.println(9 <= 19); // true

        // Logical operators:
        // && - AND operator -
       // System.out.println(5 < 8 && 8 < 3); // && only returns true if both expressions evaluate to true.

        // || - OR operator -
        // System.out.println(5 > 8 || 8 > 3); // || only returns false if both expressions evaluate to false.

        // Task:
        // Evaluate the following expressions using relational and logical operators
        // 1. Find out what happens when 6 is less than 9 and is compared to 9  greater than 2. ( AND)
        // 2. Find out what happens when 5 is greater than 9  and is compared to 8 less than 3. ( OR)
        // 3. ... what happens when 8 is equal to 2 and 7 is less than 6. ( AND)

        // Java Conventions regarding naming.
        // You can't use keywords as names. e.g you can't use
        // 'int' as a variable name.
        // variables & method - incrementOne, birdSound, numberOfWings.
        // class - IncrementOne, BirdSound, NumberOfWings.
    }
}

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
        // Primitive Values
        // byte
        // short
        // int
        // long
        // float // has a max of 7 decimal places
        // double // has a max of 15 decimal places.

        // char

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
        System.out.println("Addition of number and value is: " + (number + value));
        // - - Subtraction
        System.out.println("Substraction of number and value is: " + (number - value));
        // / - Division
        System.out.println("Division of number and value is: " + (number / value));
        // * - Multiplication
        System.out.println("Multiplication of number and value is: " + (number * value));
        // % - Modulus (It divides the values and returns the remainder) e.g 2 % 2 -> 0
        System.out.println("Modulus of number and value is: " + (number % value));

        // = Assignment

        // Short cut to comment a line of code: CTRL + /
        // A comment is a piece of text in your code that isn't executed by the computer.

        // Our first Java program
//        System.out.println("Hello World!");
    }
}

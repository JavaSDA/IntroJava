package com.company;

public class Assignments {
    public static void main(String[] args) {
        // Home Tasks:
        // Write a program that will output the prime numbers between 1- 80.
        // Write a program that will act as a simple calculator where you set a variable as the operator and based on that
        // perform an arithmetic operation. For example if the operator variable is "+" then it will add two numbers  and so on

        // Prime Numbers
        // A prime number is a number that can only be divided by 1 and itself without giving any remainders.
//        for (int i = 2; i <= 80 ; i++) { // Run from 1 - 80,/
//
//            int counter = 0; // Initialize counter to count the number of numbers that divide i.
//
//            // If you divide a number into two, and those halves still can't divide that whole number without a remainder
//            // it is prime. E.g if you divide 10 into two you get 5, but if you divide 11 into two you get 5.5,
//            // 5.5 inside an integer will give you 5. 11/5 => 2.2
//            for (int j = 2; j <= i / 2; j++) { // Nested loop. ( A loop inside of a loop)
//                if (i % j == 0) { // if this returns true we know that the number is not prime.
//                    counter++; // increase the count of numbers that divide i.
//                }
//            }
//
//            // use the counter to check how many numbers divided i. If counter is greater than 0, then it is not prime.
//            if (counter == 0) {
//                System.out.println(i + " is prime.");
//            }
//        }

        //  simple calculator.
//        char operator = '/';
//        int bigNumber = 15;
//        float smallNumber = 3;
//
//        if (operator == '+') {
//            System.out.println("The sum is " + (bigNumber + smallNumber));
//        } else if (operator == '-') {
//            System.out.println("The difference is " + (bigNumber - smallNumber));
//        } else if (operator == '*') {
//            System.out.println("The product is " + (bigNumber * smallNumber));
//        } else if (operator == '/') {
//            System.out.println("The quotient is " + (bigNumber / smallNumber));
//        } else {
//            System.out.println("Operator not recognized!");
//        }

        // continue - used to skip an iteration (one movement loop)
        // break - stop the loop immediately.
        // return - typically.
        for (int i = 2; i < 20; i++) {
            if (i % 2 != 0) {
                return;
            }
            System.out.println(i);
        }
    }
}

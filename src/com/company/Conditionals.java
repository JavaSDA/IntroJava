package com.company;

public class Conditionals {

    public static void main(String[] args) {
        // Conditionals is simply a way of telling the computer to perform certain actions based on
        // certain conditions.
//        int number = 7;
//        if (number == 2) {
//            System.out.println("The value is 2");
//        } else {
//            System.out.println("The value is not 2");
//        }

        // Task: 10 mins.
        // Using an if else statement print out
        // numbers between 8 and 14 that are greater than 9.
//        int value = 19;
//        if (value == 11) {
//            System.out.println(value + " is eleven");
//        } else if (value > 9 && value < 15) {
//            System.out.println(value + " is greater than 9");
//        } else if (value < 9) {
//            System.out.println(value + " is not greater than 9");
//        } else {
//            System.out.println(value + " is greater than the range");
//        }

        // Loops are a construct that allows us to repeat a set of commands
        // until a condition to terminate is reached
        // Do-While loop is basically saying do this for as long as the condition is true.
        int count = 0;
//        do {
//            System.out.println(count); // print out the count
//            count = count + 1; // increase the count by 1
//        } while (count < 10);

        // while loop is basically saying do this
        // PRO-TIP: Use while loop when you don't have an idea of how many
        // times the loop is supposed to run.
//        while (count < 11) {
//            System.out.println(count);
//            count = count + 1;
//        }

        // For loop
        // use the for loop typically when you have an idea of how many
        // times the loop is supposed to run.
//        for (int i = 8; i < 15; i++) {
//            if (i > 9) {
//                System.out.println(i + " is greater than 9");
//            }
//        }

        // Task 1: 15 mins
        // Write a program using a loop that prints out 'even' when an even
        // number is encountered between 1 - 50 and 'odd' when an odd number
        // is encountered as well

//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 0) {
//                System.out.println("even");
//            } else {
//                System.out.println("odd");
//            }
//        }

        // Task 2: 20 mins
        // Write a program using a while loop that will print out all the
        // multiples of 4 between 1 and 50.

//        int counter = 1;
//        while (counter <= 50) {
//            if (counter % 4 == 0) {
//                System.out.println(counter);
//            }
//            counter++; // post-incrementation.
//        }

        //P.S:  a multiple of 4 is a number that can be divided by 4 without any remainders.

        // Unary Operators:
        // Addition
        // pre-incrementation operator -- e.g ++counter is the same as(==) counter + 1
        // when pre-incrementation is used, the value is incremented before it is read.
//        int value = 9;
//        System.out.println(value + 1);
////        value++;
//        System.out.println(value++);
//        System.out.println(value++);
//        System.out.println(value);

        // post-incrementation operator -- e.g counter++ is the same as(==) counter + 1
        // when post-incrementation is used, the value is read before it is incremented.

        // Subtraction
        // pre-decrementation operator -- e.g --counter
        // post-decrementation operator -- e.g counter--

        // Task 3: 20 mins
        // Write a program that print numbers 1 - 50.
        // and if a number is divisible by 3 then replace
        // that number with the word 'Fizz'
        // and if a number is divisible by 7 then replace
        // that number with the word 'Buzz'
        // and if the number is divisible by both  3 and 7 then replace
        // that number with the word 'FizzBuzz'
        // else just print the number.

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }

}

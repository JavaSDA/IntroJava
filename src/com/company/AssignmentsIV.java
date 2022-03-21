package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class AssignmentsIV {
    public static void main(String[] args) {

        // Write a Java program to find maximum product of two integers in a given array of integers Example:
        //Input :
        //nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
        //Output:
        //Pair is (7, 8, Maximum Product: 56
        //Write a Java program to find minimum subarray sum of specified size in a given array of integers Example:
        //Input :
        //nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
        //Output:
        //Sub-array size: 4
        //Sub-array from 0 to 3 and sum is: 10

        // Task 1
//        int[] numbers = { 2, 3, 5, 7, -7, 5, 8, -5 };
//        Arrays.sort(numbers);
//        System.out.println("Sorted Array: " + Arrays.toString(numbers));
//        System.out.println("The product of the highest two multiplyng numbers is: " + (numbers[numbers.length - 1] * numbers[numbers.length - 2]));

//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter a list of numbers
//        System.out.print("How many numbers do you want to enter?: ");
//        int[] numbers = new int[scanner.nextInt()];
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print("Enter a number: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        // sort the array
//        Arrays.sort(numbers);
//
//        // prompt the user to enter the minimum size of the array to add.
//        System.out.print("Enter the minimum size to add: ");
//        int minSize = scanner.nextInt();
//
//        int sumMinSize = 0;
//
//        // sum the minimum size of the array
//        for (int i = 0; i < minSize; i++) {
//            sumMinSize += numbers[i];
//        }
//
//        System.out.println("The min size is "  + sumMinSize);


        // Task 1: 10 mins
        // ASk the user to enter the sides of a right-angled triangle, a, b, c.
        // Find the area of the triangle.

        // Task 2: 20 mins
        // Write a program to return the fibonacci sequence up to a specified length by the user
        // for example: how many fibonacci numbers do you want to display?
        // output: . .. ..  ..


        // Date is class under the java.util
        // It contains tools for managing and manipulating dates
//        Date date = new Date();

        // deprecated means that something is no longer in use.

//        System.out.println(date.getTime());
//
//        LocalTime timeLocal = LocalTime.now();
//        System.out.println(timeLocal);
//
//        LocalDate localdate = LocalDate.now();
//        System.out.println(localdate);
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);

        // 10 mins
        // A leap year is a year with an additional day in it, because of the month of february.
        // Write a program that accepts a year from a user and tells the user if the year is a leap year or not.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

//        boolean isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

//        System.out.println(isLeap ? "Leap year" : "not leap year");
        boolean isLeap = LocalDate.of(year, Month.DECEMBER, 2).isLeapYear();
        System.out.println(isLeap ? "local leap year": "not leap");



    }


    // 10 mins.
    // Write a program that returns the number or amount of hours between two (o'clock) times entered by the user.
}

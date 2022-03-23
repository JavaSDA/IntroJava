package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
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

//        System.out.print("Enter a year: ");
//        int year = scanner.nextInt();

//        boolean isLeap = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

//        System.out.println(isLeap ? "Leap year" : "not leap year");
//        boolean isLeap = LocalDate.of(year, Month.DECEMBER, 2).isLeapYear();
//        System.out.println(isLeap ? "local leap year": "not leap");

        // 10 mins.
        // Write a program that returns the number or amount of hours between two (o'clock) times entered by the user.

/*
        System.out.print("Enter the start hour: ");
        String userStart = scanner.nextLine(); // 5:00 AM

        System.out.print("Enter the end hour: ");
        String userEnd = scanner.nextLine(); // 8:00 AM

        // Get the value of the hours
        int startHour = Integer.parseInt(userStart.split(":")[0]);
        int endHour = Integer.parseInt(userEnd.split(":")[0]);

        // If a time entered is in the morning assign it 12 else assign it 24
        // to make it easy to compare numerically.
        int amPmOne = userStart.split(" ")[1].equals("AM") ? 12 : 24; // 8:00 AM => ["8:00", "AM"]
        int amPmTwo = userEnd.split(" ")[1].equals("AM") ? 12 : 24;

        // subtract and find out the difference
        int difference =(endHour+amPmTwo) - (startHour+amPmOne);
        if (amPmOne < amPmTwo && startHour > endHour) difference +=12;


        System.out.println(difference == 0 ? "No time has passed." : difference + " hours");
*/

        // " "
        // The black boy => ["The", "black boy"] => ["The", "black", "boy"]



        // Write a Java program to get year and months between two dates.

        LocalDate today = LocalDate.now();
        LocalDate userDay = LocalDate.of(2020, Month.JUNE, 21);
        Period difference = Period.between(userDay, today);

        System.out.println("The difference between " +
                userDay + " - " +
                today + ": " +
                difference.getYears() + " years " + " and " + difference.getMonths() + " months.");
        System.out.println(difference.getDays());

        //Write a Java program to calculate the difference between two dates in days.
//        LocalDate userDate1 = LocalDate.of(2022, 1, 3);
        LocalDate userDate1 = LocalDate.of(2020, 6, 23);
        LocalDate userDate2 = LocalDate.of(2022, 3, 22);


        long numberOfDaysBetween = Math.abs(ChronoUnit.MONTHS.between(userDate1, userDate2));

        System.out.println("The difference between them in days is: " + numberOfDaysBetween);


        // Task 1: 10 mins.
        // Write a program to calculate the age of a person, considering that they (the user) only enters
        // their date of birth

        // Task 2: 10 mins.
        // Write a program to calculate the number of days between two specified years. (beginning of each year is
        // the input).



        //        boolean isLeap = LocalDate.of(year, Month.DECEMBER, 2).isLeapYear();
//        System.out.println(isLeap ? "local leap year": "not leap");*/
        // 10 mins.
        // Write a program that returns the number or amount of hours between two (o'clock) times entered by the user.





    }
}

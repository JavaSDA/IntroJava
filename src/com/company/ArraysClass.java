package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {
    public static void main(String[] args) {
        // An array is a collection of multiple data units of a single data type.
        // Indexing for an array starts at 0

        Scanner scanner = new Scanner(System.in);
        // First way to declare an array (you have predetermined values)
        /*int[] numbers = {4, 5, 0, 4};
        System.out.println(numbers.length);*/

        // Second way to declare an array. (You have unknown values to be added later)
       /* int[] numbers = new int[5]; // default value for int is 0
        String[] textArr = new String[6]; // default value for objects including String is null

        textArr[3] = "orange";

        // Receive input to populate the array
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user to enter a number;
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // Find the sum of the numbers
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

//        System.out.println(Arrays.toString(numbers));
        System.out.println("The sum of the variables is: " + sum);
*/
        // Task 1: 25 mins.
        // Write a program to find the average of a set of numbers that the user enters.
        // Allow the user to decide the number of integers to enter.
        // Interactively return the output to the console.

        // prompt the user to enter how many numbers to average
        System.out.print("How many numbers do you want to average?: ");
//        int numberOfNumbers = scanner.nextInt();

        // Create the array using the number of numbers as the length
        int[] numbers = new int[scanner.nextInt()];

        // Receive input to populate the array
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user to enter a number;
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // The average value of a set of numbers is the sum of the numbers / the number of numbers
        // Find the sum of the numbers
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The average of the numbers " + Arrays.toString(numbers) + " is: " + (sum/numbers.length));
    }


}

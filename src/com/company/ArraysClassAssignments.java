package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClassAssignments {
    public static void main(String[] args) {

        // Home Tasks:
        //Write a program that receives some numbers based on the user’s choice and then returns the largest number
        // of the ones the user entered.

        //Write a program that accepts a String from the user and returns an array of integers representing the counts
        // of each vowel in the String. The array returned by your method should hold 5 elements: the first is the
        // count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us.

        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);
/*
        // Prompt the user for input
        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()]; // use the input to create an array to hold the values

        // Populate the array with data.
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user to enter a number;
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        // Find the maximum number
        int maximum = numbers[0];

        // compare the value with other elements in the array
        for (int i = 1; i < numbers.length; i++) {
            // If the current number is smaller than the maximum then,
            // set it as the new maximum.
            if (maximum < numbers[i]) {
                maximum = numbers[i];
            }
        }

        System.out.println("The largest number you entered is: " + maximum);*/
/*
        // prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // We know that the array is going to have a length of 5
        int[] vowelCount = new int[5];

        // Loop through the string and count the vowels
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.toLowerCase().charAt(i);

            switch (currentLetter) { // curly braces
                case 'a':
                    vowelCount[0]++;
                    break;
                case 'e':
                    vowelCount[1]++;
                    break;
                case 'i':
                    vowelCount[2]++;
                    break;
                case 'o':
                    vowelCount[3]++;
                    break;
                case 'u':
                    vowelCount[4]++;
                    break;
            }
        }
        // Output to the console.
        System.out.println("The vowel breakdown for " + text + " is " + Arrays.toString(vowelCount));*/


        // Task 1: 20 mins
        // Ask the user to enter a range of numbers and sort that group of numbers in such a way that even numbers
        // come first in the output and odd numbers are after the even numbers.
        // The sorted version is [2, 4, 8, 10, 5, 9, 7, 3]

/*        //prompt the user to enter some numbers
        System.out.print("How many numbers: ");
        int[] userNumbers = new int[scanner.nextInt()];

        // create counters to count the odd and even numbers entered
        int evenCount = 0;
        int oddCount = 0;

        // Populate the array with data.
        for (int i = 0; i < userNumbers.length; i++) {
            // Prompt the user to enter a number;
            System.out.print("Enter a number: ");
            userNumbers[i] = scanner.nextInt();
            if (userNumbers[i] % 2  == 0) evenCount++;
            else oddCount++;
        }

        // separate the even and odd numbers
        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];

        // filter them into their respective arrays.
        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < evenNumbers.length; j++) {
                if (userNumbers[i] % 2 == 0) {
                    evenNumbers[j] = userNumbers[i];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));
    }*/

        // Task 2: 15 mins.
        // Write a program to return the second largest number from a stream of inputted integers
        // from the user.

//        //prompt the user to enter how many numbers
//        System.out.print("How many numbers?: ");
//        int[] numbers = new int[scanner.nextInt()];
//
//        // Populate the array with data.
//        for (int i = 0; i < numbers.length; i++) {
//            // Prompt the user to enter a number;
//            System.out.print("Enter a number: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        // Sort the array.
//        Arrays.sort(numbers);
//
//        System.out.println("The second largest number is " + numbers[numbers.length - 2]);


        // Task 3: 15 mins.
        // Write a program to find out if in a list of numbers entered by a user
        // there are no multiples of 3.

////        prompt the user to enter how many numbers
//        System.out.print("How many numbers?: ");
//        int[] numbers = new int[scanner.nextInt()];
//
//        // Populate the array with data.
//        for (int i = 0; i < numbers.length; i++) {
//            // Prompt the user to enter a number;
//            System.out.print("Enter a number: ");
//            numbers[i] = scanner.nextInt();
//        }
//
//        boolean ifThree = false;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 3 == 0) {
//                ifThree = true;
//                break;
//            }
//        }
//        if (ifThree) {
//            System.out.println("A multiple of three exists");
//        } else {
//            System.out.println("No multiple of three exists");
//        }
//    }

//        prompt the user to enter how many numbers
        System.out.print("How many numbers?: ");
        int[] numbers = new int[scanner.nextInt()];

        // Populate the array with data.
        for (int i = 0; i < numbers.length; i++) {
            // Prompt the user to enter a number;
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }

        int counter = 0;
        // Check for the odd numbers and continuously count them.
        while (counter < numbers.length && numbers[counter] % 2 == 0) counter++;

        for (int i = counter + 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                int temporary = numbers[counter];
                numbers[counter] = numbers[i];
                numbers[i] = temporary;
                counter++;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}

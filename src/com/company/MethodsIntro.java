package com.company;

import java.util.Locale;
import java.util.Scanner;

public class MethodsIntro {

    // public - accessible throughout the project
    // class - a blueprint for describing an object

    public static void main(String[] args) {
//        boolean evenValue = checkEven(6);
//        checkEven(9);
//        System.out.println(checkEven(9));

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number to check: ");
//        int numberToCheck = scanner.nextInt();

//        System.out.print("Enter a string: ");
//        String userString = scanner.nextLine();

        // Prompt the user for input
        System.out.print("How many numbers do you want to enter?: ");
        int[] userNumbers = new int[scanner.nextInt()];

        // Populate the array.
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print("Enter a number: ");
            userNumbers[i] = scanner.nextInt();
        }

        System.out.println("The maximum value in the array is: " + findMax(userNumbers));
//        System.out.println("The total number of consonants in the string is: " +  countConsonants(userString));


//        System.out.println(checkEven(numberToCheck) ? "Number is Even" : "Number is Odd");
    }

    // methods - is a vehicle or errand boy that you pass a series of instructions to
    // and it will return the output or result to you.

    public static boolean checkEven(int number) {
        if (number % 2 == 0) return true;
        else return false;

    }

    // 15 mins.
    // Write a method that takes in a string and returns the number of consonants in the string.
    // Input should be from the user.

    public static int countConsonants(String word) {
        int vowelCount = 0;
        int spaceCount = 0;

        char[] wordArr = word.toLowerCase().toCharArray();

        for (int i = 0; i < wordArr.length; i++) {
            char currentChar = wordArr[i];
            switch (currentChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                case ' ':
                    spaceCount++;
                    break;

            }
        }

        return word.length() - (vowelCount); //  number of consonants

    }

    // 15 mins.
    // Write a method that takes in an array of numbers and
    // returns the maximum number in the array.
    // it should return an int.
    // N.B. Do not use the Math.max() method.

    public static int findMax(int[] numbers) {
        // Start by initializing the maximum variable
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (maximum < numbers[i]) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }

    // 15 mins.
    // Write a method that accepts three parameters, double smallNumber, double bigNumber, String operator
    // Based on the arithmetic operator passed, perform one of the following operations: +, -, /, *
    // on the small and Big number and return the result. The return should be a double.

}

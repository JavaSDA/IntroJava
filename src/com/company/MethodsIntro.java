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
//        System.out.print("How many numbers do you want to enter?: ");
//        int[] userNumbers = new int[scanner.nextInt()];
//
//        // Populate the array.
//        for (int i = 0; i < userNumbers.length; i++) {
//            System.out.print("Enter a number: ");
//            userNumbers[i] = scanner.nextInt();
//        }
//
//        System.out.println("The maximum value in the array is: " + findMax(userNumbers));
//        System.out.println("The total number of consonants in the string is: " +  countConsonants(userString));


//        System.out.println(checkEven(numberToCheck) ? "Number is Even" : "Number is Odd");

//        System.out.print("Enter the small number: ");
//        double smallN = scanner.nextDouble();
//
//        System.out.print("Enter the big number: ");
//        double bigN = scanner.nextDouble();
//
//        System.out.print("Enter an operator (+, -, /, *): ");
//        String operator = scanner.next();
//
//
//        System.out.println("The result is: " + miniCalc(smallN, bigN, operator));

//        System.out.print("Enter password: ");
//        String password = scanner.next();
//
//        System.out.println(compare(password) ? "Password is correct" : "Password is incorrect");

//        System.out.print("Enter the principal: ");
//        float principal = scanner.nextFloat();
//
//        System.out.print("Enter the rate: ");
//        float rate = scanner.nextFloat();
//
//        System.out.print("Enter the time in years: ");
//        int time = scanner.nextInt();
//
//        System.out.println(simpleInterest(principal, rate, time));

//        System.out.println(factorial(5));

        System.out.println(lengthOfString("Hello"));
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

    // parameters are the input that the method expects in order to process, your instructions.
    public static double miniCalc(double smallNumber, double bigNumber, String operator) {
//        double result = 0;
        switch (operator) {
            case "+":
                return smallNumber + bigNumber;
            case "-":
                return bigNumber - smallNumber;
            case "*":
                return bigNumber * smallNumber;
            case "/":
                return bigNumber / smallNumber;
            default:
                System.out.println(operator + " operator is not a valid option");
                return 0;
        }
    }

    // 15 mins
    // Write  a method that compares two strings (that could be passwords) and returns true or false
    // based on their equality.

    // 20 mins.
    // Write a method to calculate simple interest and return it.
    // Google the simple interest formula.

    public static boolean compare(String enteredPassword) {
        // Assume actual password is helloworld
        String password = "helloworld";

        return enteredPassword.equals(password);
    }

    public static float simpleInterest(float principal, float rate, int time) {
        return (principal * rate * time) / 100;
    }

    // 20 mins.
    // Write a method that accepts an integer and returns whether that integer is
    // a prime number or not.
    // A prime number is a number that isn't divisble without a remainder
    // by any other numbers apart from one and itself
    // isPrime(9) -> 9 is not prime.

    // Recursion
    // Recursion is a phenomenon where a method calls itself.
    // a base case is the condition under which you want a recursive operation
    // to end.

    // Factorial of a number is the multiplcation of that number by all the positive
    // integers between 1 and the number.
    // The only exception being 0! -> 1, 1! -> 1
    // An example -> 5! -> 5 x 4 x 3 x 2 x 1 -> 120;

    // Using iteration(loops)
//    public static int factorial(int number) {
//        int result = 1;
//        for (int i = 2; i <= number; i++) {
//            result *= i; // multiply all the numbers between 1 and number.
//        }
//
//        return result;
//    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) { //
            return 1;
        }
        return n * factorial(n - 1);

        // 5 * factorial(5 -1)
        // 4 * factorial (4 - 1)
        // 3 * factorial (3 - 1)
        // 2 * factorial (2 -1 )
        //  1
    }

    // Write a method that returns the length of a string
    public static int lengthOfString(String value) {
        if (value.equals("")) {
            return 0;
        }

        return lengthOfString(value.substring(1)) + 1;
    }

    // Home tasks:
    // Using recursion, write a method that takes a number as a parameter and
    // returns the total sum between one and that number;
    // upToNumber(8) -> 1 + 2 + ... + 8

    // Using recursion, write a method that tasks a string as a parameter and
    // returns the reverse of the string.


}

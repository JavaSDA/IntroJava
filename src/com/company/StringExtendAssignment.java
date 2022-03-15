package com.company;

import java.util.Scanner;

public class StringExtendAssignment {
    public static void main(String[] args) {
        // Home Tasks:
        //Write a program that returns true interactively, if a user enters a string containing any of these characters: 'u', 'w', '6', 'i', 'b', 'q'
        //Write a program that accepts a String from a user and prints an interactive response telling the user if the word is the same when spelt backwards. For example, bread when spelt backwards is daerb, which isn't quite the same.
        //Write a program that accepts any of the primary colors as a String and returns the complimentary color of that color to the user.

        Scanner scanner = new Scanner(System.in);

        // Task 1 Solution:
        // Take input from the user.
        /*System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        String responseString = "";
        String errorString = "";

        for (int i = 0; i < userInput.length(); i++) {
            // Pick out the particular character to be checked
            char checkLetter = userInput.toLowerCase().charAt(i);

            switch (checkLetter) {
                case 'u':
                case 'w':
                case '6':
                case 'i':
                case 'b':
                case 'q':
                    responseString = "The character " + checkLetter + " is contained in the string " + userInput;
                    break;
                default:
                    errorString = "No accepted characters were found!";
                    break;
            }

        }

        if (responseString.isEmpty()) {
            System.out.println(errorString);
        } else {
            System.out.println(responseString);
        }*/


        // Task 2:
        // Prompt the user to enter a string

        /*System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        String reverseInput = "";

        // Append the string in reverse to the reverseString variable
        for (int i = userInput.length() - 1; i > -1 ; i--) {
            reverseInput += userInput.charAt(i); // reverseInput = reverseInput + userInput.charAt(i);
        }

        // Decide the output based on the equality of the strings
        if (reverseInput.equalsIgnoreCase(userInput)) {
            System.out.println("The string " + userInput + " is the same as " + reverseInput + " therefore, a palindrome.");
        } else {
            System.out.println("The string " + userInput + " is not the same as " + reverseInput + " therefore, not a palindrome.");
        }
*/


        // Red + yellow -> orange
        // yellow + blue -> green
        // red + blue -> purple.

        // Complimentary colors
        // Red -> Green
        // Blue -> Orange
        // Yellow -> Purple.

        // Prompt the user to enter a colour
        System.out.print("Enter a primary color: ");
        String userColor = scanner.nextLine();

        switch (userColor.toLowerCase()) {
            case "red":
                System.out.println("The Complementary color of Red is Green");
                break;
            case "blue":
                System.out.println("The Complementary color of Blue is Orange");
                break;
            case "yellow":
                System.out.println("The Complementary color of Yellow is Purple");
                break;
            default:
                System.out.println("You didn't enter a primary colour");
                break;
        }

    }
}

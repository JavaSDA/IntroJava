package com.company;

public class StringAssignment {
    public static void main(String[] args) {

        // Write a program to compare two strings by their length and return output that tells the user if the strings are equal or not.
        //Write a program to add as many 'r's to 'burp' by using a variable to regulate. For example, if that variable is set to 4, then it will return an output like 'burrrrp'.
        //Write a program to remove the first and last letters of a string. e.g. hello becomes ell.
        //Write a program to reverse a string and capitalize all the letters. e.g. hello becomes OLLEH.

        // Task1:
//        String stringOne = "I love programming!";
//        String stringTwo = "Coding is fun!";
//
//        if (stringOne.equals(stringTwo)) {
//            System.out.println("They are equal!");
//        } else {
//            System.out.println("They aren't equal!");
//        }

        // Task 2:
//        String rString = ""; // This is going to contain the r's
//        int rNumber = 6;
//
//        for (int i = 0; i < rNumber; i++) {
//            rString += "r"; // rString = rString + "r"; // append r's to the rString.
//        }
//
//        System.out.println("bu" + rString + "p");

        // Task 3: 1, 4
//        String word = "coconut";
//        System.out.println(word.substring(1, word.length() - 1));

        // Task 4:
        String word = "cocomelon";
        String reversedString = "";
        for (int i = word.length() - 1; i > -1; i--) { // loop from the last character to the first
            reversedString += word.charAt(i); // append the characters in reverse to the empty string
        }
        System.out.println(reversedString.toUpperCase());
    }
}

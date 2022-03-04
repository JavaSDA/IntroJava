package com.company;

public class StringTest {
    public static void main(String[] args) {
        // A String is basically anything inside of double-quotes ("").
        // Strings are immutable. This means they can not be changed.
        // Strings in java are case-sensitive because it sees upperCase alphabet and lower case alphabet differently.
        System.out.println("I love coding!"); // String literal.

        // Two main ways to create strings
//        String objectString = new String("I am going home"); // This type takes more space and is unideal.
        String regularString = "I am going to the beach";
        // The index of the first character in a string is 0.
        // The index of the last character in a string is less than the length of the string by 1.

        System.out.println(regularString.length());
        int counter = 0;
        for (int i = 0; i < regularString.length(); i++) {
            System.out.println(regularString.toLowerCase().charAt(i));
            if ('a' == regularString.charAt(i))  {
                counter++;
            }
        }
        System.out.println("The number of times 'a' appeared is " + counter);



    }

    // Task 1: 12 mins.
    // Write a program to count the number of times a vowel appears in a word.
    // Any vowel from the alphabet.
    // Physician.
    // Aerodynamics.

}

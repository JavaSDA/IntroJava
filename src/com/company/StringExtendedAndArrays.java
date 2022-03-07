package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringExtendedAndArrays {
    public static void main(String[] args) {
        // Scanner
        // Initialize the scanner class.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to perform an action.
//        System.out.print("Enter your name: ");
//        String userName = scanner.next(); // Accept the user's input and save it to a variable.

//        String userSurname = scanner.next();
//        System.out.println("Your full name is: " + userSurname + " " + userName); // Return the output.
//        scanner.close();

        // Task 2: Solution
        // Prompt the user to enter the number r's to add.
//        System.out.print("Enter a number of r's: ");
//        int rNumber = scanner.nextInt();
//
//        System.out.print("Enter a character to repeat: ");
//        String character = scanner.next();
//
//        String rString = "";
//
//        for (int i = 0; i < rNumber; i++) {
//            rString += character; // rString = rString + "r"; // append r's to the rString.
//        }
//        System.out.println("bu" + rString + "p");

        // Escape characters:
        // Escape characters are special characters that allow us to
        // perform specials from within a string.
        // \n - this creates a new line
        // \t - this creates a new tab.
        // \r - carriage turn (does the same thing as pressing `enter`"
//        System.out.println("The little \"brown\" dog");
//        System.out.println("This is one lineThis is a second line");


        // Wrapper Classes. (Converting Strings to primitive values)
//        String five = "5";
//        int number = Integer.parseInt(five);
//        System.out.println((number + number) * number);
//
//        String six = "6.00001";
//        double sixValue = Double.parseDouble(six);
//
//        String falseString = "false";
//        boolean falseValue = Boolean.parseBoolean(falseString);
//        System.out.println(falseValue);

        // byte -> Byte -> "Byte java 8 documentation"
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean

        // Regex
        // Quantifiers are a construct under regex that allows us to
        // take note of the number of occurences of a particular sequence in
        // a string.
//        aaabbbe
        // + - checks if a character or sequence has at least one occurence in
        // the string. e.g a+[bc]+ -> checks if there is at least one a in the string being tested.
        // * - checks if a character appears zero or more times.
        // ? - checks if a character appears zero or one time.




        Pattern pattern = Pattern.compile("a+[bc]+"); // Pattern checker

        Matcher matcher = pattern.matcher("aaaaacd"); // String to check
        Matcher matcher2 = pattern.matcher("boogieboy109"); // String to check
        System.out.println(matcher.matches()); // This returns true if they match and false if not.
        System.out.println(matcher2.matches()); // This returns true if they match and false if not.

        }
}

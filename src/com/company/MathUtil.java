package com.company;

import java.util.Scanner;

public class MathUtil {
    public static void main(String[] args) {
        // 2 ^ 3 => 8
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.max(5, 9));


        // Task 1: 10 mins
        // Write a program that allows the user to enter the base and height of a triangle and return the area of
        // the triangle interactively to the user.
        // The area of a triangle is 0.5 * base * height


 /*       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        float base = scanner.nextFloat();

        System.out.print("Enter the height: ");
        float height = scanner.nextFloat();

        System.out.println("The area of the triangle is: " + (0.5 * base * height));
*/
        // Task 2: 15 mins.
        // Write a program that accepts the a, b, and c and allows a calculates a quadratic equation based on the user input
        // the quadratic formula is: x1: (- b + squareroot( b ^2 - (4 * a * c))) / 2a, x2: (- b - squareroot(b ^2 - (4 * a * c)))


        // x^2 - 4

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }
}

package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.3 Shape
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
        /*Condition: Write a program, witch reads the number of the shape( 1- square, 2 - cicle, 3 - triangle, 4 - rhombs)
         * and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number)
         * If it is a number that doesn't correspond to any of the listed shapes, the program should output: "There is no such shape!".
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Insert the shape number");
        int n = sc.nextInt();

        String text = switch (n) {
            case 1 -> "\n\t\t You have chosen a square!";
            case 2 -> "\n\t\t You have chosen a circle!";
            case 3 -> "\n\t\t You have chosen a triangle!";
            case 4 -> "\n\t\t You have chosen a rhombus!";
            default -> "\n\t\t There is no such shape!";
        };
        System.out.println(text);
    }
}

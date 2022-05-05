package com.company;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.1
   # Author: Sergiu
*/
/* Condition: Read a string (name) and an integer (age) from the console
 *  and output the text:
 *  Hi, my name is <name>!
 *  I'm <age> years old!
 * */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n What's your name forest ? ");
        String name = sc.nextLine();
        System.out.println("\n How old are you? ");
        int age = sc.nextInt();

        System.out.println("\n\t\t Hi, my name is " + name +
                "!\n\t\t I'm " + age + " years old!");

    }
}

package com.serbug;
/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.5
   # Author: Sergiu
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*        Condition: Write a program that finds the number of tens in a non-negative integer
            N(0<=N<=1000000). Take a look at the examples:
        * If N is 264, the number of tens is 6.
        * If N is 4136, the number of tens is 3.
        * If N is 101, the number of tens is 0.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Insert a number: ");
        int N = sc.nextInt();
        System.out.println("\n\t If N is " + N + ", the number of tens is \033[0;4m" + (N % 100) / 10 + "\033[0m !");

    }
}

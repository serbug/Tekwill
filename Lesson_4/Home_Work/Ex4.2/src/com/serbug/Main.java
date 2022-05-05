package com.serbug;
/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.2 How many nuts each squirrel will get
   # Author: Sergiu
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Condition: N squirrels found K nuts and decided to divide them equally. Determine how many
        nuts each squirrel will get. So there are two positive numbers N and K, each of them is
        not greater than 10000.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Insert number of squirrels: ");
        int N = sc.nextInt();
        System.out.println("\n Insert number of nuts: ");
        int K = sc.nextInt();

        System.out.println("\n* Each squirrel will get \033[0;4m" + (K / N) + "\033[0m nuts!"); // \033[0;4m - string underline
    }
}

package com.serbug;
/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex6.5 Fill the matrix numbers
 *
 * @Author Sergiu
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Condition: Given the number n, not greater than 100. Create the matrix of size n×n and fill it by
       the following rule. Numbers 0 should be stored on the primary diagonal. The two
       diagonals, adjacent to the primary one, should contain numbers 1. The next two
       diagonals - numbers 2, etc.
     */

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter size: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int numbers = Math.abs(i - j);
                System.out.print(numbers + " ");
            }
            System.out.println();

        }
    }
}

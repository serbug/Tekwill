package com.serbug;

import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex6.6 Pretty looking pattern
 *
 * @Author Sergiu
 */
public class Main {

    public static void main(String[] args) {
	/* Condition: In some design styles, a 4x4 matrix pattern is considered to look pretty if it doesn't
       consist of a 2x2 matrix of the same color. Your task is to write the program that outputs
       "YES" if the 4x4 matrix is looking pretty, otherwise output "NO".
        The input contains 4 lines, each line contains 4 symbols, and different symbols
        represent different colors: W stands for white color, B is for black color, R is for red, G is
        for green, and Y is for yellow color.
      */
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter size: ");
        int n = sc.nextInt();
        char[][] pattern = new char[n][n];
        boolean pretty = true;

        for (int i = 0; i < pattern.length; i++) {
            pattern[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < pattern.length - 1; i++) {
            for (int j = 0; j < pattern.length - 1; j++) {
                if (pattern[i][j] == pattern[i + 1][j] && pattern[i][j] == pattern[i][j + 1] && pattern[i][j] == pattern[i + 1][j + 1]) {
                    pretty = false;
                    i = pattern.length;
                    break;
                }
            }

        }
        System.out.println("\n\t\t\t" + (pretty ? "YES" : "NO"));
    }
}

package com.serbug;
/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.4 Snail
   # Author: Sergiu
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Condition: Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per
      night it goes B feets down. On which day the snail will reach the top of the pole? On the
      input the program receives non-negative integers H, A, B, where H > B and A > B. Every
      integer does not exceed 100.
     */

        Scanner sc = new Scanner(System.in);
        System.out.println(" Height: ");
        int H = sc.nextInt();
        System.out.println(" Up: ");
        int A = sc.nextInt();
        System.out.println(" Down: ");
        int B = sc.nextInt();

        if ((H > 0 && H < 100) && (B > 0 && B < 100) && (A > 0 && A < 100) && (H > B && A > B)) {
            System.out.println("\n* The snail will reach the top of the pole on the \033[0;4m" + (1 + (H - B - 1) / (A - B)) + "\033[0mth day!");

        } else {
            System.out.println("\n\t* Error: You entered a negative variable or greater than 100 or down greater than height and up!");
        }


    }
}

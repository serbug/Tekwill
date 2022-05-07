package com.serbug;


import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.4 The sum of integers from a to b
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/*Condition: Print the sum of all integers from a to b including both.
	  Integer a is always lower the b (a<b).
	*/
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Insert a number for variable A: ");
        int a = sc.nextInt();
        System.out.println("\n Insert a number for variable b: ");
        int b = sc.nextInt();
        int sum = 0;

        //Solution 1
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println("\n The sum of all integers is \033[0;4m" + sum);

//        //Solution 2
//        int i = a;
//        while (i <= b) {
//            sum += i;
//            i++;
//        }
//       System.out.println("\n The sum of all integers is \033[0;4m"+sum);
    }
}

package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.3 The sum of digits
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/*Condition: Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.*/
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum;
        for (sum = 0; n > 0; sum += n % 10, n /= 10)
            ;
        System.out.println(sum);
    }
}

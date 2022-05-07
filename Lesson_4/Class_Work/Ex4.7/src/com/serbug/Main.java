package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.7 Desks
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
        /* Condition: A university has decided to open math courses and equip classrooms for 3 groups with new
         * desks. The faculty agreed that only two students may share one table. You need to calculate
         * the minimum of desks. But don't forget that each group will sit in its own classroom!
         * The program receives the input of the three non-negative integers: the number of students in
         * each of the three groups (the numbers is not bigger than 1000).
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the number of students in the first group: ");
        int group_1 = sc.nextInt();

        System.out.println("Insert the number of students in the second group: ");
        int group_2 = sc.nextInt();

        System.out.println("Insert the number of students in the three group: ");
        int group_3 = sc.nextInt();

        int desks = (group_1 / 2 + group_1 % 2) + (group_2 / 2 + group_2 % 2) + (group_3 / 2 + group_3 % 2);

        System.out.println("\n* The minimum number of desks is \033[0;4m" + desks);

    }
}

package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.5 Distance
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/* Condition: Write a program that reads the distance between the two cities in km and the travel
       time by bus in hours, and outputs the average speed of the bus.
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Distance: ");
        int distance = sc.nextInt();
        System.out.println("\n Time: ");
        int time = sc.nextInt();

        float speed = (float) distance / time;

        System.out.println("\n\t\t* Averange speed of the bus is \033[0;4m" + speed + "\033[0m km/h.");


    }
}

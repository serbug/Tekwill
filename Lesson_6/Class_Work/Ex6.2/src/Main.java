import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex6.2 The sum of array elements
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
       /* Condition: Write a program that calculates the sum of the elements of an array of ints.
       * Input data format
       *     The first line contains the size of an array.
       *     The second line contains elements of the array separated by spaces
       * Output data format
       *     The sum of the input array elements.
       * */

        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("\nInsert the array size: ");
        int n =sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("\n Insert a number: ");
            array[i]= sc.nextInt();
            //Solution 1
            sum+=array[i];
        }
        System.out.println(sum);

        //Solution 2

//        for (int el:array) {
//            sum+=el;
//        }
//        System.out.println(sum);
    }
}
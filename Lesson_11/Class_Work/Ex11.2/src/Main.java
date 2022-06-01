import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        double a = sc.nextFloat();
        System.out.print("Input second number: ");
        double b = sc.nextFloat();

        System.out.printf("\n Output: %.4f ", Math.pow(a, b));
    }
}
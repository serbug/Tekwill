import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        String str=sc.nextLine();
//        String[] s = str.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for (String temp: s) {
//
//            sb.append(temp.charAt(0));
//
//        }
//        System.out.println(sb);

        String name = "Gicu";
        int nrOfPizzas= 10;
        double price = 5.60;
        double discount= price*0.2;

        String str =String.format("Restaurant Java " +
                "Thank you %s for visiting our restaurant." +
                " You’ve ordered %d pizzas." +
                " With the total price of: %.2f. " +
                "Price with 20% discount: %.2f.",name,nrOfPizzas,price,discount);
        System.out.println(str);
    }
}
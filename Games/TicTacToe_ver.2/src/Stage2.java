import java.util.Scanner;

public class Stage2 {

    public static void inputLine() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the symbols _ X O: ");
        String str = sc.nextLine();
        String temp = null;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            temp = "| " + ch[0] + " " + ch[1] + " " + ch[2] + " |" +
                    "\n| " + ch[3] + " " + ch[4] + " " + ch[5] + " |" +
                    "\n| " + ch[6] + " " + ch[7] + " " + ch[8] + " |";

        }
        System.out.println("---------");
        System.out.println(temp);
        System.out.println("---------");

    }

}

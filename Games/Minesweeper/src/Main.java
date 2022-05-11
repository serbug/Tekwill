import java.util.Random;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Game Minesweeper
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        Random radom = new Random();

        int x[][]=new int[10][10];



        for (int i = 0; i < 10; i++) {
            //int x = radom.nextInt(10);


            for (int j = 0; j < 10; j++) {
//                if(j==j){
//                    System.out.print("\n"+j+"\t\t\t");
//                }
                x[i][j]=System.out.print("| O ");
            }
        }
       // System.out.println();
        //System.out.println("Hello world!");
    }
}
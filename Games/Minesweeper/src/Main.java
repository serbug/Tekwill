import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Game Minesweeper
 *
 * @Author Sergiu
 *
 */
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row = -1, col = 0;
        while (row != col) {
            System.out.println("\n************************************");
            System.out.println("\nRows must equal Columns");
            System.out.println("\n************************************");
            System.out.print("\nEnter Number of Rows: ");
            row = input.nextInt();
            System.out.print("\nEnter Number of Columns: ");
            col = input.nextInt();
//            System.out.print("\nEnter Number of Mine: ");
//            mines = input.nextInt();
        }
        char[][] board = new char[row][col];
        initBoard(board);
        int n=0,nr=0;
        int[][] solution = new int[row][col];
        int[][] playboard = new int[row][col];
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++) {

                solution[i][j] = 0;
                playboard[i][j] = 0;
            }
        }
        int mine =   1 + (int) (Math.random() * (row * col));// 1 + (int) (Math.random() * (row * col)
        int countplay = mine;

        fillBoard(board, mine);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '*') {

                    if (i > 0 && j > 0) {
                        if (board[i - 1][j - 1] == '.') {
                            solution[i - 1][j - 1] += 1;
                        }
                    }
                    if (i > 0) {
                        if (board[i - 1][j] == '.') {
                            solution[i - 1][j] += 1;
                        }
                    }
                    if (i > 0 && j + 1 < board[0].length) {
                        if (board[i - 1][j + 1] == '.') {
                            solution[i - 1][j + 1] += 1;
                        }
                    }
                    if (j > 0) {
                        if (board[i][j - 1] == '.') {
                            solution[i][j - 1] += 1;
                        }
                    }
                    if (j + 1 < board[0].length) {
                        if (board[i][j + 1] == '.') {
                            solution[i][j + 1] += 1;
                        }
                    }
                    if (i + 1 < board.length && j > 0) {
                        if (board[i + 1][j - 1] == '.') {
                            solution[i + 1][j - 1] += 1;
                        }
                    }
                    if (i + 1 < board.length) {
                        if (board[i + 1][j] == '.') {
                            solution[i + 1][j] += 1;
                        }
                    }
                    if (i + 1 < board.length && j + 1 < board[0].length) {
                        if (board[i + 1][j + 1] == '.') {
                            solution[i + 1][j + 1] += 1;
                        }
                    }
                }
            }
        }

        System.out.println("\n************************************");
        System.out.println("\nPlay Game");
        System.out.println("\n************************************");
        System.out.println("\t\t 0  1  2  3  4  5  6  7  8  9\n");
        printBoard(board);
        while (countplay <= board.length * board[0].length) {
            System.out.print("\nEnter row: ");
            int prow = input.nextInt();
            System.out.print("\nEnter col: ");
            int pcol = input.nextInt();

            for (int i = 0; i < board.length; i++)
                for (int j = 0; j < board[0].length; j++) {
                    if (board[prow][pcol] == '*') {
                        System.out.println("\t\t\tGAME OVER\n");
                        System.out.println("\t\t 0  1  2  3  4  5  6  7  8  9\n\n");

                        for (int k = 0; k < solution.length; k++) {

                            System.out.print("\t "+(nr++)+"\t ");
                            for (int x = 0; x < solution[0].length; x++) {
                                if (board[k][x] == '*')
                                    System.out.print("*" + "  ");
                                else
                                    System.out.print(solution[k][x] + "  ");
                            }
                            System.out.println("\n");
                        }
                        return;
                    } else {
                        playboard[prow][pcol] = solution[prow][pcol];
                        i = board.length;
                        break;
                    }
                }
            System.out.println("\t\t 0  1  2  3  4  5  6  7  8  9\n");

            for (int k = 0; k < playboard.length; k++) {
                if(n==10){
                    n-=10;
                }
                System.out.print("\t "+(n++)+"\t ");
                for (int x = 0; x < playboard[0].length; x++) {

                    if (board[k][x] == '*'){
                       System.out.print("." + "  ");
                    }else if (playboard[k][x] == 0){
                        System.out.print("." + "  ");
                    }else
                        System.out.print(playboard[k][x] + " ");
                }
                System.out.println("\n");

            }
            countplay++;

        }
        System.out.println("Congratulations");
    }

    private static void fillBoard(char[][] board, int mine) {
        int i = 0;
        while (i < mine) {
            int rm = (int) (Math.random() * board.length);
            int cm = (int) (Math.random() * board[0].length);
            board[cm][rm] = '*';
            i++;
        }
    }

    private static void printBoard(char[][] board) {
        int i=0;

        for (char[] chars : board) {
            System.out.print("\t "+(i++)+"\t ");
            for (int j = 0; j < board[0].length; j++) {
                if (chars[j] == '*')
                    System.out.print("." + "  ");
                else
                    System.out.print(chars[j] + "  ");
            }
            System.out.println("\n");
        }
    }

    private static void initBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }
    }

}
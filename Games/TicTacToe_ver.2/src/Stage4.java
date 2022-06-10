import java.util.Scanner;

public class Stage4 {
    private static Scanner sc = new Scanner(System.in);

    public static void analyzeGameState() {

        System.out.print("Enter cells: ");
        String str = sc.nextLine();
        char[][] game = toMulti(str);

        print(game);

        getUserInput(game);

        print(game);

        int nrOfXs = countChar(game, 'X');
        int nrOfOs = countChar(game, 'O');
        boolean xHasWon = hasWon(game, 'X');
        boolean oHasWon = hasWon(game, 'O');
        int diff = Math.abs(nrOfXs - nrOfOs);

        if (diff > 1 || (xHasWon && oHasWon)) {
            System.out.println("Impossible");
        } else if (xHasWon) {
            System.out.println("X wins");
        } else if (oHasWon) {
            System.out.println("O wins");
        } else if (!str.contains("_")) {
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }
    }

    public static boolean hasWon(char[][] multi, char ch) {
        return checkColumns(multi, ch) || checkRows(multi, ch) || checkDiagonals(multi, ch);
    }

    public static boolean checkRows(char[][] multi, char ch) {
        for (char[] chars : multi) {
            if (chars[0] == ch && chars[1] == ch && chars[2] == ch) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumns(char[][] multi, char ch) {
        for (int i = 0; i < 3; i++) {
            if (multi[0][i] == ch && multi[1][i] == ch && multi[2][i] == ch) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonals(char[][] multi, char ch) {
        return multi[0][0] == ch && multi[1][1] == ch && multi[2][2] == ch ||
                multi[0][2] == ch && multi[1][1] == ch && multi[2][0] == ch;
    }

    public static int countChar(char[][] multi, char ch) {
        int count = 0;
        for (char[] arr : multi) {
            for (char aChar : arr) {
                if (aChar == ch) {
                    count++;
                }
            }
        }
        return count;
    }

    private static void print(char[][] chars) {
        System.out.println("---------");
        for (char[] aChar : chars) {
            System.out.print("| ");
            for (char c : aChar) {
                System.out.print(c + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }


    private static char[][] toMulti(String input) {
        return new char[][]{
                {input.charAt(0), input.charAt(1), input.charAt(2)},
                {input.charAt(3), input.charAt(4), input.charAt(5)},
                {input.charAt(6), input.charAt(7), input.charAt(8)}
        };
    }

    private static void getUserInput(char[][] game) {
        while (true) {
            System.out.print("Enter the coordinates: ");
            String input = sc.nextLine();//31 31
            String[] in = input.split(" ");//["31", "31"]

            if (in.length != 2) {
                System.out.println("You should input numbers!");
                continue;
            }

            if (!isNumeric(in[0]) || !isNumeric(in[1])) {
                System.out.println("You should input numbers!");
                continue;
            }

            int i1 = Integer.parseInt(in[0]) - 1;
            int i2 = Integer.parseInt(in[1]) - 1;

            if (i1 < 0 || i1 > 2 || i2 < 0 || i2 > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            if (game[i1][i2] != '_') {
                System.out.println("This cell is occupied!");
                continue;
            }

            game[i1][i2] = 'X';
            break;
        }

    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

}

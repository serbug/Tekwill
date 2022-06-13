import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        exercisesCondition();

        menu();

    }

    public static void menu() throws IOException {

        System.out.println("\n\n###################################################################");
        System.out.println("#        1 - Stage 1 / 5           #          2 - Stage 2 / 5     #");
        System.out.println("#-----------------------------------------------------------------#");
        System.out.println("#        3 - Stage 3 / 5           #          4 - Stage 4 / 5     #");
        System.out.println("#-----------------------------------------------------------------#");
        System.out.println("#        5 - Stage 5 / 5           #          0 - Exit            #");
        System.out.println("###################################################################");

        int n = 9;

        while (n != 0) {
            //  clearConsole();

            System.out.print("\n Select Stage: ");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("\nStage 1 / 5 \n");
                    Stage1.printBoard();
                    pressAnyKey();
                }
                case 2 -> {
                    System.out.println("\nStage 2 / 5 \n");
                    Stage2.inputLine();
                    pressAnyKey();
                }
                case 3 -> {
                    System.out.println("\nStage 3 / 5 \n");
                    Stage3.checkStatus();
                    pressAnyKey();
                }
                case 4 -> {
                    System.out.println("\nStage 4 / 5 \n");
                    Stage4.analyzeGameState();
                    pressAnyKey();
                }
                case 0 -> {
                    System.out.println("\n\t\t\tExit...!!!\n");
                }
                default -> {
                    System.out.println("\n\t\tError: - Invalid input. Try again !");
                    pressAnyKey();
                }
            }

        }
    }

    public static void exercisesCondition() throws IOException {

        System.out.println("\nDo you want to read the condition of the exercises? Yes / No\n");

        String check = "";

        while (!check.equals("yes") && !check.equals("no")) {

            System.out.print("Option: ");
            check = sc.next();

            switch (check.toLowerCase().trim()) {
                case "yes" -> {
                    printPDF();
                    pressAnyKey();
                }
                case "no" -> {
                    pressAnyKey();
                }
                default -> {
                    System.out.println("\nError: - Invalid input. Try again !\n");
                }
            }
        }

    }

    public static void pressAnyKey() throws IOException {
        System.out.println("\nPress any key to continue...");
        System.in.read();
    }

    //Method to open pdf file in browser
    public static void printPDF() {
        try {

            File pdfFile = new File("resource/doc/Tic_Tac_Toe.pdf");
            if (pdfFile.exists()) {

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }

            } else {
                System.out.println("File is not exists!");
            }

            System.out.println("\nFile " + pdfFile.getName() + " opened! Check your Browser or PDF viewer app! ");

        } catch (Exception ex) {
            ex.printStackTrace();
        }


        //Method open PDF in console
//        try (PDDocument document = PDDocument.load(new File("resource/doc/Tic_Tac_Toe.pdf"))) {
//
//            document.getClass();
//
//            if (!document.isEncrypted()) {
//
//                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
//                stripper.setSortByPosition(true);
//
//                PDFTextStripper tStripper = new PDFTextStripper();
//
//                String pdfFileInText = tStripper.getText(document);
//                //System.out.println("Text:" + st);
//
//                // split by whitespace
//                String lines[] = pdfFileInText.split("\\r?\\n");
//                for (String line : lines) {
//                    System.out.println(line);
//                }
//
//            }
//
//        }

    }
}

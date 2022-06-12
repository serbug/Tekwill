import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Main {
    public static void main(String[] args) throws IOException {
       // String NAME_OF_FILE="/doc/Tic Tac Toe.pdf";
        System.out.println("View conditions");

       printPDF(); // Test method

        System.out.println("Stage 1 / 5 \n");
        Stage1.printBoard();

        System.out.println("\nStage 2 / 5 \n");
        Stage2.inputLine();

        System.out.println("\nStage 3 / 5 \n");
        Stage3.checkStatus();

        System.out.println("\nStage 4 / 5 \n");
        Stage4.analyzeGameState();
    }

    public static void printPDF() throws IOException {
        //Loading an existing document
        File file = new File("resource/doc/Tic Tac Toe.pdf");
        PDDocument document = PDDocument.load(file);
        //Instantiate PDFTextStripper class
        PDFTextStripper pdfStripper = new PDFTextStripper();
        //Retrieving text from PDF document
        String text = pdfStripper.getText(document);
        System.out.println(text);
        //Closing the document
        document.close();
    }
}

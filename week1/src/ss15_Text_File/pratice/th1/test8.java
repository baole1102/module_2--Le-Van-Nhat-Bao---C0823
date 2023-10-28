package ss15_Text_File.pratice.th1;

import java.io.File;
import java.io.PrintWriter;

public class test8 {
    public static void main(String[] args) throws Exception {
        File file = new File("score.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
        try (PrintWriter output = new PrintWriter(file)) {

            output.print("John T Smith ");

            output.println(90);

            output.print("Eric K Jones ");

            output.println(85);
        }
    }
}

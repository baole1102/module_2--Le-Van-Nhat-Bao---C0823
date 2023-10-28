package ss15_Text_File.pratice.th1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test11 {
    public static void main(String[] args) throws IOException {
        int ch;
        FileReader fr = null;
        try {
            fr = new FileReader("text");
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (Exception    e) {
            System.out.println("File not found");
        }finally {
            fr.close();
        }

    }
}

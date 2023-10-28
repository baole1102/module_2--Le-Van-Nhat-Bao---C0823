package ss15_Text_File.pratice.th1;

import java.io.*;

public class test {
    public static void main(String[] args) {
        try {
            File inFile = new File("Hello.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {

        }
    }
}


package ss15_Text_File.pratice.th1;

import java.io.File;
import java.io.FileWriter;

public class Test10 {
    public static void main(String[] args) {
        String str = "File Handing in Java using "+ " FileWriter and FileReader";
       try {
           FileWriter fr = new FileWriter("output.txt");
           for (int i = 0; i < str.length(); i++) {
               fr.write(str.charAt(i));
           }
           System.out.println("Writing succesful");
           fr.close();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}

package ss15_Text_File.pratice.th2.branch1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterText {
    public static void main(String[] args) {
        int [] arr = {1,2,5,7,8};
      try {
          FileWriter fw = new FileWriter("text1.txt");
          BufferedWriter bw = new BufferedWriter(fw);
          for (Integer o : arr){
              String str = Integer.toString(o);
              bw.write(str);
              bw.newLine();
          }
          bw.close();
          fw.close();
      }catch (Exception e){
          System.err.println("Loi");
      }

    }
}

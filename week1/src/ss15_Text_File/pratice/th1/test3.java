package ss15_Text_File.pratice.th1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class test3 {
    public static void main(String[] args) {
       File file = new File("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss15_Text_File\\pratice\\th1\\test");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }else {
            System.out.println("0");
        }
//        file.mkdir();
        try {
            PrintWriter output = new PrintWriter(file);
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

package ss15_Text_File.pratice.th1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test9Scanner {
    public static void main(String[] args) {
        scannerFromFile();
    }
    public static void scannerFromFile(){
        try {
            File file = new File("hl2.txt");
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                String firstName = scanner.next();
                String mi = scanner.next();
                String lastName = scanner.next();
                int score = scanner.nextInt();
                System.out.println(firstName+" "+mi +" "+lastName+" "+score);
            }
            scanner.close();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

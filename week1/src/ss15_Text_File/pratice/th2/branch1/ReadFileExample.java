package ss15_Text_File.pratice.th2.branch1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = " + sum);

        } catch (Exception e) {
            System.err.println("File khong ton tai ");
        }
    }

    public static void main(String[] args) {
        System.out.println(" Nhap duong dan file ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample rfe = new ReadFileExample();
        rfe.readFileText(path);
    }
}

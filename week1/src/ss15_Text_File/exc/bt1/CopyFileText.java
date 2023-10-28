package ss15_Text_File.exc.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
        private static Scanner scanner = new Scanner(System.in);

    public List<String> readFile() {
        List<String> list = new ArrayList<>();
        try {
            File file = new File("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss15_Text_File\\exc\\bt1\\source file");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File khong ton tai");
        }
        return list;
    }

    public void writeFile(List<String> list) {
        try {
            boolean isBoolean = false;
            System.out.println("Do you want copy this file? Y/ N");
            do {
                String str = scanner.nextLine();
                if (str.equals("Y")) {
                    break;
                } else if (str.equals("N")) {
                    isBoolean = true;
                    break;
                } else {
                    System.out.println("Enter again!!!");
                }
            } while (true);
            if (!isBoolean) {
                FileWriter fw = new FileWriter("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss15_Text_File\\exc\\bt1\\target file");
                BufferedWriter bw = new BufferedWriter(fw);
                for (String str : list) {
                    bw.write(str);
                }
                bw.close();
                System.out.println("Finish");
            }
        } catch (Exception e) {
            System.out.println("File ko ton tai");
        }
    }

    public int maxWord(List<String> list) {
        String lengthWord;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            lengthWord = list.get(i);
            for (int j = 0; j < lengthWord.length(); j++) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CopyFileText cft = new CopyFileText();
        List<String> list = cft.readFile();
        int valueMax = cft.maxWord(list);
        cft.writeFile(list);
        System.out.println("Tong so ky tu trong chuoi la: " + valueMax);
    }

}

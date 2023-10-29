package ss15_text_file.exc.bt1;

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
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
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
                FileWriter fileWriter = new FileWriter("D:\\module_2--Le-Van-Nhat-Bao---C0823\\week1\\src\\ss15_Text_File\\exc\\bt1\\target file");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (String str : list) {
                    bufferedWriter.write(str);
                }
                bufferedWriter.close();
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
        CopyFileText fileText = new CopyFileText();
        List<String> list = fileText.readFile();
        int valueMax = fileText.maxWord(list);
        fileText.writeFile(list);
        System.out.println("Tong so ky tu trong chuoi la: " + valueMax);
    }

}

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
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File("ss15_text_file/exc/bt1/source file");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (Exception e) {
            System.out.println("File khong ton tai");
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return list;
    }

    public void writeFile(List<String> list) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
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
                fileWriter = new FileWriter("ss15_text_file/exc/bt1/target file");
                bufferedWriter = new BufferedWriter(fileWriter);
                for (String str : list) {
                    bufferedWriter.write(str);
                }
                bufferedWriter.close();
                System.out.println("Finish");
            }
        } catch (Exception e) {
            System.out.println("File ko ton tai");
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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

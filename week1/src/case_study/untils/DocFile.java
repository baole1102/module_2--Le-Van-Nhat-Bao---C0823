package case_study.untils;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    private static final String PATH = "case_study/docfile/Bao.txt";
    public static void writeFile(List<Employee> employees){
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
             fileWriter = new FileWriter(file);
             bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Employee string : employees){
                bufferedWriter.write(String.valueOf(string));
                bufferedWriter.newLine();
            }
        } catch (RuntimeException e) {
           e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

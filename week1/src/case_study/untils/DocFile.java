package case_study.untils;

import case_study.model.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DocFile {
    private static final String PATH = "case_study/docfile/Bao.txt";
    public static void writeFile(List<Employee> employees){
        try {
            File file = new File(PATH);
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Employee string : employees){
                bufferedWriter.write(String.valueOf(string));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (RuntimeException e) {
           e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

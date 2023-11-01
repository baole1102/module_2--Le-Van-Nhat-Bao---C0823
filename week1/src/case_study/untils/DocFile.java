package case_study.untils;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    private static final String PATH = "case_study/docfile/Bao.txt";
    public static void writeFile(List<Employee> employees){
        try {
            File file = new File(PATH);
            FileWriter fileWriter = new FileWriter(file);
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
    public static List<Employee> readFile(List<Employee> employees){
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
        //    employees = (List<Employee>)  bufferedReader.read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employees;
    }
}

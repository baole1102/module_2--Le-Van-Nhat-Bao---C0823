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
        Employee employee = null;
        try {
             fileWriter = new FileWriter(file);
             bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
          for (Employee string : employees){
                bufferedWriter.write(string.toString());
                bufferedWriter.newLine();
//              if (string != null){
//                 line = employee.getCode() + "," + employee.getName() + "," + employee.getDate() + "," +
//                          employee.getGender() + "," + employee.getIdentify() + "," + employee.getNumber() + "," +
//                          employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," +
//                          employee.getSalary();
//                 bufferedWriter.write(line);
//                  bufferedWriter.newLine();
//              }
          }
        } catch (RuntimeException e) {
           e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

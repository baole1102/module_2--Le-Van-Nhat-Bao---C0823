package case_study.untils.read_and_write_employee;

import case_study.model.modulePerson.Employee;

import java.io.*;
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
          for (Employee employee : employees){

              if (employee != null){
                 line = employee.getCode() + "," + employee.getName() + "," + employee.getDate() + "," +
                          employee.getGender() + "," + employee.getIdentify() + "," + employee.getNumber() + "," +
                          employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," +
                          employee.getSalary();
                 bufferedWriter.write(line);
                  bufferedWriter.newLine();
              }
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

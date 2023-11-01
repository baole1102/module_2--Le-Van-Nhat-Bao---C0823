package case_study.untils;

import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private static final String PATH = "case_study/docfile/Bao.txt";

    public static List<Employee> readFile() {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Employee> employees = new ArrayList<>();
        Employee employee;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] newArr;
            while ((line = bufferedReader.readLine()) != null) {
                newArr = line.split(",");
                String code = newArr[0];
                String name = newArr[1];
                String date = newArr[2];
                String gender = newArr[3];
                long identify = Long.parseLong(newArr[4]);
                long number = Long.parseLong(newArr[5]);
                String email = newArr[6];
                String level = newArr[7];
                String position = newArr[8];
                double salary = Double.parseDouble(newArr[9]);
                employee = new Employee(code, name, date, gender, identify, number, email, level, position, salary);
                employees.add(employee);
                line = bufferedReader.readLine();
            }
        }catch (NumberFormatException e){
            System.err.println("Error Exeption");
            e.printStackTrace();
        } catch (IOException e1) {
            System.err.println("Error Exeption");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
               throw new RuntimeException();
            } catch (RuntimeException e) {
                System.err.println("Nothing!!!");
            }
        }
        return employees;
    }
}

package case_study.untils.read_and_write_employee;

import case_study.model.modulePerson.Employee;

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
                if (newArr.length == 10) {
                    String code = newArr[0];
                    String name = newArr[1];
                    String date = newArr[2];
                    String gender = newArr[3];
                    String identify = newArr[4];
                    String number = newArr[5];
                    String email = newArr[6];
                    String level = newArr[7];
                    String position = newArr[8];
                    Double salary = Double.parseDouble(newArr[9]);
                    employee = new Employee(code, name, date, gender, identify, number, email, level, position, salary);
                    employees.add(employee);
                }
            }
        }
        catch (IOException e1) {
            System.err.println("Error Exeption");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return employees;
    }
}

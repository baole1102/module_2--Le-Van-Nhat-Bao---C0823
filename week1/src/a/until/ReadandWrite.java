package a.until;

import a.module.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadandWrite {
    private static final String PATH = "a/doc/employee.cvs";

    public static List<Employee> readFile() {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Employee> list = new ArrayList<>();
        Employee employee;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] newArr;
            while ((line = bufferedReader.readLine()) != null) {
                newArr = line.split(",");
              //  if (newArr.length == 5) {
                    String id = newArr[0];
                    String name = newArr[1];
                    String location = newArr[2];
                    String date = newArr[3];
                    double saraly = Double.parseDouble(newArr[4]);
                    employee = new Employee(id, name, location, date, saraly);
                    list.add(employee);
              //  }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return list;
    }

    public static void writeFile(List<Employee> employees) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Employee employee : employees) {
                line = employee.getId() + "," + employee.getName() + "," + employee.getLocation() + "," + employee.getDay() + "," + employee.getSaraly();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

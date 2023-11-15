package test.until;

import test.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWCustomer {
    private static final String PATH = "test/doc/customer.cvs";

    public static List<Customer> readFile() {
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        Customer customer;
        List<Customer> list = new ArrayList<>();
        try {
            String[] newArr;
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                newArr = line.split(",");
               if (newArr.length == 5){
                   String id = newArr[0];
                   String name = newArr[1];
                   String location = newArr[2];
                   String date = newArr[3];
                   double saraly = Double.parseDouble(newArr[4]);
                   customer = new Customer(id, name, location, date, saraly);
                   list.add(customer);
               }
            }
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

    public static void writeFile(List<Customer> customers) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Customer customer : customers) {
                if (customer != null) {
                    line = customer.getId() + "," + customer.getName() + "," + customer.getLocation() + "," + customer.getDate() + "," + customer.getSaraly();
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

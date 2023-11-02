package case_study.untils.readandwriteCustomer;

import case_study.model.modulePerson.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private final static String PATH = "case_study/docfile/Customer.csv";
    public static List<Customer> readFile(){
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<Customer> customers = new ArrayList<>();
        Customer customer;
        String [] newArr;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
                newArr = line.split(",");
                String code = newArr[0];
                String name = newArr[1];
                String date = newArr[2];
                String gender = newArr [3];
                String identify = newArr[4];
                String number = newArr[5];
                String email = newArr[6];
                String level = newArr [7];
                String address = newArr[8];
                customer = new Customer(code,name,date,gender,identify,number,email,level,address);
                customers.add(customer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return customers;
    }
}

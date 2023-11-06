package case_study.untils.read_and_write_customer;

import case_study.model.modulePerson.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCustomer {
    private static final String PATH = "case_study/docfile/Customer.csv";

    public static void writeFile(List<Customer> customers) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        String line = "";
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customers){
                if (customer != null){
                    line = customer.getCode()+ "," + customer.getName()+"," + customer.getDate()+"," + customer.getGender()+"," + customer.getIdentify()+"," + customer.getNumber()+"," + customer.getEmail()+"," + customer.getLevel()+"," + customer.getAddress();
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (bufferedWriter!= null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

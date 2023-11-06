package case_study.repository.impl;

import case_study.model.modulePerson.Customer;
import case_study.repository.ICustomerRepository;
import case_study.untils.read_and_write_customer.ReadFile;
import case_study.untils.read_and_write_customer.WriteFileCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private List<Customer> customers = ReadFile.readFile();

    @Override
    public List<Customer> showList() {
        return ReadFile.readFile();
    }

    @Override
    public boolean findId(String id) {
        customers = ReadFile.readFile();
        for (Customer customer : customers) {
            if (customer.getCode().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addCustomer(Customer customer) {
        customers = ReadFile.readFile();
        customers.add(customer);
        WriteFileCustomer.writeFile(customers);
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        customers = ReadFile.readFile();
        for (Customer customer1 : customers) {
            if (customer1.getCode().equals(id)) {
                customer1.setName(customer.getName());
                customer1.setDate(customer.getDate());
                customer1.setGender(customer.getGender());
                customer1.setIdentify(customer.getIdentify());
                customer1.setNumber(customer.getNumber());
                customer1.setEmail(customer.getEmail());
                customer1.setLevel(customer.getLevel());
                customer1.setAddress(customer.getAddress());
                break;
            }
        }
        WriteFileCustomer.writeFile(customers);
    }

    @Override
    public void remove(String id) {
        customers = ReadFile.readFile();
        for (Customer customer : customers) {
            if (customer.getCode().equals(id)) {
                customers.remove(customer);
                break;
            }
        }
        WriteFileCustomer.writeFile(customers);
    }

    @Override
    public List<Customer> findName(String name) {
        customers = ReadFile.readFile();
        List<Customer> customers1 = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().toLowerCase().contains(name.toLowerCase())) {
                customers1.add(customer);
            }
        }
        return customers1;
    }
}

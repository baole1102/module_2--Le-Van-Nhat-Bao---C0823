package test.responsibility;

import test.model.Customer;
import test.until.RWCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerReposibility implements ICustomerReposibility {
    private static final List<Customer> customers = RWCustomer.readFile();

    @Override
    public List<Customer> showList() {
        return customers;
    }

    @Override
    public boolean findId(String id) {
        for (Customer customer : customers){
            if (customer.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void addCustomer(Customer customer1) {
        customers.add(customer1);
        RWCustomer.writeFile(customers);
    }

    @Override
    public void remove(String id) {
        for (Customer customer: customers){
            if (customer.getId().equals(id)){
                customers.remove(customer);
            }
        }
        RWCustomer.writeFile(customers);
    }

    @Override
    public void editCustomer(String id, Customer customer1) {
        for (Customer customer : customers){
            if (customer.getId().equals(id)){
                customer.setId(id);
                customer.setName(customer1.getName());
                customer.setLocation(customer1.getLocation());
                customer.setDate(customer1.getDate());
                customer.setSaraly(customer1.getSaraly());
                break;
            }
        }
        RWCustomer.writeFile(customers);
    }

    @Override
    public List<Customer> findName(String name) {
        List<Customer> list  =new ArrayList<>();
        for (Customer customer: customers){
            if (customer.getName().toLowerCase().contains(name.toLowerCase())){
                list.add(customer);
            }
        }
        return list;
    }
}

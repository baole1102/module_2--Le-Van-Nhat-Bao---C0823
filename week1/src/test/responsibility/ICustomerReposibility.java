package test.responsibility;

import test.model.Customer;

import java.util.List;

public interface ICustomerReposibility {
    List<Customer> showList();

    boolean findId(String id);

    void addCustomer(Customer customer1);

    void remove(String id);

    void editCustomer(String id, Customer customer1);

    List<Customer> findName(String name);
}

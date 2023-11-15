package test.service;

import test.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> showList();

    boolean findId(String id);

    void addCustomer(Customer customer1);

    boolean remove(String id);

    void editCustomer(String id, Customer customer1);

    List<Customer> findName(String name);
}

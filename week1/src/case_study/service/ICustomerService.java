package case_study.service;

import case_study.model.modulePerson.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> showList();

    boolean findID(String id);

    void addCustomer(Customer customer);

    void editCustomer(String id, Customer customer);

    boolean remove(String id);

    List<Customer> findName(String name);
}

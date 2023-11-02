package case_study.repository;

import case_study.model.modulePerson.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> showList();

    boolean findId(String id);

    void addCustomer(Customer customer);

    void editCustomer(String id, Customer customer);

    void remove(String id);

    List<Customer> findName(String name);
}

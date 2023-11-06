package case_study.controller;

import case_study.model.modulePerson.Customer;
import case_study.service.impl.CustomerService;
import case_study.service.ICustomerService;

import java.util.List;

public class CustomerController {
    private ICustomerService iCustomerService = new CustomerService();

    public List<Customer> showList() {
        return iCustomerService.showList();
    }

    public boolean findId(String id) {
        return iCustomerService.findID(id);
    }

    public void addCustomer(Customer customer) {
        iCustomerService.addCustomer(customer);
    }

    public void editCustomer(String id, Customer customer) {
        iCustomerService.editCustomer(id,customer);
    }

    public boolean remove(String id) {
        return iCustomerService.remove(id);
    }

    public List<Customer> findName(String name) {
        return iCustomerService.findName(name);
    }
}

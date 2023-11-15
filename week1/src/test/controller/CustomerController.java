package test.controller;

import test.model.Customer;
import test.service.CustomerService;
import test.service.ICustomerService;

import java.util.List;

public class CustomerController {
    private final ICustomerService iCustomerService = new CustomerService();

    public List<Customer> showList() {
       return iCustomerService.showList();
    }

    public boolean findId(String id) {
        return iCustomerService.findId(id);
    }

    public void addCustomer(Customer customer1) {
        iCustomerService.addCustomer(customer1);
    }

    public boolean remove(String id) {
        return iCustomerService.remove(id);
    }

    public void editCustomer(String id, Customer customer1) {
        iCustomerService.editCustomer(id,customer1);
    }

    public List<Customer> findName(String name) {
        return iCustomerService.findName(name);
    }
}

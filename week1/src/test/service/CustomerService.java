package test.service;

import test.model.Customer;
import test.responsibility.CustomerReposibility;
import test.responsibility.ICustomerReposibility;

import java.util.List;

public class CustomerService implements ICustomerService {
    private final ICustomerReposibility iCustomerReposibility = new CustomerReposibility();

    @Override
    public List<Customer> showList() {
        return iCustomerReposibility.showList();
    }

    @Override
    public boolean findId(String id) {
        return iCustomerReposibility.findId(id);
    }

    @Override
    public void addCustomer(Customer customer1) {
        iCustomerReposibility.addCustomer(customer1);
    }

    @Override
    public boolean remove(String id) {
        boolean customer = iCustomerReposibility.findId(id);
        if (!customer){
            return false;
        }else {
            iCustomerReposibility.remove(id);
            return true;
        }

    }

    @Override
    public void editCustomer(String id, Customer customer1) {
        iCustomerReposibility.editCustomer(id,customer1);
    }

    @Override
    public List<Customer> findName(String name) {
        return iCustomerReposibility.findName(name);
    }
}

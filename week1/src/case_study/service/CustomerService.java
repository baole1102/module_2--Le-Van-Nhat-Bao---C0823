package case_study.service;

import case_study.model.modulePerson.Customer;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
    private ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> showList() {
        return iCustomerRepository.showList();
    }

    @Override
    public boolean findID(String id) {
        return iCustomerRepository.findId(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        iCustomerRepository.addCustomer(customer);
    }

    @Override
    public void editCustomer(String id, Customer customer) {
        iCustomerRepository.editCustomer(id,customer);
    }

    @Override
    public boolean remove(String id) {
        boolean customer =  iCustomerRepository.findId(id);
        if (!customer){
            return false;
        }else {
            iCustomerRepository.remove(id);
            return true;
        }
    }

    @Override
    public List<Customer> findName(String name) {
        return iCustomerRepository.findName(name);
    }
}

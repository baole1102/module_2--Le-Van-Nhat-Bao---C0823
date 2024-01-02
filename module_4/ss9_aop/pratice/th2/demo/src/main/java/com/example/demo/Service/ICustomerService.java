package com.example.demo.Service;

import com.example.demo.Exeption.DuplicateEmailException;
import com.example.demo.Model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save(Customer customer) throws DuplicateEmailException;
    Customer findById(Long id);
    void delete(Long id);
}

package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById (int id);
    void update(int id, Customer customer);
    void add (Customer customer);
    void delete (int id);

}

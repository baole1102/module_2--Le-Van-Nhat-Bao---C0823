package com.example.repository;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    void update(int id, Customer customer);
    Customer findById (int id);
    void add (Customer customer);
    void delete (int id);
}

package com.example.demo.Service;

import com.example.demo.Model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll() throws Exception;

    Customer findOne(Long id) throws Exception;
}

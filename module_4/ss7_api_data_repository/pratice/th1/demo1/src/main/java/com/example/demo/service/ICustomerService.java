package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.model.Province;

public interface ICustomerService extends IGenerateService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}

package com.example.repository;

import com.example.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private static final List<Customer> list = new ArrayList<>();
    static {
        list.add(new Customer(1, "Lê Văn Độ", "dobeo@gmail.com", "Quãng Nam"));
        list.add(new Customer(2, "Vi", "vi@gmail.com", "Quãng Nam"));
        list.add(new Customer(3, "Phương Lế", "phuong@gmail.com", "Quãng Trị"));
        list.add(new Customer(4, "Bảo Lê Đẹp Trai", "baodt@gmail.com", "Huế"));
    }
    @Override
    public List<Customer> findAll() {
        return list;
    }
}

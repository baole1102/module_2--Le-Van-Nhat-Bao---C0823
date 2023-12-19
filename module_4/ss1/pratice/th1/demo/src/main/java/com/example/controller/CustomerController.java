package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
public class CustomerController {
    private static final ICustomerService customerService = new CustomerService();
    @GetMapping("/")
    public String showList(HttpServletRequest request){
        List<Customer> customers = customerService.findAll();
        request.setAttribute("list",customers);
        return "/baolengaoda";
    }
}

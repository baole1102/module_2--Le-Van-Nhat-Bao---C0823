package com.example.demo.Controller;

import com.example.demo.Model.Customer;
import com.example.demo.Service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public ModelAndView showList() {
        try {
            ModelAndView modelAndView = new ModelAndView("/customer/list");
            List<Customer> customers = customerService.findAll();
            modelAndView.addObject("customers", customers);
            return modelAndView;
        } catch (Exception e) {
            return new ModelAndView("redirect:/customers");
        }
    }

    @GetMapping("/{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        try {
            ModelAndView modelAndView = new ModelAndView("/customer/info");
            Customer customer = customerService.findOne(id);
            modelAndView.addObject("customer", customer);
            return modelAndView;
        } catch (Exception e) {
            return new ModelAndView("redirect:/customers");
        }
    }
}
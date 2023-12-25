package com.example.controller;

import com.example.model.Customer;
import com.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("/")
    public String home(Model model) {
        List<Customer> list = iCustomerService.findAll();
        model.addAttribute("customer", list);
        return "/home";
    }

    @GetMapping("/add")
    public String addGet(Model model) {
        model.addAttribute("save", new Customer());
        return "/add";
    }

    @PostMapping("/newAdd")
    public String addPost(Customer customer) {
        iCustomerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String remove(@RequestParam(name = "idEdit") Long id) {
        iCustomerService.remove(id);
        return "redirect:/";
    }
}

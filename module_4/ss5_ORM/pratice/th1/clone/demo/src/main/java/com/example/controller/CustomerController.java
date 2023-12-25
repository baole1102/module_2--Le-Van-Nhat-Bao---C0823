package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    private static final ICustomerService customerService = new CustomerService();

    @GetMapping("/")
    public String home(Model model) {
        List<Customer> list = customerService.findAll();
        model.addAttribute("list", list);
        return "/home";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(Customer customer) {
        customerService.update(customer.getId(), customer);
        return "redirect:/";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("addCustomer", new Customer());
        return "/add";
    }

    @PostMapping("/add")
    public String add(Customer customer) {
        customer.setId((int) (Math.random() * 10000));
        customerService.add(customer);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        customerService.delete(id);
        return "redirect: /";
    }

    @GetMapping("/view/{id}")
    public String view (Model model, @PathVariable int id){
        model.addAttribute("view",customerService.findById(id));
        return "/view";
    }

}

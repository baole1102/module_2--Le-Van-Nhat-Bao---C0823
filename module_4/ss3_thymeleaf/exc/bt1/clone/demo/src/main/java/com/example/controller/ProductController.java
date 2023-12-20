package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    private static final IProductService productService = new ProductService();

    @GetMapping("/")
    public String home(Model model) {
        List<Product> list = productService.findByAll();
        model.addAttribute("product", list);
        return "/home";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        return "/add";
    }

    @PostMapping("/add")
    public String add(Product product) {
        product.setId((int) (Math.random() * 10000));
        productService.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable int id, Model model, Product product) {
        product = productService.findById(id);
        model.addAttribute("product", product);
        return "/edit";
    }

    @PostMapping("/edit")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delele(@PathVariable int id) {
        productService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/detail";
    }

    @GetMapping("/search")
    public String search(@RequestParam String name, Model model) {
        List<Product> list = productService.findName(name);
        model.addAttribute("product", list);
        return "/search";
    }

}

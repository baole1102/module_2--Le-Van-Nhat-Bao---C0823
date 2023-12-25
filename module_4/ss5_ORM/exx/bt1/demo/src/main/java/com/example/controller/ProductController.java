package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @GetMapping("/")
    public String home(Model model){
        List<Product> products = iProductService.showList();
        model.addAttribute("products",products);
        return "/view";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("products",new Product());
        return "/create";
    }

    @PostMapping("/create")
    public String create(Product product){
        iProductService.addNewProduct(product);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable int id, Model model){
        model.addAttribute("products",iProductService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product){
        iProductService.addNewProduct(product);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id,Model model){
        System.out.println(id);
        model.addAttribute("products",iProductService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product){
        int id = product.getId();
        iProductService.remove(id);
        return "redirect:/";
    }
    @GetMapping("/{id}/details")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("products", iProductService.findById(id));
        return "/details";
    }

    @GetMapping ("/search")
    public String search(){
        return "/search";
    }

    @PostMapping ("/search")
    public String search(@RequestParam("name") String name, Model model){
        List<Product> products = iProductService.search(name);
        System.out.println(products.size());
        model.addAttribute("products",products);
        return "/search";
    }
}

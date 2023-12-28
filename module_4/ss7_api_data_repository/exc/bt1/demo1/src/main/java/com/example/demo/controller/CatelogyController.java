package com.example.demo.controller;

import com.example.demo.model.Catelogy;
import com.example.demo.service.IBlogService;
import com.example.demo.service.ICatelogyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class CatelogyController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICatelogyService catelogyService;

    @GetMapping("/addCatelogy")
    public String addCatelogy(Model model){
        model.addAttribute("catelogy",new Catelogy());
        return "/addCatelogy";
    }
    @PostMapping("/newAddCatelogy")
    public String add(Catelogy catelogy){
        catelogyService.save(catelogy);
        return "redirect:/getAll";
    }

    @GetMapping("/getAll")
    public String home(Model model){
        Iterable<Catelogy> list = catelogyService.findAll();
        model.addAttribute("catelogys",list);
        return "/homeCatelogy";
    }

   @GetMapping("/edit/{id}")
    public String editCatelogy(@PathVariable Long id, Model model){
        Optional<Catelogy> catelogy = catelogyService.findById(id);
        model.addAttribute("catelogy", catelogy);
        return "/editCatelogy";
   }

   @PostMapping("/editCatelogy")
    public String edit(Catelogy catelogy){
        catelogyService.save(catelogy);
        return "redirect:/getAll";
   }

   @GetMapping("/deleteCatelogy")
    public String delete(@RequestParam(name = "idEdit") Long id, Model model){
        catelogyService.remove(id);
        return "redirect:/getAll";
   }

}

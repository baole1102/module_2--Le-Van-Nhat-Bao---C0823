package com.example.controller;

import com.example.model.Blog;
import com.example.repository.IBlogRepository;
import com.example.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    IBlogService iBlogService;

    @GetMapping("/")
    public String home(Model model) {
        List<Blog> list = iBlogService.findAll();
        model.addAttribute("blog", list);
        return "/home";
    }

    @GetMapping("/add")
    public String addGet(Model model) {
        model.addAttribute("save", new Blog());
        return "/add";
    }

    @PostMapping("/newAdd")
    public String addPost(Blog blog) {
        iBlogService.save(blog);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String remove(@RequestParam(name = "idEdit") Long id) {
        iBlogService.remove(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editGet(@PathVariable Long id, Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "/edit";
    }

    @PostMapping("/edit")
    public String editPost(Blog blog){
        iBlogService.save(blog);
        return "redirect:/";
    }
    @GetMapping("/detail/{id}")
    public String detail (@PathVariable Long id,Model model){
        Blog blog = iBlogService.findById(id);
        model.addAttribute("blog",blog);
        return "/detail";
    }
}

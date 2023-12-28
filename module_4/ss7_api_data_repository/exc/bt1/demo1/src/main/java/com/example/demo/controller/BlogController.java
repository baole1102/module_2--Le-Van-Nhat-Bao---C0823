package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Catelogy;
import com.example.demo.service.IBlogService;
import com.example.demo.service.ICatelogyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICatelogyService catelogyService;

    @ModelAttribute("catelogy")
    Iterable<Catelogy> catelogies() {
        return catelogyService.findAll();
    }


    @GetMapping("")
    public String getAll(Model model) {
        Iterable<Blog> blogs = blogService.findAll();
//        Iterable<Catelogy> catelogies = catelogyService.findAll();
        model.addAttribute("blogs", blogs);
//        model.addAttribute("catelogies", catelogies);
        return "/home";
    }

    @GetMapping("/add")
    public String addBlog(Model model) {
        model.addAttribute("save", new Blog());
        Iterable<Catelogy> catelogies = catelogyService.findAll();
        model.addAttribute("catelogy", catelogies);
        return "/add";
    }

    @PostMapping("/newAdd")
    public String add(Blog blog) {
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/search")
    public String searchBlog(@RequestParam("name") String name, Model model, Pageable pageable) {
        Page<Blog> list = blogService.findByName(name, pageable);
        Page<Blog> page = blogService.findAll(pageable);
        model.addAttribute("search", list);
        return "/search";
    }

    @GetMapping("/detailBlog/{id}")
    public String detail(@PathVariable Long id, Model model) {
        Blog blog = blogService.findId(id);
        System.out.println(blog);
        model.addAttribute("blogs", blog);
        return "detail";
    }

    @GetMapping("/editBlog/{id}")
    public String editCatelogy(@PathVariable Long id, Model model) {
        Blog blog = blogService.findId(id);
        System.out.println(blog);
        model.addAttribute("blogs", blog);
        return "/editBlog";
    }

    @PostMapping("/editBlogs")
    public String edit(Blog blog) {
        System.out.println("a");
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/searchCatelogy")
    public String searchCatelogy(@RequestParam("id") Long id, Model model) {
        System.out.println("da vao controller");
        List<Blog> searchCatelogy = blogService.findCatelogy(id);
        model.addAttribute("searchCatelogy", searchCatelogy);
        return "/home";
    }
}

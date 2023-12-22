package com.example.controller;

import com.example.model.Student;
import com.example.service.IStudentService;
import com.example.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class StudentController {
    private static final IStudentService studentService = new StudentService();

    @GetMapping("/")
    public String home(Model model) {
        List<Student> list = studentService.findByAll();
        model.addAttribute("student", list);
        return "/home";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("student", new Student());
        return "/add";
    }

    @PostMapping("/add")
    public String add(Student student) {
        student.setId((int) (Math.random() * 10000));
        studentService.addProduct(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable int id, Model model, Student student) {
        student = studentService.findById(id);
        model.addAttribute("student", student);
        return "/edit";
    }

    @PostMapping("/edit")
    public String update(Student student) {
        studentService.update(student.getId(), student);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delele(@RequestParam(name = "idEdit") int id) {
        studentService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id, Model model) {
        model.addAttribute("student", studentService.findById(id));
        return "/detail";
    }

    @GetMapping("/search")
    public String search(@RequestParam String name, Model model) {
        List<Student> list = studentService.findName(name);
        model.addAttribute("student", list);
        return "/search";
    }
}

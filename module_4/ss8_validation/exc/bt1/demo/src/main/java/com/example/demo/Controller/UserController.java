package com.example.demo.Controller;

import com.example.demo.Model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/result")
    public String checkValidation(@Validated User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "/index";
        } else {
            return "/result";
        }

    }
}

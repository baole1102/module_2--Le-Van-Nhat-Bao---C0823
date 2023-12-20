package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyCalculator {
    @GetMapping("/")
    public String home() {
        return "/calculator";
    }

    @GetMapping("/caculate")
    public String calculate(@RequestParam double number1, @RequestParam double number2, @RequestParam("action") String button, Model model) {
        double result = 0;
        switch (button) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "x":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    model.addAttribute("result", "Không được chia cho 0");
                    return "/calculator";
                }
                result = number1 / number2;
                break;
        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("result", result);
        return "/calculator";
    }
}

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CalculateController {
    @GetMapping("/")
    public String result(HttpServletRequest request, @RequestParam(name = "usd",required = false) String usd) {
        try {
            if (usd != null){
                double number = Double.parseDouble(usd);
                double result = number * 23000;
                request.setAttribute("result", result +"VNĐ");
            }else {
                request.setAttribute("Error","Vui lòng nhập lại");
            }
        }catch (NumberFormatException  e){
            request.setAttribute("Error","Giá trị không phù hợp");
        }
        return "/calculate";
    }
}

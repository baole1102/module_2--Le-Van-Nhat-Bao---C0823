package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TuDienController {

    @GetMapping("/")
    public String home() {
        return  "/tudien";
    }

    @GetMapping("/tu-dien")
    public ModelAndView tuDien(@RequestParam(name = "eng") String language) {
        Map<String, String> map = new HashMap<>();
        map.put("Dog", "Chó");
        map.put("Cat", "Mèo");
        map.put("Banana", "Chuối");
        map.put("Libary", "Thư viện");
        map.put("Monkey", "Khỉ");


        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("result", map.get(language));
        modelMap.addAttribute("language", language);


        return new ModelAndView("/tudien", modelMap);
    }
}

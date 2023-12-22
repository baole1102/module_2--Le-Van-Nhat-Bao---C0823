package com.example.controller;

import com.example.model.MailBox;
import com.example.service.IMailBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MailController {
    @Autowired
    IMailBoxService mailBoxService;
    @GetMapping("/")
    public String home (Model model){
        List<String> languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
        List<Integer> pageSizeList = new ArrayList<>();
        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(15);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);
        model.addAttribute("languageList",languageList);
        model.addAttribute("pageSizeList",pageSizeList);
        model.addAttribute("mailBox",new MailBox());
        return "/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute MailBox mailBox, Model model){
        model.addAttribute("mailBox", mailBox);
        return "/home";
    }
}

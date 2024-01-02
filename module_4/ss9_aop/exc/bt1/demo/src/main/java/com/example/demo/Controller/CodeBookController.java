package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Model.CodeBook;
import com.example.demo.Service.IBookService;
import com.example.demo.Service.ICodeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeBookController {
    @Autowired
    private ICodeBookService codeBookService;
    @Autowired
    private IBookService bookService;

    @GetMapping("/borrow/{id}")
    public String borrow(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        Book book = bookService.findById(id);
        if (book.getSoLuongSach() <= 0) {
            model.addAttribute("errors", "Het sach muon");
            model.addAttribute("books",book);
            return "/rentDetail";
        }else {
            int idCode = book.getCodeBooks().getId();
            CodeBook codeBook = codeBookService.findById(idCode);
            model.addAttribute("codes", codeBook);
            book.setSoLuongSach(book.getSoLuongSach() - 1);
            bookService.save(book);
            return "/webCode";
        }

    }
}


package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Model.CodeBook;
import com.example.demo.Service.IBookService;
import com.example.demo.Service.ICodeBookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private ICodeBookService codeBookService;

    @GetMapping
    public String getAll(Model model) {
        List<Book> books = bookService.getAll();
        model.addAttribute("book", books);
        return "/home";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable int id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("books", book);
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(Book book) {
        bookService.save(book);
        return "redirect:/book";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        Book book = bookService.findById(id);
//        if (book.getSoLuongSach() == 0) {
            model.addAttribute("books", book);
            return "/rentDetail";
//        }
//        redirectAttributes.addFlashAttribute("errors","Het Sach");
//        return "redirect:/rentDetail";
    }

    @GetMapping("/traSach")
    public String traSach(@RequestParam String name, Model model, RedirectAttributes redirectAttributes) {
        CodeBook codeBook = codeBookService.findIdCode(name);
        if (codeBook == null) {
            redirectAttributes.addFlashAttribute("error", "Ma Khong Dung");
            return "redirect:/book";
        } else {
            int code = codeBook.getId();
            Book book = bookService.findCodeBook(code);
            book.setSoLuongSach(book.getSoLuongSach() + 1);
            bookService.save(book);
            return "redirect:/book";
        }
    }

}

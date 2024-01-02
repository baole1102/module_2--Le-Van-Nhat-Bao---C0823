package com.example.demo.Service;

import com.example.demo.Model.Book;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookService {
    List<Book> getAll();
    Book findById(int id);
    void save(Book book);
    Book findCodeBook( int id);
}

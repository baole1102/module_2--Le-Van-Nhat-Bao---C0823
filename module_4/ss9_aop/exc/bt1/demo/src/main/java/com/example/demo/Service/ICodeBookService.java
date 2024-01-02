package com.example.demo.Service;

import com.example.demo.Model.CodeBook;
import org.springframework.data.repository.query.Param;

public interface ICodeBookService {
    CodeBook findById(int id);
    CodeBook findIdCode( String code);
}

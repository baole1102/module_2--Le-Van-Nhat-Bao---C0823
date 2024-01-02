package com.example.demo.Service;


import com.example.demo.Model.CodeBook;
import com.example.demo.Repository.ICodeBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeBookService implements ICodeBookService{
    @Autowired
    private ICodeBookRepository codeBookRepository;

    @Override
    public CodeBook findById(int id) {
        return codeBookRepository.findById(id).get();
    }

    @Override
    public CodeBook findIdCode(String code) {
        return codeBookRepository.findIdCode(code);
    }
}

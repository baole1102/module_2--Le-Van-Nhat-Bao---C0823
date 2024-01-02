package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "code_book")
@Getter
@Setter
public class CodeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;

    @OneToMany(mappedBy = "codeBooks")
    private List<Book> book;
    public CodeBook() {
    }

    public CodeBook(int id, String code) {
        this.id = id;
        this.code = code;
    }
}

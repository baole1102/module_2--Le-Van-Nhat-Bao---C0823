package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int soLuongSach;
    private String author;

    @ManyToOne
    @JoinColumn(name = "codeBook_id", referencedColumnName = "id")
    private CodeBook codeBooks;

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

    public Book() {
    }

    public Book(int id, int soLuongSach, String author) {
        this.id = id;
        this.soLuongSach = soLuongSach;
        this.author = author;
    }
}

package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String content;

    private String date;
    private String author;
    private String img;

    @ManyToOne
    @JoinColumn(name = "catelogy_id")
    private Catelogy catelogy;
    public Blog() {
    }
    public Blog(Long id, String name, String content, String date, String author, String img) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.date = date;
        this.author = author;
        this.img = img;
    }

}

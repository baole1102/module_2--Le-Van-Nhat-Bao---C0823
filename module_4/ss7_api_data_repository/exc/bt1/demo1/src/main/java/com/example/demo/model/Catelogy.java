package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "catelogy")
@Getter
@Setter
public class Catelogy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany (mappedBy ="catelogy")
    private Set<Blog> blog;
    public Catelogy() {
    }

    public Catelogy(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}

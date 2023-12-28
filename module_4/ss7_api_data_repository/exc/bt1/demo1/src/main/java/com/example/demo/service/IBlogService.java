package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface IBlogService  {
    Blog findId(Long id);
    List<Blog> findAll();

    List<Blog> findCatelogy(Long id);
//    List<BlogDto> getAll();
    void save (Blog blog);
    Optional<Blog> findById(Long id);
    void remove(Long id);
    Page<Blog> findByName(String name, Pageable pageable);
    Page<Blog> findAll(Pageable pageable);

//    void saveDto(String name, String content,String date,String author,String img,Long id);
}

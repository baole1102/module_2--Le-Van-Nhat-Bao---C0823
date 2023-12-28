package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.repository.IBlogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService{

    @Autowired
    private IBlogRepository blogRepository;

//    @Override
//    public List<BlogDto> getAll() {
//        return blogRepository.findAll();
//    }


    @Override
    public Blog findId(Long id) {
        return blogRepository.findId(id);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> findCatelogy(Long id) {
        return blogRepository.findCatelogy(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page <Blog> findByName(String name, Pageable pageable) {
        return blogRepository.findByName("%"+name+"%",pageable);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

//    @Override
//    public void saveDto(String name, String content, String date, String author, String img, Long id) {
//
//    }

//    @Override
//    public void saveDto(String name, String content, String date, String author, String img, Long id) {
//        blogRepository.saveDto(name,content,date,author,img,id);
//    }
}

package com.example.demo.service;

import com.example.demo.model.Catelogy;
import com.example.demo.repository.ICatelogyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatelogyService implements ICatelogyService {

    @Autowired
    private ICatelogyRepository catelogyRepository;

    @Override
    public Iterable<Catelogy> findAll() {
        return catelogyRepository.findAll();
    }

    @Override
    public void save(Catelogy catelogy) {
        catelogyRepository.save(catelogy);
    }

    @Override
    public Optional<Catelogy> findById(Long id) {
        return catelogyRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        catelogyRepository.deleteById(id);
    }
}

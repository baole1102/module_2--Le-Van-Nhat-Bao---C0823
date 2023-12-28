package com.example.demo.service;

import com.example.demo.model.Province;
import com.example.demo.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService{
    @Autowired
    private IProvinceRepository iProvinceRepository;

    public Iterable<Province> findAll(){
        return iProvinceRepository.findAll();
    }

    @Override
    public void save(Province province) {
        iProvinceRepository.save(province);
    }

    public Optional<Province> findById(Long id){
        return iProvinceRepository.findById(id);
    }

    public void remove(Long id){
        iProvinceRepository.deleteById(id);
    }
}

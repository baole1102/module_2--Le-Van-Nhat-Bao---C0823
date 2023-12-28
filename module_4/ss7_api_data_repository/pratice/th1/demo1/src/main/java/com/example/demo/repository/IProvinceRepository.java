package com.example.demo.repository;

import com.example.demo.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province,Long> {
}

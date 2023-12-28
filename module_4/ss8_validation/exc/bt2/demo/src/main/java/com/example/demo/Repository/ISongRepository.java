package com.example.demo.Repository;

import com.example.demo.Model.Song;
import org.springframework.data.repository.CrudRepository;

public interface ISongRepository extends CrudRepository<Song,Integer> {
}

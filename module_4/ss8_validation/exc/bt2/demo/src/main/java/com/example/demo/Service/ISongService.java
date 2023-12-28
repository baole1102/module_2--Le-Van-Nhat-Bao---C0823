package com.example.demo.Service;

import com.example.demo.Model.Song;

import java.util.List;

public interface ISongService  {
    void save(Song song);

    List<Song> getAll();

    Song findByID(int id);
}

package com.example.demo.Service;

import com.example.demo.Model.Song;
import com.example.demo.Repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    ISongRepository iSongRepository;
    @Override
    public void save(Song song) {
    iSongRepository.save(song);
    }

    @Override
    public List<Song> getAll() {
        return (List<Song>) iSongRepository.findAll();
    }

    @Override
    public Song findByID(int id) {
        return iSongRepository.findById(id).get();
    }
}

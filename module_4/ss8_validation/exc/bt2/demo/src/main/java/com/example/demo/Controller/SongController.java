package com.example.demo.Controller;

import com.example.demo.Model.Song;
import com.example.demo.Service.ISongService;
import com.example.demo.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    ISongService iSongService;

    @GetMapping("/")
    public String home(Model model) {
        List<Song> songs = iSongService.getAll();
        model.addAttribute("songAll", songs);
        return "/home";
    }

    @GetMapping("/edit/{id}")
    public String editGet(Model model, @PathVariable int id) {
        Song song = iSongService.findByID(id);
        System.out.println(song);
        model.addAttribute("editSong", song);
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute("editSong") Song song, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "/edit";
        } else {
            iSongService.save(song);
            return "redirect:/";
        }
    }

    @GetMapping("/add")
    public String addGet(Model model) {
        model.addAttribute("addSong", new Song());
        return "/add";
    }

    @PostMapping("/addNew")
    public String add(@Validated @ModelAttribute("addSong") Song song, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return "/add";
        } else {
            iSongService.save(song);
            return "redirect:/";
        }
    }
}

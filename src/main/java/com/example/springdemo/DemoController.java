package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private SongRepository songRepository;

    @PostMapping("/add")
    public String addSong(@RequestParam String songName) {
        Song song = new Song();
        song.setSongName(songName);
        songRepository.save(song);
        return "Added new song to Playlist!";
    }

    @GetMapping("/list")
    public Iterable<Song> getSongs() {
        return songRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Song findSongById(@PathVariable Integer id) {
        return songRepository.findSongById(id);
    }



}

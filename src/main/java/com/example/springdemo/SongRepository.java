package com.example.springdemo;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Integer> {

    Song findSongById(Integer id);
}

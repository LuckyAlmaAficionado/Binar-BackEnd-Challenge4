package com.binar.demo.service;

import com.binar.demo.model.Films;
import com.binar.demo.repository.FilmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FilmsService {
    @Autowired
    FilmRepository repository;
    public List<Films> getAllFilms() {
        return repository.findAll();
    }
    public List<Films> postFilms(List<Films> films) {
        return repository.saveAll(films);
    }
    public Films postFilm(Films films) {
        if (repository.findById(films.getFilmCode()).isPresent()) throw new RuntimeException("data sudah ada");
        log.info("data dijalankan");
        return repository.save(films);
    }
    public Films updateFilm(Films films) {
        if (repository.findById(films.getFilmCode()).isPresent()) {
            Films update = repository.findById(films.getFilmCode()).orElse(null);
            update.setFilmName(films.getFilmName());
            update.setIsShowing(films.getIsShowing());
            return repository.save(update);
        } else {
            throw new RuntimeException("data tidak ditemukan");
        }
    }
    public List<Films> getByName(String movieName) {
        if (repository.findByFilmNameContaining(movieName).isEmpty()) throw new RuntimeException("data tidak ditemukan");
        return repository.findByFilmNameContaining(movieName);
    }
}

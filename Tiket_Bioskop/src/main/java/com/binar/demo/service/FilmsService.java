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

    // menambahkan film baru
    public List<Films> postFilms(List<Films> films) {
        log.info("postFilms: ", films);
        return repository.saveAll(films);
    }

    public Films postFilm(Films films) {
        if (repository.findById(films.getFilmCode()).isPresent()) throw new RuntimeException("data sudah ada");
        for (int i = 0; i < films.getSchedules().size(); i++) {
            films.getSchedules().get(i).setFilmCode(films.getFilmCode());
        }
        log.info("data dijalankan");
        return repository.save(films);
    }

    // mengupdate nama file
    public Films updateFilm(Films films) {
        log.info("updateFilms id: " + films.getFilmCode());
        if (repository.findById(films.getFilmCode()).isPresent()) {
            Films update = repository.findById(films.getFilmCode()).orElse(null);
            update.setFilmName(films.getFilmName());
            update.setIsShowing(films.getIsShowing());
            log.info("updateFilm: ", films);
            return repository.save(update);
        } else {
//            log.info("updateFilm: ", new RuntimeException("data tidak ditemukan"));
            throw new RuntimeException("data tidak ditemukan");
        }
    }

    // menampilkan film yang sedang tayang
    public List<Films> getByIsShowingActive() {
        log.error("ini error bos jangan di lanjut benerin dulu");
        return repository.findByIsShowingTrue();
    }

    public List<Films> getByName(String movieName) {
        if (repository.findByFilmNameContaining(movieName).isEmpty())
            throw new RuntimeException("data tidak ditemukan");
        return repository.findByFilmNameContaining(movieName);
    }

    // menghapus film
    public String deleteFilm(Films films) {
        log.info("deleteFilm: ", films);
        int id = films.getFilmCode();
        repository.deleteById(id);
        return "data dengan id: " + id + ", berhasil dihapus";
    }

    public String deleteFilmById(int id) {
        log.info("deleteFilmById: " + id);
        if (repository.findById(id).isEmpty()) throw new RuntimeException("data tidak ditemukan");
        repository.deleteById(id);
        return "data dengan id: " + id + ", berhasil dihapus";
    }
}

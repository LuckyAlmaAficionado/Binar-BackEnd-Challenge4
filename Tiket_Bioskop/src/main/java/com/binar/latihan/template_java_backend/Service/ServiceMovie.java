package com.binar.latihan.template_java_backend.Service;

import com.binar.latihan.template_java_backend.Entity.Movie;
import com.binar.latihan.template_java_backend.Repository.RepositoryMovie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMovie {

    @Autowired
    private RepositoryMovie repository;

    public List<Movie> getAllMovie() {
        return repository.findAll();
    }

    public Movie addMovie(Movie movie) {
        return repository.save(movie);
    }

    public List<Movie> addMovies(List<Movie> movies) {
        return repository.saveAll(movies);
    }

    public List<Movie> getMovieByGenre(String genre) {
        return repository.findByGenre(genre);
    }

    public Movie updateMovie(Movie movie) {
        Movie update = repository.findById(movie.getMovieID()).orElse(null);
        update.setTitle(movie.getTitle());
        update.setDescription(movie.getDescription());
        update.setDuration(movie.getDuration());
        update.setLanguage(movie.getLanguage());
        update.setRelease_Date(movie.getRelease_Date());
        update.setCountry(movie.getCountry());
        update.setGenre(movie.getGenre());
        return repository.save(update);
    }

    public String deleteById(int id) {
        repository.deleteById(id);
        return "berhasil di hapus...!";
    }
}

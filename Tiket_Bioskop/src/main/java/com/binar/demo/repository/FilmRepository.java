package com.binar.demo.repository;

import com.binar.demo.model.Films;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Films, Integer> {

    List<Films> findByIsShowingTrue();

    List<Films> findByFilmNameContaining(String movieName);
}

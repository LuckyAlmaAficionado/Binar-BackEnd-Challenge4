package com.binar.latihan.template_java_backend.Repository;

import com.binar.latihan.template_java_backend.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RepositoryMovie extends JpaRepository<Movie, Integer> {

    @Query(value = "SELECT * FROM movie WHERE Genre LIKE %:genre%", nativeQuery = true)
    public List<Movie> findByGenre(
            @Param("genre") String genre
    );
}

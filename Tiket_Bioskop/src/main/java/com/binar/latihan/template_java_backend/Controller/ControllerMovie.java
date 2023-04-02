package com.binar.latihan.template_java_backend.Controller;

import com.binar.latihan.template_java_backend.Entity.Movie;
import com.binar.latihan.template_java_backend.Service.ServiceMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bioskop/movie")
public class ControllerMovie {

    @Autowired
    private ServiceMovie service;

    @Value("${app.name}")
    private String appName;

    /*
        MENAMBAHKAN DATA PADA TABLE MOVIE
     */

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return service.addMovie(movie);
    } // bisa

    @PostMapping("/addMovies")
    public List<Movie> addMovies(@RequestBody List<Movie> movies) {
        return service.addMovies(movies);
    } // bisa

    /*
        MENG-UPDATE DATA BY ID
     */
    @PutMapping("/update")
    public Movie updateMovie(@RequestBody Movie movie) {
        return service.updateMovie(movie);
    } // bisa


    /*
        MENDAPATKAN DATA MENGENAI MOVIE
     */

    @GetMapping("/movies")
    public List<Movie> getAllMovie() {
        return service.getAllMovie();
    } // bisa

    @GetMapping("/movies/{genre}")
    public List<Movie> getMovieByGenre(@PathVariable String genre) {
        return service.getMovieByGenre(genre);
    } // bisa


    @GetMapping("/testing")
    public String test() {
        return appName;
    } // bisa

    /*
        MENGHAPUS DATA MENGENAI MOVIE
     */

    @DeleteMapping("/delete/{id}")
    public String deleteMovie(@PathVariable int id) {
        return service.deleteById(id);
    } // bisa

}

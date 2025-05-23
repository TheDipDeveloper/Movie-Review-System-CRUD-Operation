package com.dipdeveloper.movie_review_system.controller;

import com.dipdeveloper.movie_review_system.entity.Movie;
import com.dipdeveloper.movie_review_system.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/add")
    public Movie addMovie(@RequestBody Movie movie){
        Movie newMovie = movieService.add(movie);
        return newMovie;
    }

    @GetMapping("/get/{id}")
    public Movie getMovieById(@PathVariable("id") Integer id){
        Movie movie = movieService.getMovieById(id);
        return movie;
    }

    @GetMapping("/all")
    public List<Movie> getAllMovies(){
        List<Movie> movies = movieService.allMovies();
        return movies;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMovie(@PathVariable("id") Integer id){
        movieService.deleteMovie(id);
    }

    @PutMapping("/update/{id}")
    public Movie updateMovie(@PathVariable("id") Integer id, @RequestBody Movie movie){
        Movie updatedMovie = movieService.updateMovie(id, movie);
        return updatedMovie;
    }
}

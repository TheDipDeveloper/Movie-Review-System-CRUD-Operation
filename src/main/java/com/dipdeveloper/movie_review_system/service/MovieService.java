package com.dipdeveloper.movie_review_system.service;

import com.dipdeveloper.movie_review_system.entity.Movie;
import com.dipdeveloper.movie_review_system.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie add(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieById(Integer id) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        return  optionalMovie.get();
    }

    public List<Movie> allMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public void deleteMovie(Integer id) {
        movieRepository.deleteById(id);
    }

    public Movie updateMovie(Integer id, Movie movie) {
        Optional<Movie> optional = movieRepository.findById(id);
        if(optional.isPresent()){
            Movie updatedMovie = optional.get();
            updatedMovie.setId(optional.get().getId());
            updatedMovie.setRating(movie.getRating());
            updatedMovie.setComment(movie.getComment());
            updatedMovie.setTitle(movie.getTitle());
            updatedMovie.setReleaseYear(movie.getReleaseYear());
            return movieRepository.save(updatedMovie);
        }
        return movieRepository.save(movie);
    }
}

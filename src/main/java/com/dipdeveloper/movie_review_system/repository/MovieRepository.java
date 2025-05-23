package com.dipdeveloper.movie_review_system.repository;

import com.dipdeveloper.movie_review_system.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}

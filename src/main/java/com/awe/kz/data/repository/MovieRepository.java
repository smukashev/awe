package com.awe.kz.data.repository;

import com.awe.kz.data.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {
    Movie findByMovieName(String movieName);
    Movie findByMovieId(long movieId);
}

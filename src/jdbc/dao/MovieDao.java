/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.dao;

import java.util.List;
import java.util.Optional;
import jdbc.model.Movie;

/**
 *
 * @author thetkhine
 */
public interface MovieDao {
    Optional<Movie> getMovieById(Long id);
    public List<Movie> searchMovie(Movie movie);
    Optional<Movie> getMovieByTitleYear(String title, Long year);
    List<Movie> getAllMovie();
    boolean insertMovie(Movie movie);
    boolean updateMovie(Movie movie);
    boolean deleteMovie(Long movieId);
}

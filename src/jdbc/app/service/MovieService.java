/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.app.service;

import java.util.List;
import java.util.Optional;
import jdbc.model.Actor;
import jdbc.model.ActorInMovie;
import jdbc.model.Movie;

/**
 *
 * @author thetkhine
 */
public interface MovieService {
    List<Movie> getAllMovie();
    Optional<Movie> addMovie(Movie movie) throws BusinessRuleException;
    List<Movie> searchMovie(Movie movie);
    //boolean isMovieDuplicate(String title,Long year);
    List<Actor> getAllActor();
    Optional<Actor> getActorById(Long actorId);
    List<ActorInMovie> getAllActorInMovie();
    boolean assignActorToMovie(ActorInMovie actorInMovie)throws BusinessRuleException;
}

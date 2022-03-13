/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.app.service;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jdbc.model.Actor;
import jdbc.model.ActorInMovie;
import jdbc.model.Movie;

/**
 *
 * @author thetkhine
 */
public class MockMovieServiceImpl {

    
    public List<Movie> getAllMovie() {
        List<Movie> movies = new ArrayList<>();
        
        Movie movie = new Movie();
        movie.setId(1L);
        movie.setTitle("Test movie");
        movie.setYear(2001L);
        movies.add(movie);
        return movies;
    }

    public Optional<Movie> addMovie(Movie movie) throws BusinessRuleException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public List<Actor> getAllActor() {
        Actor actor = new Actor();
        actor.setId(1L);
        actor.setName("Actor One");
        
        List<Actor> actors = new ArrayList<>();
        actors.add(actor);
        return actors;
    }

  
    public Optional<Actor> getActorById(Long actorId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public List<ActorInMovie> getAllActorInMovie() {
        ActorInMovie actorInMovie = new ActorInMovie();
        Actor actor = new Actor();
        Movie movie = new Movie();
        
        actorInMovie.setActor(actor);
        actorInMovie.setMovie(movie);
        
        List<ActorInMovie> actorInMovies = new ArrayList<>();
        actorInMovies.add(actorInMovie);
        
        return actorInMovies;
    }

   
    public boolean assignActorToMovie(ActorInMovie actorInMovie) throws BusinessRuleException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

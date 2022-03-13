/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.app.service;

import java.util.List;
import java.util.Optional;
import jdbc.dao.ActorDao;
import jdbc.dao.ActorDaoImpl;
import jdbc.dao.ActorInMovieDao;
import jdbc.dao.ActorInMovieDaoImpl;
import jdbc.dao.MovieDao;
import jdbc.dao.MovieDaoImpl;
import jdbc.model.Actor;
import jdbc.model.ActorInMovie;
import jdbc.model.Movie;

/**
 *
 * @author thetkhine
 */
public class MovieServiceImpl implements MovieService{

    MovieDao movieDao = new MovieDaoImpl();
    ActorDao actorDao = new ActorDaoImpl();
    ActorInMovieDao actorInMovieDao = new ActorInMovieDaoImpl();
    
    @Override
    public List<Movie> getAllMovie() {
        return this.movieDao.getAllMovie();
    }

    @Override
    public Optional<Movie> addMovie(Movie movie)throws BusinessRuleException {
        
        if(this.isMovieDuplicate(movie.getTitle(), movie.getYear()))
        {
            throw new BusinessRuleException("There is duplicate movie");
        }
        else
        {
             if( this.movieDao.insertMovie(movie))
            {
                return Optional.of(movie);
            }
            else
            {
                return Optional.empty();
            }
        }
       
    }

    //@Override
    private boolean isMovieDuplicate(String title, Long year) {
        Optional<Movie> movie = this.movieDao.getMovieByTitleYear(title, year);
        return movie.isPresent();
    }
    public static void main(String[] args) {
        MovieServiceImpl movieService = new MovieServiceImpl();
        System.out.println("IsDuplicate "+ movieService.isMovieDuplicate("The Godfather", 1972L));
    }

    @Override
    public List<Actor> getAllActor() {
        return this.actorDao.getAllActor();
    }

    @Override
    public Optional<Actor> getActorById(Long actorId) {
        return this.actorDao.getActorById(actorId);
    }

    @Override
    public boolean assignActorToMovie(ActorInMovie actorInMovie)throws BusinessRuleException {
        Actor actor = actorInMovie.getActor();
        Movie movie = actorInMovie.getMovie();
        if( this.actorInMovieDao.getActorInMovie(actor.getId(), movie.getId()).isPresent())
        {
            throw new BusinessRuleException("There is already mapping for actor & movie");
        }
        else
        {
            this.actorInMovieDao.insertActorInMovie(actorInMovie);
        }
        return true;
    }

    @Override
    public List<ActorInMovie> getAllActorInMovie() {
        return actorInMovieDao.getAllActorInMovie();
    }

    @Override
    public List<Movie> searchMovie(Movie movie) {
       return movieDao.searchMovie(movie);
    }
    
}

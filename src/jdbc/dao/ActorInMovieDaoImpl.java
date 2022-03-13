/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jdbc.DAO;
import static jdbc.SqlUtil.dbResultToModel;
import jdbc.model.ActorInMovie;
import jdbc.model.Actor;
import jdbc.model.Movie;

/**
 *
 * @author thetkhine
 */
public class ActorInMovieDaoImpl implements ActorInMovieDao {

    @Override
    public List<ActorInMovie> getAllActorInMovie() {
        List<ActorInMovie> actorsInMovies = new ArrayList<>();
        try {
            String sql = "SELECT movie.id,movie.title,actor.id,actor.name \n" +
                        "FROM actor,actor_in_movie,movie\n" +
                        "WHERE actor.id = actor_in_movie.actor_id\n" +
                        "AND movie.id = actor_in_movie.movie_id\n" +
                        "ORDER BY movie.id;";
            Connection con = DAO.getDAO().getConnection();
            try ( //Statement sqlStatement = con.createStatement();
                PreparedStatement stat = con.prepareStatement(sql)) {
                ResultSet result = stat.executeQuery();
                
                while(result.next())
                {
                    ActorInMovie actorInMovie = resultToSingleModel(result);

                    actorsInMovies.add(actorInMovie);
                }
                
                
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return actorsInMovies;
    }
    @Override
    public Optional<ActorInMovie> getActorInMovie(Long actorId, Long movieId) {
        Optional<ActorInMovie> actorInMovieResult = Optional.empty() ;
        try {
            String sql = "SELECT actor_id,movie_id from actor_in_movie\n" +
                    "WHERE actor_id = ?\n" +
                    "AND movie_id = ?;";
            Connection con = DAO.getDAO().getConnection();
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setLong(1, actorId);
            stat.setLong(2, movieId);
            try (ResultSet result = stat.executeQuery()) {
                if(result.next())
                {
                    ActorInMovie actorInMovie = new ActorInMovie();
                    Actor actor = new Actor();
                    Movie movie = new Movie();
                    
                    actor.setId(result.getLong(1));
                    movie.setId(result.getLong(2));
                    
                    actorInMovie.setActor(actor);
                    actorInMovie.setMovie(movie);
                    
                    actorInMovieResult = Optional.of(actorInMovie);
                }
                else
                {
                    actorInMovieResult = Optional.empty();
                }
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return actorInMovieResult;
    }
    private ActorInMovie resultToSingleModel(ResultSet result) throws SQLException {
        ActorInMovie actorInMovie = new ActorInMovie();
        Movie movie = new Movie();
        Actor actor = new Actor();
        Long movieId = result.getLong(1);
        String movieTitle = result.getString(2);
        movie.setId(movieId);
        movie.setTitle(movieTitle);
        Long actorId = result.getLong(3);
        String actorName  =result.getString(4);
        actor.setId(actorId);
        actor.setName(actorName);
        actorInMovie.setActor(actor);
        actorInMovie.setMovie(movie);
        return actorInMovie;
    }
    @Override
    public boolean insertActorInMovie(ActorInMovie actorInMovie) {
       boolean inserted = false;
        try {
            String sql = "INSERT INTO actor_in_movie(actor_id,movie_id) VALUES(?,?)";
            Connection con = DAO.getDAO().getConnection();
            //Statement sqlStatement = con.createStatement();
            PreparedStatement stat = con.prepareStatement(sql);
            
            stat.setLong(1, actorInMovie.getActor().getId());
            stat.setLong(2, actorInMovie.getMovie().getId());
            
            int rows = stat.executeUpdate();
            
            inserted = rows >0;
            stat.close();
            
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return inserted;
    }

    public static void main(String[] args) {
        ActorInMovieDao dao = new ActorInMovieDaoImpl();
        /*
        List<ActorInMovie> actorInMovies = dao.getAllActorInMovie();
        for(ActorInMovie actorInMovie: actorInMovies)
        {
            System.out.println(actorInMovie);
        }
        */
        Optional<ActorInMovie> actorInMovieResult = dao.getActorInMovie(6L, 1L);
        System.out.println("Get "+actorInMovieResult.get());
    }

    
    
    
}

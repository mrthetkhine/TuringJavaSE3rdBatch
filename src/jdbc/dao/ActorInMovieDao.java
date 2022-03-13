/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.dao;

import java.util.List;
import java.util.Optional;
import jdbc.model.Actor;
import jdbc.model.ActorInMovie;
import jdbc.model.Movie;

/**
 *
 * @author thetkhine
 */
public interface ActorInMovieDao {
    List<ActorInMovie> getAllActorInMovie();
    Optional<ActorInMovie> getActorInMovie(Long actorId, Long movieId);
    boolean insertActorInMovie(ActorInMovie actorInMovie);
}

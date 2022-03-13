/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.model;

/**
 *
 * @author thetkhine
 */
public class ActorInMovie {
    
    Actor actor;
    Movie movie;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "ActorInMovie{" + "actor=" + actor.getId()+"," + actor.getName() + ", movie= "+ movie.getId()+" ," + movie.getTitle() + '}';
    }
    
    
}

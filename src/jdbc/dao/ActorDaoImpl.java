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
import jdbc.SqlUtil;
import static jdbc.SqlUtil.dbResultToModel;
import jdbc.model.Actor;
import jdbc.model.Movie;

/**
 *
 * @author thetkhine
 */
public class ActorDaoImpl implements ActorDao{

    @Override
    public Optional<Actor> getActorById(Long id) {
        try {
           
            Connection con = DAO.getDAO().getConnection();
            
            String sql = "SELECT * FROM Actor WHERE ID=? ";
            Optional<Actor> resultActor;
            try (PreparedStatement stat = con.prepareStatement(sql)) {
                stat.setLong(1, id);
                try (ResultSet result = stat.executeQuery()) {
                    resultActor = singleResultToActor(result);
                }
            }
            
            return resultActor; 
           
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }
    private Optional<Actor> singleResultToActor(ResultSet result) throws SQLException {
        Optional<Actor> resultActor ;
        if(result.next())
        {
            Actor actor = new Actor();
            actor.setId(result.getLong("Id"));
            actor.setGender(result.getString("gender"));
            actor.setBirthday(result.getDate("birthday"));
            
            
            resultActor = Optional.of(actor);
        }
        else
        {
            resultActor = Optional.empty();
        }
        return resultActor;
    }
    @Override
    public List<Actor> getAllActor() {
        List<Actor> actors = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Actor; ";
            Connection con = DAO.getDAO().getConnection();
            try ( //Statement sqlStatement = con.createStatement();
                PreparedStatement stat = con.prepareStatement(sql)) {
                ResultSet result = stat.executeQuery();
                actors = dbResultToModel(result,new Actor());
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return actors;
    }

    @Override
    public boolean insertActor(Actor actor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        ActorDao dao = new ActorDaoImpl();
        /*
        List<Actor> actors = dao.getAllActor();
        for(Actor actor : actors)
        {
            System.out.println(actor);
        }
        */
        Optional<Actor> actorResult = dao.getActorById(12L);
        System.out.println(actorResult.get());
        
    }
}

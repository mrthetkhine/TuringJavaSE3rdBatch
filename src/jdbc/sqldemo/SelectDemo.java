/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.sqldemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DAO;
import jdbc.model.Actor;

/**
 *
 * @author thetkhine
 */
public class SelectDemo {
    
    public static List<Actor> getAllActor()
    {
        List<Actor> actors = new ArrayList<Actor>();
        
        try {
            Connection con = DAO.getDAO().getConnection();
            Statement sqlStatement = con.createStatement();
            
            String sql = "SELECT * FROM Actor";
            ResultSet result = sqlStatement.executeQuery(sql);
            
            while(result.next())
            {
                Long id = result.getLong("ID");
                String name = result.getString("name");
                String gender = result.getString("gender");
                Date birthday = result.getDate("birthday");
                
                Actor actor = new Actor();
                actor.setId(id);
                actor.setName(name);
                actor.setGender(gender);
                actor.setBirthday(birthday);
                
                actors.add(actor);
                //System.out.println("ID "+id + " Name "+name + " gender "+gender+" birthday "+birthday);
            }
            result.close();
            sqlStatement.close();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return actors;
    }
    public static void main(String[] args) {
        List<Actor> actors = getAllActor();
        for(Actor actor : actors)
        {
            System.out.println(actor);
        }
    }
}

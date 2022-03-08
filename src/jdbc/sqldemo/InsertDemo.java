/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.sqldemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jdbc.DAO;
import jdbc.SqlUtil;
import static jdbc.SqlUtil.dateToString;
import jdbc.model.Actor;
import jdbc.model.Director;

/**
 *
 * @author thetkhine
 */
public class InsertDemo {
    

    private static void insertDirector(Director director) {
        try {
            Connection con = DAO.getDAO().getConnection();
            
            
         
            String sql = "INSERT INTO Director(name,birthday,gender) VALUES(?,?,?)";
            PreparedStatement sqlStatement = con.prepareStatement(sql);
            
            sqlStatement.setString(1, director.getName());
            sqlStatement.setString(2, dateToString(director.getBirthday()));
            sqlStatement.setString(3, director.getGender());
            
            System.out.println("SQL "+sql);
            sqlStatement.executeUpdate();
            
            sqlStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Director director = new Director();
        director.setName("Lana Wachowski");
        director.setBirthday(new Date());
        director.setGender("F");
        insertDirector(director);
    }
}

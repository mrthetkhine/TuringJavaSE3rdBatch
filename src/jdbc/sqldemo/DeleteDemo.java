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
public class DeleteDemo {
    

    private static void deleteDirector(Director director) {
        try {
            Connection con = DAO.getDAO().getConnection();
            
            
         
            String sql = "DELETE FROM Director WHERE id=?";
            PreparedStatement sqlStatement = con.prepareStatement(sql);
            
   
            sqlStatement.setLong(1, director.getId());
            
            System.out.println("SQL "+sql);
            sqlStatement.executeUpdate();
            
            sqlStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Director director = new Director();
        director.setId(4L);
        //director.setName("Lana Wachowski");
        //director.setBirthday(SqlUtil.strToDate("2020-01-04"));
        //director.setGender("F");
        deleteDirector(director);
    }
}

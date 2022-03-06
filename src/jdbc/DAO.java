/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *≠
 * @author thetkhine
 */
public class DAO {
    
    
    private static DAO singleton;
    
    private Connection conn = null;
    
    private DAO()
    {
        try
        {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/imdb","root","root123!@#");                         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public Connection getConnection()
    {
        return this.conn;
    }
    
    public static DAO getDAO()
    {
        if(singleton == null)
        {
            singleton = new DAO();
        }
        return singleton;
    }
    
    public static void main(String[] args) {
        DAO.getDAO();
    }
}

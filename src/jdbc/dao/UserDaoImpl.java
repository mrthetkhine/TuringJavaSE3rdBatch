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
import java.util.Optional;
import jdbc.DAO;
import jdbc.model.Movie;
import jdbc.model.User;

/**
 *
 * @author thetkhine
 */
public class UserDaoImpl implements UserDao{

    public static final String SALT = "$2Jb!n@s7I";
    @Override
    public boolean register(User user) {
        boolean inserted = false;
        try {
            String sql = "INSERT INTO User(username,password,role) VALUES(?,MD5(?),?)";
            Connection con = DAO.getDAO().getConnection();
            //Statement sqlStatement = con.createStatement();
            PreparedStatement stat = con.prepareStatement(sql);
            
            stat.setString(1, user.getName());
            stat.setString(2,user.getPassword()+SALT);
            stat.setString(3,user.getRole());
             
            int rows = stat.executeUpdate();
            
            inserted = rows >0;
            stat.close();
            
            stat = con.prepareStatement("SELECT LAST_INSERT_ID();");
            ResultSet resultSet = stat.executeQuery();
            if(resultSet.next())
            {
                Long id = resultSet.getLong(1);
                user.setId(id);
            }
            resultSet.close();
            stat.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return inserted;
    }
   
    @Override
    public Optional<User> getUserByUsernameAndPassword(String username, String password) {
         try {
           
            Connection con = DAO.getDAO().getConnection();
            
            String sql = "SELECT * FROM User WHERE username=? AND password=MD5(?) ";
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, username);
            stat.setString(2, password+SALT);
            ResultSet result = stat.executeQuery();
            Optional<User> resultUser = singleResultToUser(result) ;
            
            result.close();
            stat.close();
            
            return resultUser; 
           
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }
    private Optional<User> singleResultToUser(ResultSet result) throws SQLException {
        Optional<User> resultUser ;
        if(result.next())
        {
            User user = new User();
            user.setId(result.getLong("Id"));
            user.setName(result.getString("username"));
            user.setRole(result.getString("role"));
            
            
            resultUser = Optional.of(user);
        }
        else
        {
            resultUser = Optional.empty();
        }
        return resultUser;
    }
    

    @Override
    public boolean isAnyUserWithUserName(String userName) {
        try {
           
            Connection con = DAO.getDAO().getConnection();
            
            String sql = "SELECT * FROM User WHERE username=? ";
            PreparedStatement stat = con.prepareStatement(sql);
            stat.setString(1, userName);
           
            ResultSet result = stat.executeQuery();
            
            boolean exist = result.next();
            
            result.close();
            stat.close();
            
            return exist; 
           
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        User user = new User();
        user.setName("admin");
        user.setPassword("admin");
        user.setRole("admin");
        
        UserDao dao = new UserDaoImpl();
        //dao.register(user);
        Optional<User> userResult = dao.getUserByUsernameAndPassword(user.getName(), user.getPassword());
        System.out.println(userResult.get());
        
        System.out.println("isExist "+ dao.isAnyUserWithUserName("admin"));
    }
}

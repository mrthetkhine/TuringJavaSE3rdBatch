/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.dao;

import java.util.Optional;
import jdbc.model.User;

/**
 *
 * @author thetkhine
 */
public interface UserDao {
    boolean register(User user);
    Optional<User> getUserByUsernameAndPassword(String username,String password);
    boolean isAnyUserWithUserName(String userName);
            
}

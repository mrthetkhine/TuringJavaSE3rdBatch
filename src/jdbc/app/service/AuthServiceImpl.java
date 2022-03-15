/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.app.service;

import java.util.Optional;
import jdbc.dao.UserDao;
import jdbc.dao.UserDaoImpl;
import jdbc.model.User;

/**
 *
 * @author thetkhine
 */
public class AuthServiceImpl implements AuthService{

    UserDao userDao = new UserDaoImpl();
    @Override
    public boolean isAuthOk(String userName, String password) {
        Optional<User> user = userDao.getUserByUsernameAndPassword(userName, password);
        return user.isPresent();
    }

    @Override
    public void register(User user)throws BusinessRuleException {
        if(! userDao.isAnyUserWithUserName(user.getName()))
        {
            userDao.register(user);
        }
        else
        {
            throw new BusinessRuleException("Username already existed");
        }
    }
    
}

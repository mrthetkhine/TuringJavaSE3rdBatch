/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter31.demoapp.service;

/**
 *
 * @author thetkhine
 */
public class AuthServiceImpl implements AuthService{

    @Override
    public boolean isAuthOk(String userName, String password) {
        return userName.equals("admin") && password.equals("admin");
    }
    
}

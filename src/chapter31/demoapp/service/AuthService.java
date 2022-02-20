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
public interface AuthService {
    boolean isAuthOk(String userName, String password);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class CustomException extends Exception{

    public CustomException(String message) {
        super(message);
    }
    
    static void auth(String userName, String password)throws CustomException
    {
        if(userName == null || password == null)
        {
            CustomException ce = new CustomException("Username or password is null");
            ce.initCause(new ArithmeticException("Unknown exception"));
            throw ce;
        }
    }
    public static void main(String[] args) {
        try {
            auth(null,"Hello");
        } catch (CustomException ex) {
            System.out.println("Message "+ex.getMessage());
            System.out.println("GetCause "+ex.getCause());
            //ex.printStackTrace();
        }
    }
    
}

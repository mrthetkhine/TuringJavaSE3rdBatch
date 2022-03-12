/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.app.service;

/**
 *
 * @author thetkhine
 */
public class BusinessRuleException extends Exception{
    
    String message;

    public BusinessRuleException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    
}

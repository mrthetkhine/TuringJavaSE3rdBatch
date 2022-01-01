/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author thetkhine
 */
public final class Specialist extends Doctor{
    
    public Specialist(String name, int age, String specialiation) {
        super(name, age, specialiation);
        System.out.println("Specialist constructor");
    }
    
    public static void main(String[] args) {
        new Specialist("Aung Kyaw",28,"Ortho");
        
    }
    
}

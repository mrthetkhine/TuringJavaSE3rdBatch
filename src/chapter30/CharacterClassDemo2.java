/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

/**
 *
 * @author thetkhine
 */
public class CharacterClassDemo2 {
    public static void main(String[] args) {
        System.out.println("12344.\\d+ " + ("12344".matches("\\d+")));
        System.out.println("12Hello\\d+ " + ("12Hello".matches("\\d+")));
         
        System.out.println("12344.\\D+ " + ("12344".matches("\\D+")));
        System.out.println("Hello\\D+ " + ("Hello".matches("\\D+"))); 
    
        System.out.println("\t\r\n.\\s+ " + (" \r\n\t".matches("\\s+")));
        System.out.println("Data .\\s+ " + (" Data".matches("\\s+")));
        System.out.println("Hello\\S+ " + ("Hello".matches("\\S+"))); 
        
        System.out.println("12344He.\\w+ " + ("12344He".matches("\\w+")));
        System.out.println("@#\\W+ " + ("Hello".matches("\\W+"))); 
    }
}

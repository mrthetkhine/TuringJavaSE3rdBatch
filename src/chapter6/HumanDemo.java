/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author thetkhine
 */
public class HumanDemo {
    
    public static void main(String[] args) {
        Human mgmg = new Human();
        mgmg.name = "Mg Mg";
        mgmg.age = 31;
        
        mgmg.display();
    
        Human aungAung = new Human();
        aungAung.name = "Aung Aung";
        aungAung.age = 16;
        
        aungAung.display();
        
        Human aa = aungAung;
        aa.name = "Change";
        
        aa.display();
        aungAung.display();
        
        aa = new Human();
        aa.name = "Aa";
        aa.age = 21;
        
        aa.display();
        aungAung.display();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author thetkhine
 */
public class LogicalUseCase {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean willGoOutSide = true;
        
        if ( isRaining && willGoOutSide)
        {
            System.out.println("Bring umbrella");
        }
        else
        {
            System.out.println("No need to bring umbrella");
        }
    }
    
}

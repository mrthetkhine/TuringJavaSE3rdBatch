/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author thetkhine
 */
public class BreakinNestedLoop {
    public static void main(String[] args) {
        
        outer:for (int i = 0; i < 3; i++) {
            System.out.println("Outer "+i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Inner "+j);
                if( j== 2)
                {
                    //break outer;
                    continue outer;
                }
            }
            System.out.println("Outer end "+i);
        }
        System.out.println("End of outer");
        another:for (int i = 0; i < 10; i++) {
            
        }
        
        one:{
            break one;
        }
    }
}

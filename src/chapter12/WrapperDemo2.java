/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author thetkhine
 */
public class WrapperDemo2 {
    public static void main(String[] args) {
        Boolean bool = false;//Autoboxing
        bool = new Boolean(true);
        
        Float f = new Float(4);
        f = 4.1f;
        
        System.out.println("Boolean "+bool);
        System.out.println("Float "+f);
        
        System.out.println("f+3 "+ (f+3));//Wrapper->Primitive => unboxing
        
        System.out.println("bool "+ (bool == false));
    }
}

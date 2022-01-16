/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thetkhine
 */
public class TypeErasureProblem {
    public void invalid(List<String> strings) {}
   // public void invalid(List strings) {}
    //public void invalid(List<Integer> objects){}
    
    public static void main(String[] args) {
        
        ArrayList<String> data = new ArrayList<String>();
        ArrayList<Integer> intData = new ArrayList<Integer>();
        
        System.out.println("Class "+ String.class);
        System.out.println("Class "+ data.getClass());
        System.out.println("Class "+ intData.getClass());
    }
}

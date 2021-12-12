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
public class ForEachDemo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
    
        for(final int a : arr)
        {
            System.out.println("A "+a);
            ///a *=  2;
        }
        System.out.println("===========");
        for(int a : arr)
        {
            System.out.println("A "+a);
          
        }
    }
    
}

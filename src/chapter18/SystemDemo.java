/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter18;

/**
 *
 * @author thetkhine
 */
public class SystemDemo {
    public static void main(String[] args) {
        //System.exit(0);
        
        long time = System.currentTimeMillis();
        System.out.println("System.getProp "+System.getProperty("java.home"));
        System.out.println("OS Name "+System.getProperty("os.name"));
        System.out.println("Java version "+System.getProperty("java.version"));
        System.out.println("End");
        
        System.out.println("Time "+ time);
        
        int arr[] = {1,2,3,4,5};
        int arr2 []= new int[arr.length];
        
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        
        System.out.println("Arr2 "+arr2[1]);
    }
}

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
public class Memory {
    static
    {
        System.out.println("Memory class loaded");
    }
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        final int MEGA = 1024;
        
        System.out.println("AvailProcessor "+ runtime.availableProcessors());
        
        long total = runtime.totalMemory()/MEGA;
        System.out.println("Total "+total + " MB");
        
        long free = runtime.freeMemory()/MEGA;
        System.out.println("FreeMemory "+free + " MB");
        
        long[] arr = new long[2000000];
        free = runtime.freeMemory()/MEGA;
        
        System.out.println("FreeMemory "+free + " MB");
        arr = null;
        System.gc();
        
        free = runtime.freeMemory()/MEGA;
        System.out.println("FreeMemory "+free + " MB");
        
        runtime.exit(0);
        System.out.println("End");
    }
}

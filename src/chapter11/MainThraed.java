package chapter11;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thetkhine
 */
public class MainThraed {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Name "+currentThread.getName());
        
        for (int i = 0; i < 10; i++) {
            System.out.println("I "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

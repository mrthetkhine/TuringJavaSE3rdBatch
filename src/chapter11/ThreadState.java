/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

/**
 *
 * @author thetkhine
 */
public class ThreadState {
    static Thread createAndStart()
    {
        Thread th = new Thread();
        th.start();
        return th;
    }
    public static void main(String[] args) {
        System.out.println("Thread State "+ Thread.currentThread().getState());
        Thread th  = createAndStart();
    }
}

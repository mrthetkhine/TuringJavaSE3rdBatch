/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class SharedData
{
    static AtomicInteger count = new AtomicInteger(0);
}
class IncrementThread extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100000; i++) {
            SharedData.count.incrementAndGet();
        }
    }
}
public class AtomicDemo {
    public static void main(String[] args) {
        IncrementThread t1 = new IncrementThread();
        IncrementThread t2 = new IncrementThread();
        IncrementThread t3 = new IncrementThread();

        t1.start();
        t2.start();
        t3.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Shared Data Count "+ SharedData.count);
    }
}

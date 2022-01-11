/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class Shared
{
    static int count = 0;
}
class LockThread extends Thread
{
    String name;
    ReentrantLock lock;
    
    LockThread(String name, ReentrantLock lock)
    {
        this.name = name;
        this.lock = lock;
    }
    public void run()
    {
        System.out.println("Starting "+name);
        
        System.out.println(name +" Waiting for lock");
        this.lock.lock();
        System.out.println(name+" get lock");
        Shared.count++;
        
        try {
            System.out.println(name+" sleeping");
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(name+" unlock");
        this.lock.unlock();
    }
}

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        LockThread th1 = new LockThread("A ",lock);
        LockThread th2 = new LockThread("B ",lock);
        
        th1.start();
        th2.start();
    }
}

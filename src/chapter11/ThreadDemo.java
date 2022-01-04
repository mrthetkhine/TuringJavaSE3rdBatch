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
class MyThread implements Runnable
{
    Thread thread;
    String name;
    MyThread(String name)
    {
        this.name = name;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+name + " i => "+i);
        }
    }
    void start()
    {
        this.thread.start();
    }
    void join() throws InterruptedException
    {
        this.thread.join();
    }
}
class MyThread2 extends Thread
{
    String name;
    MyThread2(String name)
    {
        this.name = name;
       
    }

     public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+name + " i => "+i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        
         MyThread m1 = new MyThread("ThreadOne");
            MyThread m2 = new MyThread("ThreadTwo");
            MyThread2 m3 = new MyThread2("Thread3");
            
            m1.thread.setPriority(Thread.MAX_PRIORITY);
            m1.start();
            System.out.println("Is m1 alive before start "+ m1.thread.isAlive());
            m2.start();
            m3.start();
        try {
            
            m1.join();
            m2.join();
            m3.join();
            
            System.out.println("Is m1 alive "+ m1.thread.isAlive());
            System.out.println("Main Done");
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

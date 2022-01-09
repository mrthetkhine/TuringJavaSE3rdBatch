/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class Task extends Thread
{
    String name; 
    CountDownLatch latch;
    
    Task(CountDownLatch latch,String name)
    {
        this.latch = latch;
        this.name = name;
    }
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Name "+name + " i "+i);
            this.latch.countDown();
        }
    }
}
public class SimpleExecutorDemo {
    public static void main(String[] args) {
        
        CountDownLatch[] latches = new CountDownLatch[5];
        for (int i = 0; i < 5; i++) {
            latches[i] = new CountDownLatch(5);
        }
        
        //ExecutorService exs = Executors.newFixedThreadPool(3);
        ExecutorService exs = Executors.newCachedThreadPool();
        
        Task[] tasks = new Task[5];
        for (int i = 0; i < 5; i++) {
            tasks[i] = new Task(latches[i], "Thread "+i);
            exs.execute(tasks[i]);
        }
        
         for (int i = 0; i < 5; i++) {
            try {
                latches[i].await();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        exs.shutdown();
        System.out.println("Done");
    }
}

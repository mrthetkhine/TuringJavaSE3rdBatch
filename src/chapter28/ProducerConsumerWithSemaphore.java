/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class Queue
{
    int n;
    Semaphore semCon = new Semaphore(0);
    Semaphore semPro = new Semaphore(1);
    
    void put(int n)
    {
        try
        {
            semPro.acquire();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Put "+n);
        semCon.release();
    }
    int get()
    {
        try
        {
            semCon.acquire();
        }
         catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Get "+n);
        semPro.release();
        return n;
    }
}
class Producer extends Thread
{
    Queue queue;
    Producer(Queue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            this.queue.put(i);
        }
    }
    
}
class Consumer extends Thread
{
    Queue queue;
    Consumer(Queue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
        for (int i = 0; i < 20; i++) {
            this.queue.get();
        }
    }
    
}
public class ProducerConsumerWithSemaphore {
    public static void main(String[] args) {
        Queue queue = new Queue();
        
        Producer pro = new Producer(queue);
        Consumer con = new Consumer(queue);
        
        pro.start();
        con.start();
    }
}

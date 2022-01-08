/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class CorrectBuffer implements Buffer
{
    int n;
    boolean valueSet = false;
    
    public synchronized int get()
    {
        while(!valueSet)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Got "+n);
        valueSet = false;
        notify();
        return n;
    }
    public synchronized void put(int data)
    {
        while(valueSet)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
        this.n = data;
        valueSet = true;
        System.out.println("Put "+n);
        notify();
    }
}
public class CorrectProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new CorrectBuffer();
        
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        
        producer.thread.start();
        consumer.thread.start();
    }
}

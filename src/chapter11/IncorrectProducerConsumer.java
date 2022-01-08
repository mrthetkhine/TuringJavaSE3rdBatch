/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

interface Buffer{
    int get();
    void put(int n);
}
class IncorrectBuffer implements Buffer{
    int n;
    
    public synchronized int get()
    {
        System.out.println("Got "+n);
        return this.n;
    }
    public synchronized void put(int n)
    {
        this.n = n;
        System.out.println("Put "+n);
    }
    
}
class Producer implements Runnable
{
    Buffer buffer;
    Thread thread;

    Producer(Buffer buffer)
    {
        this.buffer = buffer;
        this.thread = new Thread(this);
    }
    @Override
    public void run() {
        int i =0;
        while(true)
        {
            buffer.put(i++);
        }
    }
}
class Consumer implements Runnable
{
    Buffer buffer;
    Thread thread;

    Consumer(Buffer buffer)
    {
        this.buffer = buffer;
        this.thread = new Thread(this);
    }
    @Override
    public void run() {
       
        while(true)
        {
            buffer.get();
        }
    }
}
/**
 *
 * @author thetkhine
 */
public class IncorrectProducerConsumer {
    public static void main(String[] args) {
        IncorrectBuffer buffer = new IncorrectBuffer();
        
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        
        producer.thread.start();
        consumer.thread.start();
    }
}

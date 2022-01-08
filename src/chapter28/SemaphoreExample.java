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
class Data{
    int count = 0;
}
class IncThread implements Runnable
{
    Data data;
    Semaphore semaphore;
    
    IncThread(Data data, Semaphore semaphore)
    {
        this.data = data;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Inc Start");
        for (int i = 0; i < 100000; i++) {
            try {
                this.semaphore.acquire();
                //System.out.println("Inc "+i);
                this.data.count++;
                this.semaphore.release();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            
        }
    }
}
class DecThread implements Runnable
{
    Data data;
    Semaphore semaphore;
    
    DecThread(Data data, Semaphore semaphore)
    {
        this.data = data;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Dec Start");
        for (int i = 0; i < 100000; i++) {
            try {
                this.semaphore.acquire();
                //System.out.println("Dec "+i);
                this.data.count--;
                this.semaphore.release();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            
        }
    }
}
public class SemaphoreExample {
    public static void main(String[] args) {
        Data data = new Data();
        Semaphore sem = new Semaphore(1);

        Thread inc = new Thread( new IncThread(data,sem));
        Thread dec = new Thread( new DecThread(data,sem));

        inc.start();
        dec.start();
        try {
           
            
            inc.join();
            dec.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
       
        System.out.println("Data "+data.count);
       
    }
}

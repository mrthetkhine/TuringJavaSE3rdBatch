/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.Semaphore;

/**
 *
 * @author thetkhine
 */
class PrintThread extends Thread
{
    Semaphore semaphore;
    String name;
    PrintThread(Semaphore semaphore, String name)
    {
        this.semaphore = semaphore;
        this.name = name;
    }
    public void run()
    {
        System.out.println("Start");
        try
        {
            this.semaphore.acquire();
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread "+name + " i "+i);
            }
            this.semaphore.release();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
public class SemaphoreSecondExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        
        PrintThread t1 = new PrintThread(semaphore,"TOne");
        PrintThread t2 = new PrintThread(semaphore,"TTwo");
        PrintThread t3 = new PrintThread(semaphore,"TThree");
        PrintThread t4 = new PrintThread(semaphore,"TFour");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

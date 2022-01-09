/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.Phaser;

/**
 *
 * @author thetkhine
 */
class PhaserThread extends Thread
{
    Phaser phaser;
    String name;
    
    PhaserThread(Phaser phaser,String name)
    {
        this.phaser = phaser;
        this.name = name;
        
        this.phaser.register();
    }
    
    public void run()
    {
        System.out.println("Thread "+ name + " Beginning Phase One ");
        this.phaser.arriveAndAwaitAdvance();
        
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
        
        System.out.println("Thread "+ name + " Beginning Phase Two ");
        this.phaser.arriveAndAwaitAdvance();
        
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
        
        System.out.println("Thread "+ name + " Beginning Phase Three ");
        this.phaser.arriveAndDeregister();
        
        
        
    }
}
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int currentPhase ;
        
        System.out.println("Starting");
        
        new PhaserThread(phaser, "A").start();
        new PhaserThread(phaser, "B").start();
        new PhaserThread(phaser, "C").start();
        
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phaser complete "+currentPhase);
        
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phaser complete "+currentPhase);
        
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phaser complete "+currentPhase);
        
        phaser.arriveAndDeregister();
        if(phaser.isTerminated())
        {
            System.out.println("Phaser terminated");
        }
    }
}

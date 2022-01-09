/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class ImageDownloader extends Thread
{
    CountDownLatch latch;
    ImageDownloader(CountDownLatch latch)
    {
        this.latch = latch;
    }
    public void run()
    {
        System.out.println("Downloading image");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Downloading image complete");
        this.latch.countDown();
    }
}
class AllImageProcessor extends Thread
{
    CountDownLatch latch;
    AllImageProcessor(CountDownLatch latch)
    {
        this.latch = latch;
    }
     public void run()
    {
        System.out.println("Try to process all image");
        try {
            System.out.println("Wait");
            this.latch.await();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Now processing all image completed ");
        
    }
}
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        Thread[] imageDownloader = new ImageDownloader[5];
        
        AllImageProcessor processor = new AllImageProcessor(cdl);
        processor.start();
        
        for (int i = 0; i < 5; i++) {
            imageDownloader[i] = new ImageDownloader(cdl);
            imageDownloader[i].start();
        }
    }
}

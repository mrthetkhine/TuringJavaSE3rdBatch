/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

/**
 *
 * @author thetkhine
 */
class Data{
    int count = 0;
}
class IncThread extends Thread
{
    Data data;
    IncThread(Data data)
    {
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 10000; i++) {
            
                synchronized(data)
                {
                    data.count ++;   
                }
                
                
        }
    }
}
class DecThread extends Thread
{
    Data data;
    DecThread(Data data)
    {
        this.data = data;
    }
    public void run()
    {
        for (int i = 0; i < 10000; i++) {
              synchronized(data)//
              {
                  data.count --;
              }
                
           
        }
    }
}
public class SynchronizationProblem {
    public static void main(String[] args) {
        
        Data data = new Data();
        
        IncThread inc = new IncThread(data);
        DecThread dec = new DecThread(data);
        
        inc.start();
        dec.start();
        
        try
        {
            inc.join();
            dec.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Count "+data.count);
    }
}

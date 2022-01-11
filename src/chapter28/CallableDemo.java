/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class Sum implements Callable<Integer>
{
    int stop;
    Sum(int stop)
    {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        Integer result = 0;
        for (int i = 1; i < stop; i++) {
            result+=i;
            
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return result;
    }
    
}
public class CallableDemo {
    public static void main(String[] args) throws TimeoutException {
        ExecutorService exs = Executors.newCachedThreadPool();
        
        Future<Integer> sumResult = exs.submit(new Sum(5));
        System.out.println("Process");
        
        try {
            System.out.println("SumResult "+sumResult.get());
            //System.out.println("SumResult "+sumResult.get(100,TimeUnit.MILLISECONDS));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        }
        System.out.println("Before shutdown");
        exs.shutdown();
    }
}

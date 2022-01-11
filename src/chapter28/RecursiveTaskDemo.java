/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author thetkhine
 */
class SumTask extends RecursiveTask<Double>
{

    double vals[];
    int start,end;
    int treshold = 10;
    SumTask(double[] vals, int start, int end)
    {
        this.vals = vals;
        this.start = start;
        this.end = end;
    }
    
    @Override
    protected Double compute() {
        double sum = 0;
        if( end-start < treshold)
        {
            //compute
            System.out.println("Compute start "+start + " end "+end);
            for (int i = start; i < end; i++) {
                sum+= this.vals[i];
            }
        }
        else//divide
        {
            System.out.println("Divide ");
            int middle = (start+end)/2;
            SumTask subTask1 = new SumTask(vals, start, middle);
            SumTask subTask2 = new SumTask(vals, middle+1, end);
            
            subTask1.fork();
            subTask2.fork();
            
            sum += subTask1.join() + subTask2.join();
            
        }
        return sum;
    }
}
public class RecursiveTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        Random random = new Random();
        double arr []  = new double [300];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        SumTask task = new SumTask(arr,0,arr.length);
        System.out.println("Before invoke");
        double sum = pool.invoke(task);
        System.out.println("Sum "+ sum);
    }
}
